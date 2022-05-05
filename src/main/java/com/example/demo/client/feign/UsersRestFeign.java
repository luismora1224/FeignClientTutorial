package com.example.demo.client.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.Users;

@FeignClient(name="users", url="https://jsonplaceholder.typicode.com")
public interface UsersRestFeign {
	
	@GetMapping("/users")
	public List<Users> getAllUsers();
}
