package com.emdktransport.demo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
@Autowired
Repo repo;
	

public void findbysurname()
{
	
	repo.findById(1);
}

}
