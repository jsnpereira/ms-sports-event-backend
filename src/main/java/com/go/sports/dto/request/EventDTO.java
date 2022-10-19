package com.go.sports.dto.request;

import com.go.sports.enums.EventType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Setter
@Getter
@NoArgsConstructor
public class EventDTO {
    private String id;
    @NotNull
    @NotEmpty
    @Size(min = 10, max = 30)
    private String title;
    @NotNull
    @NotEmpty
    @Size(min = 10, max = 200)
    private String description;
    @NotNull
    private EventType eventType;
}
