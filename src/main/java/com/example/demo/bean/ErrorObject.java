package com.example.demo.bean;

public class ErrorObject {
	
	private String errorCode;
	private String errorMessage;
	
	public ErrorObject() {
		super();
	}
	
	public ErrorObject(String errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "ErrorObject [errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}
	
	
	
	

}
