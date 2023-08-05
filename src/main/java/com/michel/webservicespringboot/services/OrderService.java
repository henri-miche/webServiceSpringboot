package com.michel.webservicespringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michel.webservicespringboot.entities.Order;
import com.michel.webservicespringboot.repositories.OrderRepository;


@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;
    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
