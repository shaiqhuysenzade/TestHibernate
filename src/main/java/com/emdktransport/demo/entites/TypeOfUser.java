package com.emdktransport.demo.entites;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

 
import java.util.List;



@Entity
@Table(name="typeofuser")
public class TypeOfUser {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="statusofuserlist")
	private String statusofuserlist;
	@OneToMany
	private List<UserList> userlist= new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatusofuserlist() {
		return statusofuserlist;
	}
	public void setStatusofuserlist(String statusofuserlist) {
		this.statusofuserlist = statusofuserlist;
	}
	public List<UserList> getUserlist() {
		return userlist;
	}
	public void setUserlist(List<UserList> userlist) {
		this.userlist = userlist;
	}
	
	
	
}
