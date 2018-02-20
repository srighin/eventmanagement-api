package com.sriman.eventmanagement.eventmanagementapi.controllers;

import com.sriman.eventmanagement.eventmanagementapi.entities.Participant;
import com.sriman.eventmanagement.eventmanagementapi.exceptions.AlreadyCheckedInException;
import com.sriman.eventmanagement.eventmanagementapi.repos.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping("/events")
public class CheckInController {

    @Autowired
    private ParticipantRepository participantRepository;

    @RequestMapping("/checkin/{id}")
    public ResponseEntity<PersistentEntityResource> checkIn(@PathVariable Long id, PersistentEntityResourceAssembler assembler ){
        Participant participant = participantRepository.findOne(id);
        if (participant != null){
            if (participant.getCheckedIn()){
                throw new AlreadyCheckedInException();
            }
            participant.setCheckedIn(true);
            participantRepository.save(participant);
        }
        return ResponseEntity.ok(assembler.toResource(participant));
    }
}
