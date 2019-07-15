/**
 * 
 */
package com.example.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.service.UserService;

/**
 * @author monika.kolhe
 *
 */
@Service
public class UserServiceImpl implements UserService {


	@Override
	public List<User> allUser() {
		List<User> users = new LinkedList<>();
		User user1 = new User(1, "monika");
		User user2 = new User(1, "panjal");
		User user3 = new User(1, "priyanka");
		users.add(user1);
		users.add(user2);
		users.add(user3);
		return users ;
	}

}
