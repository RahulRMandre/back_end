package com.ss.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.ss.food.config.AppProperties;

@SpringBootApplication(scanBasePackages={"com.ss"})
@EnableConfigurationProperties(AppProperties.class)
public class FoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodApplication.class, args);
	}

}
