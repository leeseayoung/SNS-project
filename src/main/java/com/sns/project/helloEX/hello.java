package com.sns.project.helloEX;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Controller
public class hello {

	@ResponseBody
	@GetMapping("/hello")
	public String hello() {


		return "Hello world!";
	}
	
	
	
	@GetMapping("/hello/jsp")
	public String helloJsp() {
		
		return "/hello/hello";
	}
	
}
