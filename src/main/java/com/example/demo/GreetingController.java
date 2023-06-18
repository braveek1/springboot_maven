package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value("${hi:null}")
	private String hi;
	
	@GetMapping("/hi")
	public ResponseEntity<String> greeting(){
		
		return new ResponseEntity<>(hi,HttpStatus.OK);
	}
}
