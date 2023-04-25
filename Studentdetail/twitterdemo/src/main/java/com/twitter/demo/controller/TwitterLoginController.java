package com.twitter.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TwitterLoginController {
	@GetMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password)
	{
		if(username.equals("admin") && password.equals("1234"))
		{
			return "success";
		}
		else
		{
			return "fail";
		}
	}

}


