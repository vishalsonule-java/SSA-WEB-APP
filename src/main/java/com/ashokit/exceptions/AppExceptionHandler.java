package com.ashokit.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(NoSSNFoundException.class)
	public ResponseEntity<ApiError> handleNoSSNFoundException(){
		ApiError error= new ApiError();
		error.setCode(400);
		error.setMsg("Invalid SSN Number,please enter valid SSN Number");
		error.setDate(new Date());
		return new ResponseEntity<ApiError>(error,HttpStatus.BAD_REQUEST);
	}

}
