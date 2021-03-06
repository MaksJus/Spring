package com.SpringMavProj.springProj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration     //Configuration annotation used for indicating configuration class
@ComponentScan("com.SpringMavProj.springProj")  // Component package scan

public class SportConfig {

// define bean for our sad fortune service
@Bean
public FortuneService sadFortuneService()
{
	return new SadFortuneService();
}
	
// define bean for our swim coach and inject dependency
@Bean
public Coach swimCoach()
{
   return new SwimCoach(sadFortuneService());	
}


}

	

