package com.example.demo.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import com.example.demo.entity.Pay;
import com.example.demo.mapper.PayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@Autowired
	PayMapper payMapper;
	
	@RequestMapping
	public String index(Model model) {
		List<Pay> list = payMapper.selectAll();
		model.addAttribute("pay",list);
		return "index";
	}
	
}
