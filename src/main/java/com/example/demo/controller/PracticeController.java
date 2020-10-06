package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.OrdersEntity;
import com.example.demo.mapper.OrdersMapper;
import com.example.demo.service.PracticeService;


@Controller
public class PracticeController {
	@Autowired
	PracticeService practiceService;
	@Autowired
	OrdersMapper ordersMapper;
	
	
	@GetMapping(value="/main")
	public ModelAndView entryPage() {
		ModelAndView mv =new ModelAndView();
//		List<UserEntity> userEntity = bookMngMapper.slectAll();
//		System.out.println();
//		mv.addObject("userEntity",userEntity);
		List<OrdersEntity> ordersEntity = ordersMapper.selectAll();
		mv.addObject("ordersEntity",ordersEntity);
 		mv.setViewName("main.html");
		return mv;
	}
	@RequestMapping(value="/edit")
	public ModelAndView edit(@RequestParam("productId")int id){
		System.out.println(id);
		ModelAndView mv =new ModelAndView();
		mv.addObject("ordersEntity", ordersMapper.findOne(id));
		mv.setViewName("edit.html");
		return mv;
		
	}

}
