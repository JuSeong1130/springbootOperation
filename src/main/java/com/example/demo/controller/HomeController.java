package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping(value="/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping(value="/operation")
	public String oper(@RequestParam int num1,@RequestParam int num2,@RequestParam String oper,Model model)
	{
	  int res=0;
	  if(oper.equals("+"))
	  {
		 res= num1+num2;
	  }
	  else  if(oper.equals("-"))
	  {
		  res= num1-num2;
	  }
	  else  if(oper.equals("*"))
	  {
		  res= num1*num2;
	  }
	  else  if(oper.equals("/"))
	  {
		  res= num1/num2;
	  }
	  model.addAttribute("res",res);
		return "operation";
	}
}
