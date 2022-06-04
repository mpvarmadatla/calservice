package com.village.demo.service;

import org.springframework.stereotype.Service;

import com.village.demo.data.Request;
import com.village.demo.data.Response;

@Service
public class SayHelloService {
  public Response  sayHello(Request request) {
	  Response response = new Response();
		response.setGreetings("hello "+request.getFirstName()+" " +request.getLastName());
	    return response;  
  }
}
