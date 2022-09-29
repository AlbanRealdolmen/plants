package com.example.plants.services;

import com.example.plants.model.Plant;
import com.example.plants.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantServices {

    @Autowired
    PlantRepository plantRepository;

    public Iterable<Plant> getAllPlants() {
        return plantRepository.findAll();
    }
}
