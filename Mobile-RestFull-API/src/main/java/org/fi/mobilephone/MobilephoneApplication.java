package org.fi.mobilephone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"org.fi.mobilephone.controller","org.fi.mobilephone.services"})
@EntityScan(basePackages = {"org.fi.mobilephone.entity"})
@EnableJpaRepositories(basePackages = {"org.fi.mobilephone.repository"})
public class MobilephoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilephoneApplication.class, args);
	}

}
