package com.rkaaya.jsbs.contract.first.applicationserver.infrastructure.application;

import com.rkaaya.jsbs.contract.first.domain.model.Quest;
import com.rkaaya.jsbs.contract.first.questforge.chronicles.server.model.Adventurer;
public class AdventurerService {

    public Adventurer getAdventurerById(final Long id) {
        final Adventurer adventurer = new Adventurer();
        adventurer.setId(id);
        adventurer.setName("Adventurer " + id);
        adventurer.setBackground("Adventurer " + id + " background");
        adventurer.setActiveQuest(Quest.builder()
                .id(1L)
                .name("Super Quest")
                .description("Testing purpose.")
                .build());
        return adventurer;
    }
}
