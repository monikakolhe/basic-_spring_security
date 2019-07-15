/**
 * 
 */
package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserService;

/**
 * @author monika.kolhe
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getAllUser")
	public ResponseEntity<?> getAllUser()
	{
		return new ResponseEntity<>(this.userService.allUser(),HttpStatus.OK);
	}
}
