package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDao {
    private List<Car> carsArray;
    {
        carsArray = new ArrayList<>();
        carsArray.add(new Car("BMW", "white", 2003));
        carsArray.add(new Car("Porshe", "grey", 2015));
        carsArray.add(new Car("Ferrari", "red", 2018));
        carsArray.add(new Car("Toyota", "black", 2010));
        carsArray.add(new Car("Mustang", "blue", 1977));
    }
    public List<Car> show(){
        return carsArray;
    }

    public List<Car> request(int count){
        return carsArray.stream().limit(count).toList();
    }
}
