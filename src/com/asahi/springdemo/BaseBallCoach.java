package com.asahi.springdemo;

public class BaseBallCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min on batting.......";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
	//add init method
	public void doMyStartUpStuff() {
		System.out.println("doMyStartUpStuff....");
	}
	
	//add destroy method
	public void doMyCleanUpStuff() {
		System.out.println("doMyCleanUpStuff....");
	}
}
