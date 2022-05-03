package web.service;

import web.model.Cars;

import java.util.List;

public interface CarsService {
    public List<Cars> getCarsList(int count);
}
