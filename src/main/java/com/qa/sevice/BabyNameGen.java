package com.qa.sevice;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.qa.constants.BabyNameConstants;;

@Service
public class BabyNameGen {


	public String generateBabyName(int length, String toStart) {
		if (length < 12) {
		int n = length - toStart.length();
		int a = BabyNameConstants.Letters.length();
		String name = toStart;
		ArrayList letter = new ArrayList();
	
		
	
		
		for (int i = 0; i < n; i++) {
			letter.add(BabyNameConstants.Letters.charAt((int) Math.round(Math.random()*BabyNameConstants.Letters.length())));
			name += letter.get(i); 
			
		}
		
		
		return name;
		
		
		}
		
		else return BabyNameConstants.NAME_TOO_LONG;
			
	}

}
