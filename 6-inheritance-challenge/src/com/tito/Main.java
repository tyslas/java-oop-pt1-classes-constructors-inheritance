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

    Vehicle tank = new Vehicle(4, 600, 0, 0);
    System.out.println("passengers: " + tank.getPassengers());
    System.out.println("mass transported: " + tank.getCargoMass() + "lbs");

    tank.move(25);

    Car vette = new Car(4, 600, 0, 0, 5, "electric", 0, 6, 0, 762, 0, 1, "s");

    vette.shift(1);
    vette.move(30);
    vette.shift(1);
    vette.move(30);
    vette.shift(1);
    vette.move(30);
    vette.shift(1);
    vette.move(20);
    vette.shift(1);
    vette.move(20);
    vette.shift(1);
    vette.move(20);

    Raptor raptor = new Raptor(5, 0,10, 0, 4, "ICE", 6, 10, 2, 450, 1, 1, "s", 1, 1, 1);

    raptor.move(10);
    raptor.shift(1);
    raptor.turn("r");
    raptor.turn("r");
    raptor.turn("r");
    raptor.move(-20);
    raptor.shift(0);
    raptor.shift(0);
    raptor.shift(0);
    raptor.move(-10);
    raptor.turn("l");
  }
}
