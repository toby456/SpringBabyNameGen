package com.qa.sevice;

import java.util.Random;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.qa.constants.BabyNameConstants;
import com.qa.repository.BabyNameRepo;;

public class BabyNameGen {

	@Autowired
	private BabyNameRepo bbyNameRepo;

	public String generateBabyName(int length, String toStart) {
		if (length < 12) {
		int n = length - toStart.length();
		int a = BabyNameConstants.Letters.length();
		StringBuilder sb = new StringBuilder();
		
		Random r = new Random();
		
		for (int i = 0; i < n; i++) {
			sb.append(BabyNameConstants.Letters.charAt(r.nextInt(a)));
		}
		
		String str = sb.toString();
		
		String name = toStart + str;
		
		String babyName = name.toLowerCase().substring(0,1).toUpperCase() + name.substring(1);
		
		return bbyNameRepo.createBabyName(babyName);
		
		}
		
		else return BabyNameConstants.NAME_TOO_LONG;
		
	}

}
