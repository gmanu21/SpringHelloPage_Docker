package com.mn;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@GetMapping("/test")
	public ResponseEntity<String> getMethod(){
		return new ResponseEntity<>("Welcome to test docker app",HttpStatus.OK);
	}
}
