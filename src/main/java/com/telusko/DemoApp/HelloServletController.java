package com.telusko.DemoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServletController {

	@RequestMapping("/")
	public String greet() {
		return "Hello Spring Boot Web Rest Controller";
	}
	
	@GetMapping("/greetings/{username}")
	public String getGreetings(@PathVariable("username") String userName) {
	    return "Hello " + userName + ", Good day...!!!";
	}
}
