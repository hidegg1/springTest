package com.example.demo.jpaInterface;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.OrdersEntity;


public interface PracticeInterface extends JpaRepository<OrdersEntity,Integer> {

}
