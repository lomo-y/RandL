package com.jeramtough.action.controller;

import com.jeramtough.jtlog3.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 11718
 */
@Controller
public class TestController extends MyController
{
	public TestController(WebApplicationContext applicationContext)
	{
		super(applicationContext);
	}
	
	@RequestMapping(value = "randl/test", method = RequestMethod.GET)
	@ResponseBody
	public String generateCaptcha(HttpServletRequest request, HttpServletResponse response)
	{
		System.out.println("中文是否乱码");
		return "中文是否乱码";
	}
}
