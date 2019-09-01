package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customexception.ApplicationException;

@RestController
@RequestMapping("/exception-handling")
public class TestController {
	
	@GetMapping("/custom")
	public String generateException() throws ApplicationException {
		boolean doesUserExists;

		// assume that, accessing db to fetch the required user returns false
		doesUserExists = false;
		if (doesUserExists) {
			return "USER FOUND";
		} else {
			throw new ApplicationException("ERR_USER_NOT_FOUND", "The requested user data does not exist");	
		}
	}
	
	@GetMapping("/inbuilt")
	public int generateSystemException() throws ApplicationException {
		try {
			// assume that the user provided the number "0" for divide operation, which generates inbuilt exception.
			int input = 0;
			int result = 10/input;
			return result;
		} catch (ArithmeticException e) {
			throw new ApplicationException("ERR_INVALID_DATA", "The provided denominator for division is invalid. Please provide a number other than zero.");
		} catch (Exception e) { // fall back exception handling
			throw new ApplicationException("ERR_SOME_PROBLEM_OCCURRED", "Some problem occurred in our servers. Please try again later");
		}
	}

}

