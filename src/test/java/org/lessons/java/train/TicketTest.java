package org.lessons.java.train;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TicketTest {

	@Test
    public void testNoDiscount() throws Exception {
        Ticket ticket = new Ticket(50, 30);
        assertEquals(10.5, ticket.calculateFinalPrice(),"errore nella creazione del biglietto base");
    }

    @Test
    public void testNegativeDistance() {
        assertThrows(Exception.class, () -> new Ticket(-50, 25), "la distanza non può essere negativa");
    }

    @Test
    public void testNegativeAge() {
        assertThrows(Exception.class, () -> new Ticket(50, -25),"l'età non può essere negativa");
    }

    @Test
    public void testUnder18Discount() throws Exception {
        Ticket ticket = new Ticket(50, 16);
        assertEquals(8.4, ticket.calculateFinalPrice(), "errore nel calcolo dello sconto under 18");
    }

    @Test
    public void testOver65Discount() throws Exception {
        Ticket ticket = new Ticket(50, 70);
        assertEquals(6.3, ticket.calculateFinalPrice(),  "errore nel calcolo dello sconto over 65");
    }

    
}
