package com.lily.provide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: liuhongli.
 * Date: 2019/2/26
 * @author lily
 */


@RestController
public class ticketController {


	@GetMapping("/query")
	public String queryTicket(){
		return "123";
	}






	@PostMapping("/tic")
	public String cesjo(){
		return "呵呵";
	}
}
