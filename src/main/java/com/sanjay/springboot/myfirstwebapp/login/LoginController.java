package com.sanjay.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
	
@Controller
@SessionAttributes("name")
public class LoginController {
	
	private AuthenticationService authenticateservice;
	
	public LoginController(AuthenticationService authenticateservice) {
		super();
		this.authenticateservice = authenticateservice;
	}
	
	@RequestMapping(value = "login",method = RequestMethod.GET)
	public String gotoLoginpage() {
		return "login";
	}
	@RequestMapping(value = "login",method = RequestMethod.POST)
	public String gotoWelcomepage(@RequestParam String name,@RequestParam String password, ModelMap model) {
		
		if(authenticateservice.authenticate(name,password)) {
			model.put("name", name);
			model.put("password", password);
			return "welcome";
		}
		model.put("error", "please type valid password");
		return "login";
	}
}
