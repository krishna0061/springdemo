package com.springdemo.classes;

public class BaseBallCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneservice;
	
	// define a constructor foe dependency injection
	public BaseBallCoach(FortuneService theFortuneService)
	{
		fortuneservice = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout(){
	
	return"spend 300 mins in batting practice";
}

	@Override
	public String getDailyFortune() {
		
		return fortuneservice.getFortune();
	}
}