package com.eternity.springSecurity.service;

import com.eternity.springSecurity.model.User;
import com.eternity.springSecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public User saveUser(User user)
    {
        return repo.save(user);
    }

}
