package com.example.scopes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopesApplication {

    private static final Logger log = LoggerFactory.getLogger(ScopesApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ScopesApplication.class, args);

        Ticket first = context.getBean(Ticket.class);
        Ticket second = context.getBean(Ticket.class);

        log.info("Tickets: #{} and #{}", first.getNumber(), second.getNumber());
        log.info("Same ticket? {}", first == second);

        TicketMachine machine1 = context.getBean(TicketMachine.class);
        TicketMachine machine2 = context.getBean(TicketMachine.class);
        log.info("Same machine? {}", machine1 == machine2);
    }
}
