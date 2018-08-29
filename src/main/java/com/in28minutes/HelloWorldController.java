package com.in28minutes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(method=RequestMethod.GET, path="/helloworld")
	public String helloWorld() {
		return "Hellow World";
	}
	
	@GetMapping(path="/helloworldbean")
	public HelloWorld helloWorldBean() {
		return new HelloWorld("Hello world bean");
	}
}
