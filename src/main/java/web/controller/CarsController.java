package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Cars;
import web.service.CarsServiceImpl;

import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        CarsServiceImpl carsService = new CarsServiceImpl();
        List<Cars> cars = carsService.getCarsList(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
