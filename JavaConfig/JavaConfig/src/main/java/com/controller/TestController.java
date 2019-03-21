package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.EmployeeService;

@Controller
public class TestController {
	
	@Autowired
	private EmployeeService service;
	
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
	@RequestMapping(value = "/registerEmployee", method=RequestMethod.POST)
	public String saveEmployee()
	{
		try{
			service.save();
			return "success";
		}catch(Exception e)
		{
			e.printStackTrace();
			return "welcome";
		}
		
	}

}
