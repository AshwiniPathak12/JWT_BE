package com.yash.controller;

import javax.annotation.PostConstruct;

import com.yash.model.User;
import com.yash.service.UserService;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
//implements InitializingBean
	 @Autowired
	    private UserService userService;

	    @PostConstruct
	    public void initRoleAndUser() {
	        userService.initRoleAndUser();
	    }

	    @PostMapping({"/registerNewUser"})
	    public User registerNewUser(@RequestBody User user) {
	        return userService.registerNewUser(user);
	    }

	    @GetMapping({"/forAdmin"})
	    @PreAuthorize("hasRole('Admin')")
	    public String forAdmin(){
	        return "This URL is only accessible to the admin";
	    }

	    @GetMapping({"/forUser"})
	    @PreAuthorize("hasRole('User')")
	    public String forUser(){
	        return "This URL is only accessible to the user";
	    }
}
