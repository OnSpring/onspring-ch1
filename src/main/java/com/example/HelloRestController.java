package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // ①
public class HelloRestController {
	@RequestMapping // ②
	public String sayHello() {
		return "Hello, world!";
	}
}
