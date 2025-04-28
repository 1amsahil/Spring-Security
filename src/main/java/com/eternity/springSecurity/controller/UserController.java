package com.eternity.springSecurity.controller;

import com.eternity.springSecurity.model.User;
import com.eternity.springSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("register")
    public User register(@RequestBody User user)
    {
        return service.saveUser(user);
    }

}
