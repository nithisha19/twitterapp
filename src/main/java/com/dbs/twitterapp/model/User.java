package com.dbs.twitterapp.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotBlank(message = "UserName cannot be null")
    @Column(name = "username", nullable = true)
	private String username;
	
	@NotBlank(message = "Password cannot be null")
    @Column(name = "password", nullable = true)
	private String password;

	private String email;
	private String city;
	private String street;
	private String state;
	private String zipcode;
	
	

	public User() {
		// TODO Auto-generated constructor stub
	}



	public User(int id,  String username, String password, String email, String city, String street,
			String state, String zipcode) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.city = city;
		this.street = street;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	
	
	
}
