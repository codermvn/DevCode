package com.deepak.test.exception;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class TFSBaseException extends Exception{

	public TFSBaseException(Map<Integer, String> exceptions) {
		super();
		Exceptions = exceptions;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Map<Integer, String> Exceptions = new HashMap<>();

	public Map<Integer, String> getExceptions() {
		return Exceptions;
	}

	public void setExceptions(Map<Integer, String> exceptions) {
		Exceptions = exceptions;
	}
	
	
	
}
