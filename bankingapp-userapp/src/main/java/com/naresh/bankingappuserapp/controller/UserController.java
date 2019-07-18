package com.naresh.bankingappuserapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.bankingappuserapp.model.User;

@RestController
@RequestMapping("api/users")
public class UserController {

	@GetMapping
	public List<User> list(){
		List<User> users = new ArrayList<>();
		users.add(new User(1,"Naresh","naresh@gmail.com","pass123"));
		users.add(new User(2,"Adam","adam@gmail.com","pass123"));
		return users;
	}
}
