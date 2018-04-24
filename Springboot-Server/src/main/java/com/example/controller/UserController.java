package com.example.controller;

import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserService;
import com.example.struct.User;

@RestController
public class UserController {

	// ATRIBUTES
	private @Autowired UserService userService;
	
	// CONSTRUCTORS
	
	// METHODS
	@RequestMapping(value = "/users",method = RequestMethod.GET)
	public @ResponseBody LinkedList<User> getUsers() {
		return this.userService.getAllUsersMockDB();
	}
	@RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
	public User getUserId(@PathVariable int id) {
		return this.userService.getUserByIdMockDB(id);
	}
	@RequestMapping(value = "/users",method = RequestMethod.POST)
	public void postUser(@RequestBody User user) {
		this.userService.addUserMockDB(user);
	}
	@RequestMapping(value = "/users/{id}",method = RequestMethod.PATCH)
	public void patchUserById(@RequestBody User user,@PathVariable int id) {
		this.userService.patchUserByIdMockDB(id, user);
	}
	@RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
	public void deleteUserId(@PathVariable int id) {
		this.userService.deleteUserByIdMockDB(id);
	}

	// GETTERS AND SETTERS
	
}
