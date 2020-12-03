package com.cos.security2.web;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
	
	
	@GetMapping({"","/"})
	public String index() {
		return "index";
	}
	
	@GetMapping("loginForm")
	public String loginForm() {
		return "loginForm";
	}
	
	@GetMapping("joinForm")
	public String joinForm() {
		return "joinForm";
	}
}
