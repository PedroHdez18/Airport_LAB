package es.ull.passengers;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import es.ull.flights.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PassengerTest {

    private Passenger passenger;
    private Flight flight;

    @BeforeEach
    void setup() {
        passenger = new Passenger("12345", "John Doe", "US");
        flight = new Flight("AA123", 100);
    }

    @Test
    void testGetIdentifier() {
        assertEquals("12345", passenger.getIdentifier());
    }

    @Test
    void testGetName() {
        assertEquals("John Doe", passenger.getName());
    }

    @Test
    void testGetCountryCode() {
        assertEquals("US", passenger.getCountryCode());
    }

    @Test
    void testJoinFlight() {
        passenger.joinFlight(flight);
        assertEquals(flight, passenger.getFlight());
    }

    @Test
    void testToString() {
        String expected = "Passenger John Doe with identifier: 12345 from US";
        assertEquals(expected, passenger.toString());
    }
}