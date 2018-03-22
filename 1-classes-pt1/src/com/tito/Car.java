package com.tito;

/* it is convention to capitalize the first letter of a Java class */
public class Car {
  // below defines the "state" of the Car class, defined by "fields"
  private int doors; // not accessible outside of this class
  private int wheels;
  private String model; // Strings bend the rules of Java since they are technically classes
  private String engine;
  private String color;

  /* the public methods below define the "behavior" of the Car class */
  // below is an example of a "setter"
  public void setModel(String model) {
    // add validation functionality within its own class
    // this serves to prevent the Car class from creating invalid objects
    // allows our code to validate that the user to properly using the application
    String validModel = model.toLowerCase();
    if (validModel.equals("911 turbo") || validModel.equals("commodore")) {
      this.model = model;
    } else {
      this.model = "unknown";
    }
  }

  // below is an example of a "getter"
  public String getModel() {
    return this.model;
  }
}
