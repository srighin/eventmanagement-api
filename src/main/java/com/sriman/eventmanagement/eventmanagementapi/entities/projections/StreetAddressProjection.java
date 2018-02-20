package com.sriman.eventmanagement.eventmanagementapi.entities.projections;

import com.sriman.eventmanagement.eventmanagementapi.entities.Venue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "virtual", types = {Venue.class})
public interface StreetAddressProjection {

    @Value("#{target.getStreetAddress()} #{target.getStreetAddress2()}")
    String getCompleteStreetAddress ();
}
