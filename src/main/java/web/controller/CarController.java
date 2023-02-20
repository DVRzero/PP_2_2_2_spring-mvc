package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.*;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String carsPage (@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        System.out.println(count);

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("One", "V6", 500));
        carList.add(new Car("Two", "V12", 250));
        carList.add(new Car("Three", "V8", 400));
        carList.add(new Car("Four", "V6", 550));
        carList.add(new Car("Five", "V12", 300));

        if (count >= 5) {
            model.addAttribute("cars", carService.getCars(carList, 5));
        } else {
            model.addAttribute("cars", carService.getCars(carList, count));
        }
        return "cars";
    }
}
