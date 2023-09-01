package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private int numOfWheels;
   private String color;
    private float engineSize;
    private String fuelType;



     class Vehicle(int numOfWheels, String color, float engineSize, String fuelType) {
        this.numOfWheels = numOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;

    }
    public int getNumOfWheels() {
        return numOfWheels;
    }
    public String getColor(){
        return color;
    }

    public float getEngineSize() {
        return engineSize;
    }
    public String getFuelType(){
        return fuelType;
    }

    public void setNumOfWheels(int numberOfWheels) {
        this.numOfWheels = numberOfWheels;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public static void main(String[] args) {


        System.out.println("Numb of Wheels: " + car.getNumOfWheels());
        System.out.println("color: " + car.getColor());
        System.out.println("Engine size: " + car.getEngineSize());
        System.out.println("fuel type: " + car.getFuelType());






    }



}