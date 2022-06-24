package com.jiwoo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	@GetMapping("/jiwoo")
	public String jiwoo() {
		return "azabell";
	}
}
