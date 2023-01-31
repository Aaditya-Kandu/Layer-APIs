package com.example.layerproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeveloperController {

   @Autowired
    DeveloperService developerService;

   @PostMapping("/add_dev")
   public String addDev(@RequestBody Developer developer){

       return developerService.addDev(developer);

    }
    @GetMapping("/get_dev")
    public Developer getDev(@RequestParam("q") int id){

       return developerService.getDev(id);
    }

    @PutMapping("/update_dev")
    public String updateDev(@RequestParam("id") int id,@RequestParam("salary") int salary,@RequestParam("role") String role){

       return developerService.updateDev(id,salary,role);
    }

    @DeleteMapping("/delete_dev/{id}")
    public String deleteDev(@PathVariable("id") int id){
       return developerService.deleteDev(id);

    }
}
