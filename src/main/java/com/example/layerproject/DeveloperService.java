package com.example.layerproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeveloperService {

    @Autowired
    DeveloperRepository developerRepository;

    public String addDev(Developer developer){

        return developerRepository.addDev(developer);
    }

    public Developer getDev(int id){

        return developerRepository.getDev(id);
    }

    public String updateDev(int id , int salary, String role){

        return developerRepository.updateDev(id,salary,role);

    }

    public String deleteDev(int id){

        return developerRepository.deleteDev(id);

    }


}
