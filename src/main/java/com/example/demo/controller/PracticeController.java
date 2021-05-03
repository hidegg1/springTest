package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.OrdersEntity;
import com.example.demo.form.ProductForm;
import com.example.demo.mapper.OrdersMapper;
import com.example.demo.service.PracticeService;


@Controller
public class PracticeController {
	@Autowired
	PracticeService practiceService;
	@Autowired
	OrdersMapper ordersMapper;
	
	ProductForm productForm;
	
	
	/**一覧画面
	 * @return　メイン画面
	 */
	@GetMapping(value="/main")
	public ModelAndView entryPage() {
		ModelAndView mv =new ModelAndView();
		List<OrdersEntity> ordersEntity = practiceService.findAll();
		mv.addObject("ordersEntity",ordersEntity);
 		mv.setViewName("main.html");
		return mv;
	}
	
	/**
	 * 更新処理
	 * @param id　
	 * @return
	 */
	@RequestMapping(value="/edit")
	public ModelAndView edit(@RequestParam("productId")int id){
		System.out.println(id);
		ModelAndView mv =new ModelAndView();
		mv.addObject("ordersEntity", ordersMapper.findOne(id));
		mv.setViewName("edit.html");
		return mv;
		
	}
	/**削除処理
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/edit/delete")
	public ModelAndView dodelete(@RequestParam("productId")int id){
		System.out.println(id);
		ModelAndView mv =new ModelAndView();
		mv.addObject("ordersEntity",ordersMapper.delete(id));
		mv.setViewName("redirect:/main");
		return mv;
		
	}
	/**新規登録処理
	 * @return
	 */
	@RequestMapping(value="/insertForm")
	public ModelAndView insert(){
		ModelAndView mv =new ModelAndView();
		mv.setViewName("insert.html");
		return mv;		
	}
	@RequestMapping(value="/doInsertForm")
	public ModelAndView doInsert(ProductForm productForm){
		ModelAndView mv =new ModelAndView();
		ordersMapper.save(productForm);
		mv.setViewName("redirect:/main");
		return mv;
	}
		
}
	


