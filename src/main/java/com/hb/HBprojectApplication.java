package com.hb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
public class HBprojectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(HBprojectApplication.class, args);
		// changes to SCL-134 done
		context.close();
	}

}
