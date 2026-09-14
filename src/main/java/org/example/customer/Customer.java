package org.example.customer;
import java.util.ArrayList;
import java.util.List;
import org.example.vehicle.Vehicle;

public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private List<Vehicle> vehicles;

    public Customer(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.vehicles = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
