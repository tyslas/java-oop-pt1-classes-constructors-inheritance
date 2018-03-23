package com.tito;

public class Car extends Vehicle {
  private int doors;
  private String engine;
  private int cylinders;
  private int gears;
  private int currGear;
  private int horsePower;
  private int twoWheelDrive;
  private int allWheelDrive;
  private String turning;


  public Car(int passengers, double cargoMass, int velocity, int acceleration, int doors, String engine, int cylinders, int gears, int currGear, int horsePower, int twoWheelDrive, int allWheelDrive, String turning) {
    super(passengers, cargoMass, velocity, acceleration);
    this.doors = doors;
    this.engine = engine;
    this.cylinders = cylinders;
    this.gears = gears;
    this.currGear = currGear;
    this.horsePower = horsePower;
    this.twoWheelDrive = twoWheelDrive;
    this.allWheelDrive = allWheelDrive;
    this.turning = turning;
  }

  public int getDoors() {
    return doors;
  }

  public String getEngine() {
    return engine;
  }

  public int getCylinders() {
    return cylinders;
  }

  public int getGears() {
    return gears;
  }

  public int getCurrGear() {
    return currGear;
  }

  public int getHorsePower() {
    return horsePower;
  }

  public int getTwoWheelDrive() {
    return twoWheelDrive;
  }

  public int getAllWheelDrive() {
    return allWheelDrive;
  }

  public String getTurning() {
    return turning;
  }

  public void decelerate(int dec) {

  }

  @Override
  public void move(int vel) {
    System.out.println("Car.move() called");
    super.move(vel);
  }

  public void shift(int upDown) {
    switch (upDown) {
      case 0:
        if (currGear == -1) {
          System.out.println("already in reverse, cannot downshift");
        } else {
            this.currGear--;
            System.out.println("downshifted to gear " + getCurrGear());
        }
        break;
      case 1:
        if (currGear == gears) {
          System.out.println("already in highest gear, cannot upshift");
        } else {
          this.currGear++;
          System.out.println("upshifted to gear " + getCurrGear());
        }
        break;
    }
  }

  public void turn(String dir) {
    switch (dir) {
      case "l":
        if (dir == this.turning) {
          System.out.println("already turning left");
        } else {
          this.turning = dir;
          System.out.println("the car is turning left");
        }
        break;
      case "s":
        if (dir == this.turning) {
          System.out.println("already going straight");
        } else {
          this.turning = dir;
          System.out.println("the car is going straight");
        }
        break;
      case "r":
        if (dir == this.turning) {
          System.out.println("already turning right");
        } else {
          this.turning = dir;
          System.out.println("the car is turning right");
        }
        break;
    }
  }
}
