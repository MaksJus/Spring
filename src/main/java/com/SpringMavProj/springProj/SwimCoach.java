package com.SpringMavProj.springProj;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
   
	public SwimCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
	
	
	public String getDailyWorkOut() {
		return "Swimming 1000 meters as a warm up";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
