package com.restpractice.RestPractice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;

@Entity
public class App_User extends AbstractEntity{
    String username;
    String name;
    @JsonIgnore
    String hashed_password;

    //==========Constructor==========
    public App_User(String username, String name, String hashed_password){
        this.username = username;
        this.name = name;
        this.hashed_password = hashed_password;
    }
    //==========Getters and Setters==========
    public String getUsername(){return this.username;}
    public String getName(){return this.name;}
    public void setUsername(String username){this.username = username;}
    public void setName(String name){this.name = name;}
    public void setPassword(String password){this.hashed_password = password;}
}
