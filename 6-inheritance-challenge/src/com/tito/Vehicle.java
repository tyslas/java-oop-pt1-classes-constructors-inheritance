package com.tito;

public class Vehicle {
  private String name;
  private int passengers;
  private double cargoMass;
  private int velocity;
  private int acceleration;
  private int currDirection;

  public Vehicle(String name, int passengers, double cargoMass) {
    this.name = name;
    this.passengers = passengers;
    this.cargoMass = cargoMass;
    this.velocity = 0;
    this.acceleration = 0;
    this.currDirection = 0;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPassengers() {
    return passengers; // 'this' is optional for getters
  }

  public void setPassengers(int passengers) {
    this.passengers = passengers;
  }

  public double getCargoMass() {
    return cargoMass;
  }

  public void setCargoMass(double cargoMass) {
    this.cargoMass = cargoMass;
  }

  public int getVelocity() {
    return velocity;
  }

  public void setVelocity(int velocity) {
    this.velocity = velocity;
  }

  public int getAcceleration() {
    return acceleration;
  }

  public void setAcceleration(int acceleration) {
    this.acceleration = acceleration;
  }

  public int getCurrDirection() {
    return currDirection;
  }

  public void setCurrDirection(int currDirection) {
    this.currDirection = currDirection;
  }

  public void move(int accelerate) {
    this.acceleration = accelerate;
    this.velocity += accelerate;
    System.out.println("vehicle accelerated " + this.acceleration + "mph/s \n" +
        "and now has a velocity of " + this.velocity + "mph" + "\n");
  }

  public void steer(int degrees) {
    if (degrees < -360 || degrees > 360) {
      System.out.println("cannot turn more than 360 degrees");
    } else {
      this.currDirection += degrees;
      System.out.println("steering at " + this.currDirection + " degrees from N");
    }
  }
}
