package org.example;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import org.example.vehicle.Vehicle;
import org.example.customer.Customer;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Jan", "Kowalski", "676676767", "janekowalski@gmail.com");
        System.out.println(customer.getFullName());

        Vehicle audi = new Vehicle("AUDI","A5",2007, "WK 20452","WAUZZZ123456789");
        Vehicle bmw = new Vehicle("BMW","M4 COMPETITION", 2024, "WK 23024","WBAZZZ203203230");
        customer.addVehicle(audi);
        customer.addVehicle(bmw);
        for (Vehicle vehicle : customer.getVehicles()) {
            System.out.println(vehicle.getDisplayName());
        }
    }
}