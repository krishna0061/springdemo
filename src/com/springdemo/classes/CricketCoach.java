package com.springdemo.classes;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	// add new feilds emailaddress and team
	private String emailaddress;
	private String team;

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		System.out.println("Cricketcoach : inside setter method - setemailaddress");
		this.emailaddress = emailaddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricketcoach : inside setter method - setteam");
		this.team = team;
	}

	// create no argument constructor
	public CricketCoach() {
		System.out.println("Cricketcoach : inside no arg costructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricketcoach : inside setter method - setFortuneSrvice");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "practise to bat for 10 overs and imprive blowing skills";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
