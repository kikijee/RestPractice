package com.restpractice.RestPractice.service;

import com.restpractice.RestPractice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;   // auto-wires an instance of userRepository
    }

}
