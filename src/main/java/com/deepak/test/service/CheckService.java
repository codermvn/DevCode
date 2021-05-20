package com.deepak.test.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.deepak.test.exception.TFSBaseException;

@Service
public class CheckService {

	public String Howdy(String input) throws TFSBaseException {
		if (input.equals("test"))	{
			Map<Integer,String> exceptionMap = new HashMap<Integer, String>();
			exceptionMap.put(new Integer(0),"I dont agree to this implementation");
			throw new TFSBaseException(exceptionMap);
		}
		return "Hi" + input;
	}
}
