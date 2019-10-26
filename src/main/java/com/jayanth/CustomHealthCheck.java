package com.jayanth;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthCheck implements HealthIndicator{

	private int errorCode = 0;
	
	@Override
	public Health health() {
		// TODO Auto-generated method stub
		System.out.println("Error code :"+errorCode);
		
		if(errorCode > 4 && errorCode < 8) {
			errorCode++;
			return Health.down().withDetail("Custom Error Code", errorCode).build();
		}
		else {
			errorCode++;
			return Health.up().build();
		}
	}

}
