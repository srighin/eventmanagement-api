package com.sriman.eventmanagement.eventmanagementapi.repos;

import com.sriman.eventmanagement.eventmanagementapi.entities.Organizer;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {
}
