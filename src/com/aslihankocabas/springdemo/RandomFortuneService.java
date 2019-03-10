package com.aslihankocabas.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"15 minutes",
			"Go running",
			"Rest"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {	
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
