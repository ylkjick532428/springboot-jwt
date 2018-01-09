package com.qooeo.lampard.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloRest {
	
	@RequestMapping("/hello")
	String hello() {
		return "hello rest";
	}
}
