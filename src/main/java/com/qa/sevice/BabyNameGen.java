package com.qa.sevice;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.qa.constants.BabyNameConstants;;

@Service
public class BabyNameGen {


	public String generateBabyName(int length, String toStart) {
		if (length < 12) {
		int n = length - toStart.length();
		int a = BabyNameConstants.Letters.length();
		
		StringBuilder sb = new StringBuilder();
		
		Random r = new Random();
		
//		r.nextInt(a)
		
		for (int i = 0; i < n; i++) {
			sb.append(BabyNameConstants.Letters.charAt(0));
		}
		
		String str = sb.toString();
		
		//str = str.toLowerCase();
		
		String name = toStart + str;
		
		String fs = name.substring(0,1).toUpperCase() + name.substring(1);
		
		
		return str;
		
		
		}
		
		else return BabyNameConstants.NAME_TOO_LONG;
			
	}

}
