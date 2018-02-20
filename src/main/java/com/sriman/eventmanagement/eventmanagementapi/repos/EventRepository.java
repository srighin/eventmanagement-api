package com.sriman.eventmanagement.eventmanagementapi.repos;

import com.sriman.eventmanagement.eventmanagementapi.entities.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;


public interface EventRepository extends PagingAndSortingRepository<Event, Long> {
    //List<Event> findByName(@Param("name") String name);
    Page<Event> findByName(@Param("name") String name, Pageable pageable);
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    void delete(Long id);
}
