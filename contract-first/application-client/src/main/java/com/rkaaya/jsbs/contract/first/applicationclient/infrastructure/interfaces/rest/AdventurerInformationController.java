package com.rkaaya.jsbs.contract.first.applicationclient.infrastructure.interfaces.rest;

import com.rkaaya.jsbs.contract.first.applicationclient.infrastructure.domain.service.QuestforgeChroniclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.rkaaya.jsbs.contract.first.questforge.chronicles.client.model.Adventurer;

@RestController
public class AdventurerInformationController {

    @Autowired
    private QuestforgeChroniclesService questforgeChroniclesService;

    @GetMapping("/information/adventurer/{id}")
    public ResponseEntity<Adventurer> getAdventurerById(@PathVariable("id") final Long id) {
        return ResponseEntity.ok(questforgeChroniclesService.getAdventurer(id));
    }

}
