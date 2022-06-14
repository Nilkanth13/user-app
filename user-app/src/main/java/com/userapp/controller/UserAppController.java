package com.userapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAppController {
	
	@GetMapping("/message")
	public String getMessage() {
		
		return "Welcome UserApp on Azure!!"; 
	}

}
