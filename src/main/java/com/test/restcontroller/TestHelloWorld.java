package com.test.restcontroller;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHelloWorld {

	@RequestMapping(produces=MediaType.APPLICATION_JSON,method =RequestMethod.GET,value="/hello")
		@ResponseBody
		public String listCustomer() {
			return "hello World";
		}

	
}
