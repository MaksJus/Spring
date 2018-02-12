package com.SpringMavProj.springProj;

import org.springframework.stereotype.Component;

@Component
public class tennisCoach implements Coach {

	public String getDailyWorkOut() {
		return "tennis working out";
	}
	
	public String getDailyFortune()
	{
		return "tennis daily fortune";
	}

}
