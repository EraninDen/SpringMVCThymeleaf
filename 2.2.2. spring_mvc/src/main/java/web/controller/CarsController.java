package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.ServiceCars;

import java.util.ArrayList;


@Controller

public class CarsController {


    private final ServiceCars serviceCars;

    @Autowired
    public CarsController(ServiceCars serviceCars) {
        this.serviceCars = serviceCars;
    }

    @GetMapping(value = "/cars")
    public String allCars(@RequestParam(value = "count", required = false) Integer count, Model model){
        model.addAttribute("Count", count);
        model.addAttribute("allCars", serviceCars.getCars (count));
        return "/cars";
    }


   /*
   @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, Model model){
        model.addAttribute( "message", count );
        return "/cars";
    }

    */
}
