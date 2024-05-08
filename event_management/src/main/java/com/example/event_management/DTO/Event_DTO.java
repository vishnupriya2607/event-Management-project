package com.example.event_management.DTO;

import com.example.event_management.ENTITY.Event;
import lombok.*;

@Getter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class Event_DTO {

    private String name;
    private String department;
    private String venue;
    private String time;
    private String lastdate;
    private String registrationlink;
    // Getters and setters for all fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getLastdate() {
        return lastdate;
    }

    public void setLastdate(String lastdate) {
        this.lastdate = lastdate;
    }
    public String getRegistrationlink() {
        return registrationlink;
    }

    public void setRegistrationlink(String registrationlink) {
        this.registrationlink = registrationlink;
    }

}