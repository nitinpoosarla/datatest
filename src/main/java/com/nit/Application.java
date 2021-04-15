package com.nit;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@RequestMapping("/data")
	public String Demo()
	{
		return "helloworl";
	}
	
}
