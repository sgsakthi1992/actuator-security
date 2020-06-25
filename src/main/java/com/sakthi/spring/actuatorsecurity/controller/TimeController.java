package com.sakthi.spring.actuatorsecurity.controller;

import com.sakthi.spring.actuatorsecurity.model.Time;
import com.sakthi.spring.actuatorsecurity.service.TimeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    private final TimeService timeService;

    public TimeController(final TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public ResponseEntity<Time> getTime() {
        return ResponseEntity.ok().body(timeService.getTime());
    }
}
