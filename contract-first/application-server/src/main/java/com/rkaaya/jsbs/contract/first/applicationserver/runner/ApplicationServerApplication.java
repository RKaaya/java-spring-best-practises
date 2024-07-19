package com.rkaaya.jsbs.contract.first.applicationserver.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.rkaaya.jsbs.contract.first.applicationserver.configuration", "com.rkaaya.jsbs.contract.first.applicationserver.infrastructure.interfaces.rest"})
public class ApplicationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationServerApplication.class, args);
    }

}
