package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Mercedes E-Coupe", "Purple", 2021));
        carList.add(new Car("Lamborghini Aventador", "Green", 2016));
        carList.add(new Car("Porsche Carrera GT", "Ocean Blue", 2007));
        carList.add(new Car("Mercedes GLS", "Black", 2019));
        carList.add(new Car("BMW X6", "Red", 2018));
    }

    @Override
    public List<Car> getCarList(int count) {
        return count < 5 ? carList.stream().limit(count).toList() : carList;
    }

}
