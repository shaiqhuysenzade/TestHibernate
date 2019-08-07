package com.emdktransport.demo;

import org.springframework.beans.factory.annotation.Autowired;

import com.emdktransport.demo.Repo;

@org.springframework.stereotype.Service
public class Service {

	
	@Autowired
	Repo repo;
	
	
	public void getbyusername() {
		repo.findById(1);
	}
	
}
