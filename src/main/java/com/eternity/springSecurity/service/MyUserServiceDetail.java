package com.eternity.springSecurity.service;

import com.eternity.springSecurity.model.User;
import com.eternity.springSecurity.model.UserPrincipal;
import com.eternity.springSecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserServiceDetail implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User user =  repo.findByUsername(username);

       if(user == null)
       {
           System.out.println("User Not Found");
           throw new UsernameNotFoundException("User 404");
       }
        return new UserPrincipal(user);
    }
}
