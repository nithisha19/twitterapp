package com.dbs.twitterapp.service;

import java.util.List;
import com.dbs.twitterapp.model.User;

public interface UserService {

	User saveEmployee(User user);

    List<User> listAll();

    User findById(long userId);

    void deleteUser(long userId);
}
