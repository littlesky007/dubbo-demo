package com.btx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.btx.service.ICommandService;


@Controller
@RequestMapping("/mytest")
public class TestController {

	@Autowired
	private ICommandService commandService;
	
	@RequestMapping("/doTest")
	public @ResponseBody String dotest()
	{
		String result = commandService.doBusi("张三");
		System.out.println(result);
		return "ok";
	}
	@RequestMapping("/aa")
	public @ResponseBody String aa()
	{
		return "123";
	}
	
}
