package com.tito;

public class Main {

  public static void main(String[] args) {
    Car porsche = new Car();
    // ⬆ creates new data type called porsche of type "Car"
    Car holden = new Car();
    // ⬆ creates new object called holden based on the Car template
    porsche.model = "911 Turbo";
  }
}
