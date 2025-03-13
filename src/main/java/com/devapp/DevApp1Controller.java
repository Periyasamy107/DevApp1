package com.devapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/devapp1")
public class DevApp1Controller {
	@GetMapping(value = "/name")
	public String getName() {
		return "My Name is Biggod";
	}
}
