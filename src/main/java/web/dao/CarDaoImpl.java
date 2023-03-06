package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getCars(int limit) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("One", "V6", 500));
        cars.add(new Car("Two", "V12", 250));
        cars.add(new Car("Three", "V8", 400));
        cars.add(new Car("Four", "V6", 550));
        cars.add(new Car("Five", "V12", 300));

        return IntStream.range(0, limit)
                .mapToObj(i -> cars.get(i))
                .collect(Collectors.toList());
    }
}
