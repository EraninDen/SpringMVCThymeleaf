package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ServiceCars {
    private int id;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1, "Ford", "Black"));
        cars.add(new Car(2, "Mazda", "White"));
        cars.add(new Car(3, "BMW", "Grey"));
        cars.add(new Car(4, "KIA", "Green"));
        cars.add(new Car(5, "Lada", "Red"));
    }

    public List<Car> allCars(){
        return cars;
    }

    public List<Car> getCars(Integer count){

        if(count!= null && count >= 1 && count <= 5){

            List<Car> carList = (List<Car>) cars.stream().limit(count).collect(Collectors.toList());
            return carList;

        }else{

            return cars;

        }

    }

}
