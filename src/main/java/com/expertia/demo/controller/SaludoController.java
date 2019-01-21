package com.expertia.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("say")
public class SaludoController {

	@GetMapping("hello")
	public String saludo() {
		return "saludo";
	}
	
}
