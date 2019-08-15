package com.codewithabhishek.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.codewithabhishek.bean"} )
@EnableJpaRepositories(basePackages = {"com.codewithabhishek.repo"} )
@ComponentScan(basePackages = "com.codewithabhishek")
public class CurdopertionwithSpringbootAndMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurdopertionwithSpringbootAndMysqlApplication.class, args);
    }

}
