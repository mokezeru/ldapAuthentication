package com.charter.ldapAuthentication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class LoginController {

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String Login() {
		return "login";
	}
}