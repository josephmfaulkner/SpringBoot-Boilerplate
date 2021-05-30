package com.example.restdemo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restdemo.document.data.Document;

@RestController
public class IndexController {

	@GetMapping()
	public String getIndexMessage() {
		return "usage: /docs";
	}
	
}
