package com.untis.sso.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.untis.sso.dao.User;
import com.untis.sso.dao.UserRepository;

@Controller
public class UserController {
	
	private UserRepository repository;

	@GetMapping("/")
	public String showSignUpForm(User user) {
		return "login-form";
	}

	@GetMapping("/login")
	public String addUser(@Valid User user) {
		User u = repository.findByName(user.getName());
		
		if(u != null && checkPasswords(user, u))
			return "example-app";
		return "login-form";

	}
	
	private boolean checkPasswords(User input, User dbUser) {
		if(input.getPassword().compare(dbUser.getPassword())) 
			return false; 
		return true;
	}

}
