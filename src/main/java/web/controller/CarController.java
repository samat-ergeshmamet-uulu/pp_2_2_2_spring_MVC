package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.CarService;
import service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class CarController {
    CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String car(HttpServletRequest countRequest, Model model) {
        int count = Integer.parseInt(countRequest.getParameter("count"));

        model.addAttribute("carsList", "Baeldung");
        model.addAttribute("carsTable", carService.getListOfNCars(Arrays.asList(new Car(1, "V6", "BMW"),
                new Car(2, "V4", "Saab"),
                new Car(3, "V8", "Cadillac"),
                new Car(4, "V6", "Jaguar"),
                new Car(5, "V10", "Lamborghini")), count));
//        model.mergeAttributes(map);
        return "/cars";
    }
}
