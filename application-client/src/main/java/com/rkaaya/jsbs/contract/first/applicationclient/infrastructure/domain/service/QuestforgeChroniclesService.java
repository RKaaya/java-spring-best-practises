package com.rkaaya.jsbs.contract.first.applicationclient.infrastructure.domain.service;

import com.rkaaya.jsbs.contract.first.domain.model.Quest;
import com.rkaaya.jsbs.contract.first.questforge.chronicles.client.api.AdventurerApi;
import com.rkaaya.jsbs.contract.first.questforge.chronicles.client.api.QuestApi;
import com.rkaaya.jsbs.contract.first.questforge.chronicles.client.model.Adventurer;

public class QuestforgeChroniclesService {

    private AdventurerApi adventurerApi;
    private QuestApi questApi;

    public QuestforgeChroniclesService(final AdventurerApi adventurerApi, final QuestApi questApi) {
        this.adventurerApi = adventurerApi;
        this.questApi = questApi;
    }

    public Adventurer getAdventurer(final Long id) {
        return adventurerApi.getAdventurerById(id).block();
    }

    public Quest getQuest(final Long id) {
        return questApi.getQuestById(id).block();
    }
}
