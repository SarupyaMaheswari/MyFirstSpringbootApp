package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstHelloController {
	
	@GetMapping("/firsthello")
	public String firstHello()
	{
		return "Hi,This is the first application which is deployed in GCP for the first time";
	}

}
