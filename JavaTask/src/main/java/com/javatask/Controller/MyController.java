package com.javatask.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatask.model.Entity;
import com.javatask.services.MyService;

@RestController
public class MyController {
	
	@Autowired
	private MyService myService;

	@PostMapping("random")
	public int[] GetValues(@RequestBody Entity entity)
	{
		return myService.getRandomNumbers(entity);
	}
		
	
}
