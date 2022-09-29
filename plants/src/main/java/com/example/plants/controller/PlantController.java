package com.example.plants.controller;

import com.example.plants.services.PlantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlantController {

    @Autowired
    PlantServices plantServices;

    @GetMapping("/")
    public String getAllPlants (Model model){
         model.addAttribute("plants",plantServices.getAllPlants());
        return "index";
    }
}
