package com.surya.thetodoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHello() {
		return "Hello!";
	} 
	
	@RequestMapping("hello-jsp")
	public String sayHelloJsp() {
		return "hello-jsp";
	}

}
