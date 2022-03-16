package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  


@RestController("mypath")
public class firstController {
	
	@GetMapping("/result")
	
	private String getMyResponse() {
		return ("Success budy");
	}
	
@GetMapping("/result1")

	private String getMyResponse1() {
		return ("duplicate budy");
	}
	
	

}
