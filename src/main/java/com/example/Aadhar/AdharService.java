package com.example.Aadhar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdharService {

    @Autowired
    AdharRepository adharRepository;
    public void saveAdhar(String aadharNumber, String name){
        adharRepository.saveNameAndNumber(aadharNumber, name);
    }

    public String getNameById(String aadharNumber){
       return adharRepository.getNameById(aadharNumber);
    }
}
