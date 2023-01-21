package web;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;


public class CarServiceImp implements CarService {

    public List<Car> createListOfCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "X1", "RED"));
        carList.add(new Car("BMW", "X2", "BLACK"));
        carList.add(new Car("BMW", "X3", "GREY"));
        carList.add(new Car("BMW", "X4", "WHITE"));
        carList.add(new Car("BMW", "X5", "BLUE"));
        return carList;
    }


   @Override
    public List<Car> getListOfCars(List<Car> list, int a) {
       List<Car> carList1 = new ArrayList<>();
       if(0 < a && a < 6) {
           for (int i = 0; i < a; i++) {
               carList1.add(list.get(i));
           }
           return carList1;
       } else if(a>=6) {
           return list;
       } else return null;
    }
}
