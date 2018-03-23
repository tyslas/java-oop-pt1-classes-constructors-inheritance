package com.tito;

public class Main {

  public static void main(String[] args) {
    // Challenge:
    // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
    // Finally, create another class, a specific type of Car that inherits from the Car class.
    // You should be able to handle steering, changing gears, and moving (speed in other words).
    // You will want to decide where to put the appropriate state and behaviours (fields and methods).
    // As mentioned above, changing gears, increasing/decreasing speed should be included.
    // For your specific type of vehicle you will want to add something specific for that type of car

//    Vehicle tank = new Vehicle("Panzer", 4, 600);
//    System.out.println("passengers: " + tank.getPassengers());
//    System.out.println("mass transported: " + tank.getCargoMass() + "lbs");
//
//    tank.changeVelocity(25);

    Car vette = new Car("Sting Ray", 4, 600, 2, "ICE", 8, 6, 800, 1, 0);
    System.out.println("Vette");
    vette.shift(1);
    vette.changeVelocity(30);
    vette.shift(1);
    vette.changeVelocity(30);
    vette.shift(1);
    vette.changeVelocity(30);
    vette.shift(1);
    vette.changeVelocity(20);
    vette.shift(1);
    vette.changeVelocity(20);
    vette.shift(1);
    vette.changeVelocity(20);

    Raptor raptor = new Raptor("Dream Machine",5, 0,4, "ICE", 6, 10, 450, 1, 1,  1, 1, 1);
    System.out.println("RAPTOR");
    raptor.changeVelocity(10);
    raptor.shift(1);
    raptor.steer(90);
    raptor.steer(-30);
    raptor.steer(-120);
    raptor.changeVelocity(-20);
    raptor.shift(0);
    raptor.shift(0);
    raptor.shift(0);
    raptor.changeVelocity(-10);
    raptor.steer(40);
  }
}
