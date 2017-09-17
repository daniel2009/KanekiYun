package com.vsbm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vsbm.entity.User;
import com.vsbm.repository.UserRepository;

@RestController
public class RestResource {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/signup")
	public void signupUser(@RequestBody User user) {
		userRepository.save(user);
	}

}
