package com.example.scopes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component   // singleton (the default scope): only ONE TicketMachine
public class TicketMachine {

    private static final Logger log = LoggerFactory.getLogger(TicketMachine.class);

    public TicketMachine() {
        log.info("1. Constructor: TicketMachine created");
    }

    @PostConstruct
    public void start() {
        log.info("2. @PostConstruct: TicketMachine ready");
    }

    @PreDestroy
    public void stop() {
        log.info("3. @PreDestroy: TicketMachine shutting down");
    }
}
