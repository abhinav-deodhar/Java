package org.constructorpractise1;

public class Car {
    private double topSpeed;
    private String color;
    private String model;
    private int wheels;


    //Getter and setter methods
    public void setColor(String color) {
        this.color = color;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

   //Constructor
   public Car(){
       System.out.println("The constructor was called");
   }
   //this will be called automatically

    //Argumented constructor
    public Car(double topSpeed,String color,String model, int wheels){
        this.setWheels(wheels);
        this.setTopSpeed(topSpeed);
        this.setColor(color);
        this.setModel(model);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

}
