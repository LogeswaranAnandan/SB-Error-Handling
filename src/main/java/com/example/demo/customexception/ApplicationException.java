package com.example.demo.customexception;

public class ApplicationException extends Exception {
	
	protected String errorCode;
	protected String errorMessage;
	
	public ApplicationException() {
		super();
	}
	
	public ApplicationException(String errorCode, String errorMessage) {
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
		return "ApplicationException [errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}

	
	
}
