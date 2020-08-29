package com.test.business.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.test.business"})
@ConfigurationProperties
@ComponentScan("com.test.business")
@EnableJpaRepositories(basePackages = "com.test.business.repository")
@EntityScan( basePackages = "com.test.business.entity" )
//@EnableTransactionManagement
public class Application {
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }


}
