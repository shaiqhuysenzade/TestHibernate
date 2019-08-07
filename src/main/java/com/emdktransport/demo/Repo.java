package com.emdktransport.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo  {
	
	public void findById(int id);
	
}
