package com.example.demo.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Users;
import com.example.demo.services.impl.UsersServiceFeign;

@RestController
public class UsersController {
	
	@Autowired
	private UsersServiceFeign usersServiceFeign;
	
	@GetMapping("/listar")
	public List<Users> getAllUsers(){
		return usersServiceFeign.getAllUser();
	}
}
