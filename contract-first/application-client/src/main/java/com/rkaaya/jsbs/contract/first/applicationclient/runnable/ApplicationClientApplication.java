package com.rkaaya.jsbs.contract.first.applicationclient.runnable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.rkaaya.jsbs.contract.first.applicationclient.configuration", "com.rkaaya.jsbs.contract.first.applicationclient.infrastructure.interfaces.rest"})
public class ApplicationClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationClientApplication.class, args);
    }

}
