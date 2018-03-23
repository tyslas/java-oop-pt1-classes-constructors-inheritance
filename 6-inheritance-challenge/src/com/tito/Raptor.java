package com.tito;

public class Raptor extends Car {
  private int extraTire;
  private int rollBar;
  private int engaged4WD;

  public Raptor(String name, int passengers, double cargoMass, int doors, String engine, int cylinders, int gears, int horsePower, int twoWheelDrive, int allWheelDrive, int extraTire, int rollBar, int engaged4WD) {
    super(name, passengers, cargoMass, doors, engine, cylinders, gears, horsePower, twoWheelDrive, allWheelDrive);
    this.extraTire = extraTire;
    this.rollBar = rollBar;
    this.engaged4WD = engaged4WD;
  }

  public int getExtraTire() {
    return extraTire;
  }

  public void setExtraTire(int extraTire) {
    this.extraTire = extraTire;
  }

  public int getRollBar() {
    return rollBar;
  }

  public void setRollBar(int rollBar) {
    this.rollBar = rollBar;
  }

  public int getEngaged4WD() {
    return engaged4WD;
  }

  public void setEngaged4WD(int engaged4WD) {
    this.engaged4WD = engaged4WD;
  }
}
