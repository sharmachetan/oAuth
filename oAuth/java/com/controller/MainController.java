package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {
	
	@RequestMapping(value="/a")
	public String get(){
		return "working";
	}
}
