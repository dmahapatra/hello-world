package com.test.controller;

import java.io.Serializable;

public class OutputObject implements Serializable {
	private String message;
	
	public OutputObject(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OutputObject [message=").append(message).append("]");
		return builder.toString();
	}
	
}
