package com.deepak.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Greeting {
	private String content;
	private long id;

	public Greeting(long incrementAndGet, String format) {
		this.id = incrementAndGet;
		this.content = format;
	}

}
