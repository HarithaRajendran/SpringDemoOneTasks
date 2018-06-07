package com.asahi.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You have good luck today..:-)";
	}

}
