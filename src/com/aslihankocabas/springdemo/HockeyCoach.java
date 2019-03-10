package com.aslihankocabas.springdemo;

public class HockeyCoach implements Coach {

	private FortuneService fortuneService;
	
	public HockeyCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "30 minutes practice";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
}
