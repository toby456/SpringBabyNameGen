package com.qa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.sevice.BabyNameGen;

@RequestMapping("/babyname")
@RestController
@CrossOrigin
public class BabyNameEndpoint {
	
	@Autowired
	private BabyNameGen service;
	
	@PostMapping("/create/{length}/{toStart}")
	public String createBabyName(@PathVariable ("length") int length, @PathVariable ("toStart") String toStart) {
		return service.generateBabyName(length, toStart);
	}
	
	
}
