package com.example.layerproject;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class DeveloperRepository {
    HashMap<Integer , Developer> db = new HashMap<>();

    // add APIs DB
    public String addDev(Developer developer){

        int devId = developer.getDev_Id();
        db.put(devId , developer);
        return "Developer Added successful";
    }

    // Get APIs db

    public Developer getDev(int id){
        return db.get(id);
    }

    // Update APIs db

    public String updateDev(int id , int salary , String role){

        if (!db.containsKey(id))
            return null;

        db.get(id).setSalary(salary);
        db.get(id).setRole(role);

        return  "Update successful";
    }

    // Delete APIs db

    public String deleteDev(int id){

        if(!db.containsKey(id))
            return "Invalid Id";

        db.remove(id);

        return "Delete successful";
    }

}
