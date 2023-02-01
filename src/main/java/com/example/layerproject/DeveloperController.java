package com.example.layerproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeveloperController {

   @Autowired
    DeveloperService developerService;

   @PostMapping("/add_dev")
   public ResponseEntity addDev(@RequestBody Developer developer){

       String resonse = developerService.addDev(developer);

       return new ResponseEntity<>(resonse, HttpStatus.ACCEPTED);

       //return developerService.addDev(developer);

    }
    @GetMapping("/get_dev")
    public ResponseEntity getDev(@RequestParam("q") int id){

       Developer response = developerService.getDev(id);

       return new ResponseEntity<>(response, HttpStatus.CREATED);

       //return developerService.getDev(id);
    }

    @PutMapping("/update_dev")
    public ResponseEntity updateDev(@RequestParam("id") int id,@RequestParam("salary") int salary,@RequestParam("role") String role){

      String response = developerService.updateDev(id, salary, role);

      return new ResponseEntity<>(response , HttpStatus.ACCEPTED);

       // return developerService.updateDev(id,salary,role);
    }

    @DeleteMapping("/delete_dev/{id}")
    public ResponseEntity deleteDev(@PathVariable("id") int id){

       String response = developerService.deleteDev(id);

       return new ResponseEntity<>(response,HttpStatus.FOUND);

       // return developerService.deleteDev(id);

    }
}
