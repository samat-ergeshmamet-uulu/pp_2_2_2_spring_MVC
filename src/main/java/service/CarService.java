package service;

import model.Car;

import java.util.List;

public interface CarService {
    List<Car> getListOfNCars(List<Car> list, int n);
}
