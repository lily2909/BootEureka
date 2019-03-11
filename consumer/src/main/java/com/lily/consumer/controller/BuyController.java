package com.lily.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * Author: liuhongli.
 * Date: 2019/2/26
 * @author lily
 */

@Controller
public class BuyController {
	@Autowired
	RestTemplate restTemplate;


	@RequestMapping("/tic")
	@ResponseBody
	public String buy(){
		String s = restTemplate.getForObject("http://provider-ticket/query", String.class);
		return "购买了"+s;
	}

	@RequestMapping("/buy")
	@ResponseBody
	public String tic(){
		String s = restTemplate.postForObject("http://provider-ticket/tic",null, String.class);
		return "购买了"+s;
	}
}
