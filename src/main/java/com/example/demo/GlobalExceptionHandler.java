package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.bean.ErrorObject;
import com.example.demo.customexception.ApplicationException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ApplicationException.class)
	public ResponseEntity<Object> resourceNotFoundHandler(ApplicationException ex) {
		ErrorObject errorObject = new ErrorObject(ex.getErrorCode(), ex.getErrorMessage());
		
		// Returning a status code of 200 as this is a business logic error, not a HTTP request error.
		return new ResponseEntity<Object>(errorObject, HttpStatus.OK);
	}
	
}
