package es.ull.flights;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import es.ull.passengers.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FlightTest {

    private Flight flight;
    private Passenger passenger;

    @BeforeEach
    void setup() {
        flight = new Flight("AA123", 100); // Actualizado para usar el constructor correcto
        passenger = new Passenger("12345", "John Doe", "US");
    }

    @Test
    void testAddPassenger() {
        assertTrue(flight.addPassenger(passenger));
        assertEquals(1, flight.getNumberOfPassengers()); // Verifica el número de pasajeros
    }

    @Test
    void testRemovePassenger() {
        flight.addPassenger(passenger);
        assertTrue(flight.removePassenger(passenger));
        assertEquals(0, flight.getNumberOfPassengers()); // Verifica el número de pasajeros
    }

    @Test
    void testGetFlightNumber() {
        assertEquals("AA123", flight.getFlightNumber());
    }
}