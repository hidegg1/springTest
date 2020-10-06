package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.OrdersEntity;


@Mapper
public interface OrdersMapper {
	public List<OrdersEntity> selectAll();
	
	public OrdersEntity findOne(int id);

}
