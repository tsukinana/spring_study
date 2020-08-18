package com.example.demo.controller;

import java.util.List;
import com.example.demo.entity.Pay;
import com.example.demo.mapper.PayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.example.util.LogUtils;

@RestController
public class IndexController {
	@Autowired
	PayMapper payMapper;
	
	@RequestMapping(value="gettest",method=RequestMethod.GET)
	public List<Pay> index(@ModelAttribute Inputter inp) {
		List<Pay> list = payMapper.selectAll();
		//LogUtils.trace("trace");
		//LogUtils.debug("debug");
		LogUtils.info(inp.toString());
		//LogUtils.warn("warn");
		//LogUtils.error("error");
		//model.addAttribute("pay",list);
		return list;
	}
	
}
