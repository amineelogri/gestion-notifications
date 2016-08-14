package com.nomApplication.persistance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NomModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String attributNotification;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAttributNotification() {
		return attributNotification;
	}

	public void setAttributNotification(String attributNotification) {
		this.attributNotification = attributNotification;
	}

	public NomModel(Long id, String attributNotification) {
		super();
		this.id = id;
		this.attributNotification = attributNotification;
	}

	public NomModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
