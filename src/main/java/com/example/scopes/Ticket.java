package com.example.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")   // a NEW Ticket every time one is asked for
public class Ticket {

    private static int created = 0;   // shared by all tickets: how many were created
    private final int number;

    public Ticket() {
        created++;
        number = created;
    }

    public int getNumber() {
        return number;
    }
}
