package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.OrdersEntity;
import com.example.demo.form.ProductForm;


@Mapper
public interface OrdersMapper {
	public List<OrdersEntity> selectAll();
	
	public OrdersEntity findOne(int id);
	
	public OrdersEntity delete(int id);
	
	void save(ProductForm productForm);

}
