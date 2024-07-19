package com.rkaaya.jsbs.contract.first.applicationserver.infrastructure.interfaces.rest;

import com.rkaaya.jsbs.contract.first.applicationserver.infrastructure.application.AdventurerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.rkaaya.jsbs.contract.first.questforge.chronicles.server.api.AdventurerApi;
import com.rkaaya.jsbs.contract.first.questforge.chronicles.server.model.Adventurer;

@RestController
public class AdventurerController implements AdventurerApi {

    @Autowired
    private AdventurerService adventurerService;

    @Override
    public ResponseEntity<Adventurer> getAdventurerById(final Long id) {
        return ResponseEntity.ok(adventurerService.getAdventurerById(id));
    }

}
