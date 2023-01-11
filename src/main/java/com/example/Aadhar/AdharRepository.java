package com.example.Aadhar;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class AdharRepository {

    HashMap<String, String> aadharDb;

    public AdharRepository() {
        this.aadharDb = new HashMap<>();
    }

    public void saveNameAndNumber(String aadharNumber, String name){
        aadharDb.put(aadharNumber, name);
    }

    public String getNameById(String aadharNumber){
        if(aadharDb.containsKey(aadharNumber)){
            return aadharDb.get(aadharNumber);
        }
        return "Not in the database";
    }
}
