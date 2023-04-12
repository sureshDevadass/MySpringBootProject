package com.student.globalExceptio;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.student.customException.AgeException;

@RestControllerAdvice
public class ExceptionHandling {
	@ExceptionHandler(AgeException.class)
	public ResponseEntity<Object> ageException(){
		
		return new ResponseEntity<Object>("Age is Less than 18",HttpStatus.BAD_REQUEST);
	}
	

}
