package com.eternity.springSecurity.repo;

import com.eternity.springSecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
