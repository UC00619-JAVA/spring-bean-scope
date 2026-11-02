UC00619 — Desenvolvimento em Java — Sessão 10
Exercício 4 — Escopos e ciclo de vida
Projeto: scopes  ·  Spring Boot 4.1.2  ·  Java 21  ·  Maven · sem Spring Web
================================================================

RESULTADO ESPERADO

    INFO ... TicketMachine     : 1. Constructor: TicketMachine created
    INFO ... TicketMachine     : 2. @PostConstruct: TicketMachine ready
    INFO ... ScopesApplication : Started ScopesApplication in 0.9 seconds
    INFO ... ScopesApplication : Tickets: #1 and #2
    INFO ... ScopesApplication : Same ticket? false
    INFO ... ScopesApplication : Same machine? true
    INFO ... TicketMachine     : 3. @PreDestroy: TicketMachine shutting down

Repara: a TicketMachine é criada ao arrancar; os Ticket só quando são pedidos.
O @PreDestroy corre quando a aplicação termina (o contentor é fechado).
