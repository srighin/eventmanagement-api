package com.sriman.eventmanagement.eventmanagementapi.repos;

import com.sriman.eventmanagement.eventmanagementapi.entities.Participant;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {
}
