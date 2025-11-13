package controllers;

import models.Car;

public class CarController {
  public void sortByName(Car[] cars) {
    for (int i = 1; i < cars.length; i++) {
      Car key = cars[i];
      int j = i - 1;
      while (j >= 0 && cars[j].getName().compareTo(key.getName()) > 0) {
        cars[j + 1] = cars[j];
        j = j - 1;
      }
      cars[j + 1] = key;
    }
  }

  public void printArray(Car[] cars) {
    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }
  }

}
