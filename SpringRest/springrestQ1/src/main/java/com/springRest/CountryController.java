package com.springRest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController 
{
	@RequestMapping("/hello.html")
	public String getHello()
	{
		return "HelloWorld!";
	}
	
}
