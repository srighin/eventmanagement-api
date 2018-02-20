package com.sriman.eventmanagement.eventmanagementapi.repos;


import com.sriman.eventmanagement.eventmanagementapi.entities.Venue;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {
}
