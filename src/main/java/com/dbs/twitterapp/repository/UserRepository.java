package com.dbs.twitterapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dbs.twitterapp.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	 Optional<User> findByName(String name);
	    List<User> findAll();
}
