package com.emdktransport.demo.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nameOfProduct;
	private String weightOfProduct;
	private int costByWeight;
	@OneToMany
	private List<Orders> orders= new ArrayList<Orders>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOfProduct() {
		return nameOfProduct;
	}

	public void setNameOfProduct(String nameOfProduct) {
		this.nameOfProduct = nameOfProduct;
	}

	public String getWeightOfProduct() {
		return weightOfProduct;
	}

	public void setWeightOfProduct(String weightOfProduct) {
		this.weightOfProduct = weightOfProduct;
	}

	public int getCostByWeight() {
		return costByWeight;
	}

	public void setCostByWeight(int costByWeight) {
		this.costByWeight = costByWeight;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	
	

}
