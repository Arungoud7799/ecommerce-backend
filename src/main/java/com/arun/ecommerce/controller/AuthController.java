package com.arun.ecommerce.controller;


import com.arun.ecommerce.entity.User;
import com.arun.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {

        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        return userService.login(
                user.getEmail(),
                user.getPassword()
        );
    }
}