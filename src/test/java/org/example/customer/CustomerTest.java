package org.example.customer;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.example.vehicle.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    void shouldReturnFullName() {

        Customer customer = new Customer(
                "Jan",
                "Kowalski",
                "123456789",
                "janekowalski@gmail.com"

        );

        String result = customer.getFullName();

        assertEquals("Jan Kowalski", result);
    }
    @Test
    void shouldAddVehicleToCustomer() {
        Customer customer = new Customer(
                "Jan",
                "Kowalski",
                "123456789",
                "janekowalski@gmail.com"

        );

        Vehicle vehicle = new Vehicle(
                "AUDI",
                "A5",
                2007,
                "WK 20452",
                "WAUZZZ123456789"

        );
        customer.addVehicle(vehicle);

        assertEquals(1, customer.getVehicles().size());
    }
    @Test
    void shouldContainAddedVehicle() {
        Customer customer = new Customer(
                "Jan",
                "Kowalski",
                "123456789",
                "janekowalski@gmail.com"

        );
        Vehicle vehicle = new Vehicle(
                "AUDI",
                "A5",
                2007,
                "WK 20452",
                "WAUZZZ123456789"

        );
        customer.addVehicle(vehicle);
        assertTrue(customer.getVehicles().contains(vehicle));
    }
}