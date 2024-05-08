package com.example.event_management.SERVICE;
import com.example.event_management.DTO.Event_DTO;
import com.example.event_management.ENTITY.Event;
import com.example.event_management.REPOSITORY.Event_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;


@Service
public class Event_service {

    private final Event_Repository eventRepository;

    @Autowired
    public Event_service(Event_Repository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public void saveEvent(Event event) {
        eventRepository.save(event);
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    public Event updateEvent(Long id, Event_DTO updatedEvent) {
        Optional<Event> optionalEvent = eventRepository.findById(id);
        if (optionalEvent.isPresent()) {
            Event event = optionalEvent.get();
            // Update event properties with the updatedEvent data
            event.setName(updatedEvent.getName());
            event.setDepartment(updatedEvent.getDepartment());
            event.setVenue(updatedEvent.getVenue());
            event.setTime(updatedEvent.getTime());
            event.setLastdate(updatedEvent.getLastdate());
            event.setRegistrationlink(updatedEvent.getRegistrationlink());
            return eventRepository.save(event);
        }
        return null; // Event with given id not found
    }
}