package com.emdktransport.demo;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.emdktransport.demo.Repo;
import com.emdktransport.demo.Test;
import com.emdktransport.demo.entites.Orders;

import antlr.collections.List;


@Component
public class TestDAO implements Repo {

	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	@Override
	public void findById(int id) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			Test test = session.get(Test.class, id);
			System.out.println("Order's id is " + id);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
