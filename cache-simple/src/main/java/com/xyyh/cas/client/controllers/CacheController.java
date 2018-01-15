package com.xyyh.cas.client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyyh.cas.client.services.CacheTestService;

@RestController
@RequestMapping("/")
public class CacheController {

	@Autowired
	private CacheTestService cacheTestService;

	@GetMapping("{id}")
	public String test(@PathVariable("id") String id) {
		return cacheTestService.get(id);
	}
}
