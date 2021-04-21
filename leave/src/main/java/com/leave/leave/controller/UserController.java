package com.leave.leave.controller;

import java.time.LocalDateTime;
import java.util.Random;

import javax.mail.MessagingException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.leave.leave.model.ApprovalInfo;
import com.leave.leave.model.User;
import com.leave.leave.service.ApproverService;
import com.leave.leave.service.UserService;

@Controller

public class UserController {
	@Autowired
	private UserService service;
	
	@Autowired
	private ApproverService appService;
	
	@GetMapping("/")
	public String home() {
		return "default";
	}
	
	@GetMapping("/register")
	public String RegisterPage(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}
	
	@PostMapping("/register")
	public String newUser(@ModelAttribute User user,HttpSession session,Model model) {
		
		User user1 = new User(user.getId(),user.getFirstName(),user.getLastName(),user.getUserName(),user.getPassword(),user.getEmail(),user.getRole(),user.getApproval());
		
		service.saveUser(user1);
		
		
			return "redirect:/";
		}
	
	@GetMapping("/userlogin")
	public String loginPage(Model model) {
		model.addAttribute("user1", new User());
		return "login";
	}
	
	@RequestMapping("/userlogin")
	public String loginProcess(@ModelAttribute User user1, Model model, HttpSession session) {
		User user2 = service.getUserDetails(user1.getUserName()).get();
		if (service.validateUser(user2, user1)) {
			
			session.setAttribute("user1", user2);
			return "home";
		} else {
			model.addAttribute("user1", new User());
			model.addAttribute("msg", "User Name or Password is incorrect");
			return "login";
		}
	}
	
	@GetMapping("/changepassword")
	public String changePassword(Model model) {
		model.addAttribute("user", new User());
		return "changepassword";
	}
	@PostMapping("/changepassword")
	public String newPassword(@ModelAttribute User user,HttpSession session,Model model) {
		
		
		
		service.UpdatePassword(user.getPassword());
		
		
			return "home";
		}
	
	@GetMapping("/applyleave")
	public String applyLeave(Model model) {
		model.addAttribute("approval", new ApprovalInfo());
		return "applyleave";
	}
	@PostMapping("/applyleave")
	public String applyLeave(@ModelAttribute ApprovalInfo approval,HttpSession session,Model model) {
		
		
		
		appService.save(approval);
		
		
			return "home";
		}
	

}
