package com.cuisines.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cuisines.service.UserService;

@Controller
@RequestMapping("api/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public Object get() {
		try {
			return new ResponseEntity<Object>(userService.findAll(), HttpStatus.OK);
		} catch (Exception e) {
		return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
}
