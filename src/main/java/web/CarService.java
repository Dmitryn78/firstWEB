package web;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> createListOfCars();

    public List<Car> getListOfCars(List<Car> list, int a);
}
