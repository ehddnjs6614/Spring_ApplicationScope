package kr.co.softcampus.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@Autowired
	ServletContext application;

	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		
		ServletContext application = request.getServletContext();
		application.setAttribute("data1", "문자열1");
		
		return "test1";
	}
	
	@GetMapping("/result1")
	public String result1(HttpServletRequest request) {
		
		ServletContext application = request.getServletContext();
		String data1= (String)application.getAttribute("data1");
		
		System.out.printf("data1 : %s\n",data1);
		
		return "result1";
	}
}
