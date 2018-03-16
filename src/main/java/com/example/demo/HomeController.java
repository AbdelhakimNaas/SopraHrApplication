package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	   @GetMapping("/")
	    public String index() {
	        return "index";
	    }
	   @GetMapping("/home")
	    public String home() {
	        return "home";
	    }
	   @GetMapping("/Adduser")
	    public String adduser() {
	        return "/user/AddUser";
	    }
	   @GetMapping("/Addrole")
	    public String addrole() {
	        return "/user/AddRole";
	    }
	   @GetMapping("/Userlist")
	    public String userlist() {
	        return "/user/UserList";
	    }
}
