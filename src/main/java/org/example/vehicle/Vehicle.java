package org.example.vehicle;

public class Vehicle {
    private Long id;
    private String brandName;
    private String modelName;
    private int productionYear;
    private String registrationNumber;
    private String vin;


    public Vehicle(String brandName, String modelName,  int productionYear, String registrationNumber, String vin) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.productionYear = productionYear;
        this.registrationNumber = registrationNumber;
        this.vin = vin;
    }
        public Long getId(){
            return id;
        }
        public String getBrandName(){
            return brandName;
        }
        public String getModelName(){
            return modelName;
        }
        public int getProductionYear(){
            return productionYear;
        }
        public String getRegistrationNumber(){
            return registrationNumber;
        }
        public String getVin(){
            return vin;
        }
        public String getDisplayName(){
            return brandName + " " + modelName + " (" + productionYear + ")";

    }
}
