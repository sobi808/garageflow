package org.example.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {
    @Test
        void shouldReturnDisplayName() {
        Vehicle vehicle = new Vehicle(
                "AUDI",
                "A5",
                2007,
                "WK 20452",
                "WAUZZZ123456789"

        );
        String result = vehicle.getDisplayName();

        assertEquals("AUDI A5 (2007)",result);
    }
}
