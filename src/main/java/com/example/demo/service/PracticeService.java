package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.OrdersEntity;
import com.example.demo.repository.PracticeRepository;


@Service
public class PracticeService {
	@Autowired
	PracticeRepository practiceRepository;
	
	public  List<OrdersEntity> productAll() {
		List<OrdersEntity> ordersEntity = practiceRepository.productAll();
		return ordersEntity ;

	}

}
