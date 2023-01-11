package com.example.Aadhar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdharControler {
    @Autowired
    AdharService adharService;
    @PostMapping("/saveAdharNum")
    public ResponseEntity<String> saveAdharNum(@RequestParam("id") String adharNumber, @RequestParam("name") String name){
        adharService.saveAdhar(adharNumber, name);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    @GetMapping("/getNameById")
    public ResponseEntity<String> getNameById(@RequestParam("adharNumber") String aadharNumber){
        String name = adharService.getNameById(aadharNumber);
        return new ResponseEntity<>(name, HttpStatus.ACCEPTED);
    }
}
