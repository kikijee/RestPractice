package com.restpractice.RestPractice.repository;

import com.restpractice.RestPractice.entity.App_User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<App_User, Long>, JpaSpecificationExecutor<App_User> {
    App_User findByUsername(String username); // finding user by username
}
