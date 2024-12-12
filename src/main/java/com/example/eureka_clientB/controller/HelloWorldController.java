package com.example.eureka_clientB.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api")
public class HelloWorldController {

	@GetMapping("/hello-world")
	public ResponseEntity<String> getHelloWorld() {
		System.out.println("Invoking hello world");
		return ResponseEntity.status(HttpStatus.OK).body("Hello world");
	}
}
