package com.restpractice.RestPractice.controller;

import com.restpractice.RestPractice.entity.App_User;
import com.restpractice.RestPractice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/user")
public class RestController {
    @Autowired
    UserRepository userRepository;
    //@RequestMapping(value = "deeznuts",method = RequestMethod.GET)
    @GetMapping
    List<App_User> deezNuts(){
        //return "Sugon deez nuts";
        //System.out.println(userRepository.findAll().toString());
        return userRepository.findAll();
    }
}
