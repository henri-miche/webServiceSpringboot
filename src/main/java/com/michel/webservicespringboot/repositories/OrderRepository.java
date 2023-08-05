package com.michel.webservicespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michel.webservicespringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
