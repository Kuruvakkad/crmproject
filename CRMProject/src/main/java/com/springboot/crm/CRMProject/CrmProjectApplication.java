package com.springboot.crm.CRMProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@ComponentScan(basePackages={"com.springboot.crm.CRMProject.controller"})
//@EntityScan("com.springboot.crm.CRMProject.model")
//@EnableJpaRepositories("com.springboot.crm.CRMProject.repository")
@SpringBootApplication
public class CrmProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmProjectApplication.class, args);
	}

}
