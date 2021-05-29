package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET,path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-get")
	public String helloWorldGet() {
		return "Hello World Get";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}
	
	@GetMapping(path="/hello-world-bean/var/{name}")
	public HelloWorldBean helloWorldBeanPath(@PathVariable String name ){
		return new HelloWorldBean(String.format("Hello World Bean path %s", name));
	}
	
	@GetMapping(path="/hello-world-error")
	public String helloWorldGetError() {
		throw new RuntimeException("Hello World Error");
	}
}
