package com.hendisantika.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages="com")
@EntityScan(basePackages="com")
@EnableJpaRepositories(basePackages="com")
public class JwtSpringBootSecurityAngularjsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtSpringBootSecurityAngularjsApplication.class, args);
    }
}
