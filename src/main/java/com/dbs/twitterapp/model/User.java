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
    @Column(name = "user_name", nullable = true)
	private String username;
	
	@NotBlank(message = "Password cannot be null")
    @Column(name = "password", nullable = true)
	private String password;

	public User(int id, @NotBlank(message = "UserName cannot be null") String username,
			@NotBlank(message = "Password cannot be null") String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	
	
	
}
