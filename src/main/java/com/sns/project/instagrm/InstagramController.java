package com.sns.project.instagrm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class InstagramController {
	//페이지 controller
	
	
	
	
	
	@GetMapping("/join-view")
	public String joinInput() {
		
		return "instagram/join";
	}
	
	
	//로그인 페이지
	@GetMapping("/login-view")
	public String loginInput() {
		
		return "instagram/login";
	}
	
	
}
