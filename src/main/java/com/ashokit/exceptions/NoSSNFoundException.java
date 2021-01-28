package com.ashokit.exceptions;

public class NoSSNFoundException extends RuntimeException {

	
	private static final long serialVersionUID = -7592129841271709181L;
	
	public NoSSNFoundException(String msg) {
		super(msg);
	}
	
	public NoSSNFoundException() {
	//default constructor
	}

}
