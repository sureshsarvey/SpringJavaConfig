package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/")
	public String welcome()
	{
		return "welcome";
	}
	
	@GetMapping("/welcome")
	public String getwelcome()
	{
		return "welcome";
	}

}
