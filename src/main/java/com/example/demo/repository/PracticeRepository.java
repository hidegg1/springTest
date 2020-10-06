package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.OrdersEntity;
import com.example.demo.jpaInterface.PracticeInterface;

@Repository
public class PracticeRepository {
	@Autowired
	PracticeInterface practiceInterface; 
	
	public List<OrdersEntity> productAll() {
		List<OrdersEntity> ordersEntity = practiceInterface.findAll();
		return ordersEntity;
	}

}
