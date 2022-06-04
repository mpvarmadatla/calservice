package com.village.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.village.demo.data.Request;
import com.village.demo.data.Response;
import com.village.demo.service.SayHelloService;

@RestController
public class GreetingsController {

  @Autowired	
  private SayHelloService sayHelloService;
  
  @Autowired
  private Response response;
  
	@GetMapping("/sayhello")
	  Response sayHello(@RequestBody Request request) {
		if(request.getFirstName() == null || request.getLastName() == null) {
			response.setStatus("first& last names are required.");
			return response;
		}
	    return sayHelloService.sayHello(request);
	  }
}
