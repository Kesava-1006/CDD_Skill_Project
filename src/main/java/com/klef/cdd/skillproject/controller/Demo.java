package com.klef.cdd.skillproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo 
{
	@RequestMapping(path = "/",method = RequestMethod.GET)
	public String demo()
	{
		return "CDD Skill Project";
	}
	
	@GetMapping("demo/{id}")
	public String demo(@PathVariable("id") String eid)
	{
		return "Value = "+eid;
	}
}
