package com.go.sports.dto.mapper;

import com.go.sports.dto.request.EventDTO;
import com.go.sports.entity.Event;

public class EventMapper {

    public static EventDTO toDTO(Event event) {
        EventDTO eventDTO = new EventDTO();
        eventDTO.setId(event.getId());
        eventDTO.setTitle(event.getTitle());
        eventDTO.setDescription(event.getDescription());
        eventDTO.setEventType(event.getEventType());
        return eventDTO;
    }

    public static Event toModel(EventDTO eventDTO) {
        Event event = new Event();
        event.setId(eventDTO.getId());
        event.setTitle(eventDTO.getTitle());
        event.setDescription(eventDTO.getDescription());
        event.setEventType(eventDTO.getEventType());
        return event;
    }


}
