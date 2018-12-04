package com.qa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BabyName {
	
	@Id
	private String babyName;

	public BabyName() {
	}

	public BabyName(String babyName) {
		this.babyName=babyName;
	}

	public String getBabyName() {
		return babyName;
	}

	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}

	
	

	
	


}
