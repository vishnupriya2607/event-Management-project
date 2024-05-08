package com.example.event_management.CONTROLLER;
import com.example.event_management.ENTITY.Event;
import com.example.event_management.DTO.Event_DTO;
import com.example.event_management.SERVICE.Event_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@CrossOrigin
@RestController
@RequestMapping("/events")

public class Event_controller {

    private final Event_service eventService;

    @Autowired
    public Event_controller(Event_service eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveEvent(@RequestBody Event_DTO eventDTO) {
        Event event = new Event();
        event.setName(eventDTO.getName());
        event.setDepartment(eventDTO.getDepartment());
        event.setVenue(eventDTO.getVenue());
        event.setTime(eventDTO.getTime());
        event.setLastdate(eventDTO.getLastdate());
        event.setRegistrationlink(eventDTO.getRegistrationlink());
        eventService.saveEvent(event);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEvent(@PathVariable("id") Long id) {
        eventService.deleteEvent(id);
    }

    @PutMapping("/{eventId}")
    public void updateEvent(@PathVariable Long eventId, @RequestBody Event_DTO updatedEvent) {
        eventService.updateEvent(eventId, updatedEvent);
    }
    // Other CRUD operations
}