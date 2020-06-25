package com.sakthi.spring.actuatorsecurity.service;

import com.sakthi.spring.actuatorsecurity.model.Time;
import org.springframework.stereotype.Service;

@Service
public class TimeService {

    public Time getTime() {
        return new Time(System.currentTimeMillis());
    }
}
