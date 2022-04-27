package service;

import model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarServiceImpl implements CarService {
    public List<Car> getListOfNCars(List<Car> list, int n) {
        List<Car> answer = new ArrayList<>();
        for (int i = 0; i < n && i < 5; i++) {
            answer.add(list.get(i));
        }
        return answer;
    }
}
