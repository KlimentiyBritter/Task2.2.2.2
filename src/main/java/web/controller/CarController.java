package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.model.Car;

import java.util.Arrays;

@Controller
@RequestMapping("/cars")
public class CarController {

    private CarDao getByCount;
    @Autowired
    public CarController(CarDao cad){
        this.getByCount = getByCount;
    }
    @GetMapping
    public String show (Model model){
        //Получаем все машины
        model.addAttribute("allCars", getByCount.show());
        return "cars/all";
    }

    @GetMapping("/{value}")
    public String request(@PathVariable("count") int count, Model model){
        //Получаем часть машин
        model.addAttribute("cars", getByCount.request(count));
        return "cars/array";
    }
}
