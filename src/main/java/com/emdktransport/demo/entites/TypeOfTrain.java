package com.emdktransport.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="typeoftrain")
public class TypeOfTrain {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nameoftrain;
	private String modeloftrain;
	private int numberoftrain;
	private int statusoftrain;
	private int on_status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameoftrain() {
		return nameoftrain;
	}
	public void setNameoftrain(String nameoftrain) {
		this.nameoftrain = nameoftrain;
	}
	public String getModeloftrain() {
		return modeloftrain;
	}
	public void setModeloftrain(String modeloftrain) {
		this.modeloftrain = modeloftrain;
	}
	public int getNumberoftrain() {
		return numberoftrain;
	}
	public void setNumberoftrain(int numberoftrain) {
		this.numberoftrain = numberoftrain;
	}
	public int getStatusoftrain() {
		return statusoftrain;
	}
	public void setStatusoftrain(int statusoftrain) {
		this.statusoftrain = statusoftrain;
	}
	public int getOn_status() {
		return on_status;
	}
	public void setOn_status(int on_status) {
		this.on_status = on_status;
	}
	

}
