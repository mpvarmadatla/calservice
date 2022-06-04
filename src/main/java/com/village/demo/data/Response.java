package com.village.demo.data;

import org.springframework.stereotype.Component;

@Component
public class Response {
 private String greetings;
 private String status;

public String getGreetings() {
	return greetings;
}

public void setGreetings(String greetings) {
	this.greetings = greetings;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

}
