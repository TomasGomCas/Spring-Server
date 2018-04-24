package com.example.persistence;

import java.util.LinkedList;

import org.springframework.stereotype.Service;

import com.example.struct.User;

@Service
public class MockDB {
	
	// ATRIBUTES
	private LinkedList<User> users;
	private int users_id;
	
	// CONSTRUCTORS
	public MockDB() {
		super();
		this.users = new LinkedList<User>();
		this.users.add(new User(0, "Paco", "pacoPassword"));
		this.users.add(new User(1, "Pepe", "pepePassword"));
		this.users.add(new User(2, "Juan", "juanPassword"));
		this.users.add(new User(3, "Ana", "anaPassword"));
		this.users.add(new User(4, "Elena", "elenaPassword"));
		this.users_id = 4;
	}
	
	// METHODS
	public void addUser(User user){
		this.users_id++;
		user.setUser_id(this.users_id);
		users.add(user);
	}
	public void patchUser(int id,User user){
		for(User userLocal : this.users) {
			if(userLocal.getUser_id() == id) {
				userLocal.setUser_name(user.getUser_name());
				userLocal.setUser_password(user.getUser_password());
				}
		}
	}
	
	// GETTERS AND SETTERS
	public LinkedList<User> getUsers() {
		return users;
	}
	public User getUserById(int id){
		for(User user : this.users) {
			if(user.getUser_id() == id) return user;
		}
		return null;
	}
	public void deleteUserById(int id){
		for(User user : this.users) {
			if(user.getUser_id() == id) {
				this.users.remove(user); break;
				}
		}
	}

}
