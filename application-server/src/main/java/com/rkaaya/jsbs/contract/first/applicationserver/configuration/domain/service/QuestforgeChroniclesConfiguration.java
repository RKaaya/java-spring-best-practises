package com.rkaaya.jsbs.contract.first.applicationserver.configuration.domain.service;

import com.rkaaya.jsbs.contract.first.applicationserver.infrastructure.application.AdventurerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuestforgeChroniclesConfiguration {

    @Bean
    public AdventurerService adventurerService() {
        return new AdventurerService();
    }
}
