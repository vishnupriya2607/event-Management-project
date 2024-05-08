package com.example.event_management.REPOSITORY;

import com.example.event_management.ENTITY.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Event_Repository extends JpaRepository<Event, Long> {
    // Additional query methods can be defined here if needed
}
