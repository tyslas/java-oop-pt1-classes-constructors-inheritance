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

  public Car(String name, int passengers, double cargoMass, int doors, String engine, int cylinders, int gears, int horsePower, int twoWheelDrive, int allWheelDrive) {
    super(name, passengers, cargoMass);
    this.doors = doors;
    this.engine = engine;
    this.cylinders = cylinders;
    this.gears = gears;
    this.currGear = 0;
    this.horsePower = horsePower;
    this.twoWheelDrive = twoWheelDrive;
    this.allWheelDrive = allWheelDrive;
  }

  public int getDoors() {
    return doors;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public int getCylinders() {
    return cylinders;
  }

  public void setCylinders(int cylinders) {
    this.cylinders = cylinders;
  }

  public int getGears() {
    return gears;
  }

  public void setGears(int gears) {
    this.gears = gears;
  }

  public int getCurrGear() {
    return currGear;
  }

  public void setCurrGear(int currGear) {
    this.currGear = currGear;
  }

  public int getHorsePower() {
    return horsePower;
  }

  public void setHorsePower(int horsePower) {
    this.horsePower = horsePower;
  }

  public int getTwoWheelDrive() {
    return twoWheelDrive;
  }

  public void setTwoWheelDrive(int twoWheelDrive) {
    this.twoWheelDrive = twoWheelDrive;
  }

  public int getAllWheelDrive() {
    return allWheelDrive;
  }

  public void setAllWheelDrive(int allWheelDrive) {
    this.allWheelDrive = allWheelDrive;
  }

  public void changeVelocity(int accelerate) {
    move(accelerate);
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

}
