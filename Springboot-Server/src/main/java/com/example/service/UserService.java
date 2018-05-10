package com.example.service;

import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.persistence.MockDB;
import com.example.struct.User;

@Service
public class UserService {

	// ATRIBUTES
	private @Autowired MockDB mockDb;
	
	// CONSTRUCTORS
	
	// METHODS
	public LinkedList<User> getAllUsersMockDB(){
		return this.mockDb.getUsers();
	}
	public User getUserByIdMockDB(int id){
		return this.mockDb.getUserById(id);
	}	
	public void addUserMockDB(User user){
		this.mockDb.addUser(user);
	} 
	public void patchUserByIdMockDB(int id,User user){
		this.mockDb.patchUser(id, user);
	}
	public void deleteUserByIdMockDB(int id){
		this.mockDb.deleteUserById(id);
	}
	
}
