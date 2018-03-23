package com.tito;

public class Vehicle {
  private int passengers;
  private double cargoMass;
  private int velocity;
  private int acceleration;

  public Vehicle(int passengers, double cargoMass, int velocity, int acceleration) {
    this.passengers = passengers;
    this.cargoMass = cargoMass;
    this.velocity = velocity;
    this.acceleration = acceleration;
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

  public void move(int accelerate) {
    this.acceleration = accelerate;
    this.velocity += accelerate;
    System.out.println("vehicle accelerated " + this.acceleration + "mph/s \n" +
        "and now has a velocity of " + this.velocity + "mph" + "\n");
  }
}
