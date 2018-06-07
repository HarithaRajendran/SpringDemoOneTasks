package com.asahi.springdemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	
	private String emailAddress;
	private String team;
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("In Setter of email...");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("In Setter of team...");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public CricketCoach() {
		System.out.println("In Cricket Coach...");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("In setter of cricket,,,....");
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Practise like Dhoni with a dream...";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
