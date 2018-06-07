package com.asahi.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	//For Constructor Injection...
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "run for 5k";
	}
	
	@Override
	public String getDailyFortune() {
		return "just do it:"+fortuneService.getFortune();
	}	

}
