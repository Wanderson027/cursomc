package com.nelioalves.cursomc.resource.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String FieldName;
	private String messageString;
	
	public FieldMessage() {}

	public FieldMessage(String fieldName, String messageString) {
		super();
		FieldName = fieldName;
		this.messageString = messageString;
	}

	public String getFieldName() {
		return FieldName;
	}

	public void setFieldName(String fieldName) {
		FieldName = fieldName;
	}

	public String getMessageString() {
		return messageString;
	}

	public void setMessageString(String messageString) {
		this.messageString = messageString;
	}
	
	
}
