package com.rkaaya.jsbs.contract.first.applicationclient.configuration.interfaces.rest;

import com.rkaaya.jsbs.contract.first.applicationclient.infrastructure.domain.service.QuestforgeChroniclesService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.rkaaya.jsbs.contract.first.questforge.chronicles.client.ApiClient;
import com.rkaaya.jsbs.contract.first.questforge.chronicles.client.api.AdventurerApi;
import com.rkaaya.jsbs.contract.first.questforge.chronicles.client.api.QuestApi;

@Configuration
public class QuestforgeChroniclesClientConfiguration {

    @Bean
    public ApiClient questforgeChroniclesApiClient(@Value("${questforge.chronicles.api.url}") String url) {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(url);
        return apiClient;
    }

    @Bean
    public AdventurerApi adventurerApi(final ApiClient apiClient) {
        return new AdventurerApi(apiClient);
    }

    @Bean
    public QuestApi questApi(final ApiClient apiClient) {
        return new QuestApi(apiClient);
    }

    @Bean
    public QuestforgeChroniclesService questforgeChroniclesService(final AdventurerApi adventurerApi, final QuestApi questApi) {
        return new QuestforgeChroniclesService(adventurerApi, questApi);
    }

}
