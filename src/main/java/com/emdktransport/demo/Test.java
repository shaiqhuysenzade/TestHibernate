package com.emdktransport.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test {
	
	@Id
	private int id ;
	private String name;
	private String surname;
	
}
