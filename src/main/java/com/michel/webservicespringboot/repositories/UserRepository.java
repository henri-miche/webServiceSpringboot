package com.michel.webservicespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michel.webservicespringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
