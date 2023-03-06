package com.springboot.jpa.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class User {
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	private String Name;
	
	private String About;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAbout() {
		return About;
	}

	public void setAbout(String about) {
		About = about;
	}

	public User(int id, String name, String about) {
		super();
		Id = id;
		Name = name;
		About = about;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
