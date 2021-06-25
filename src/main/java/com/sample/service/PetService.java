package com.sample.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "petService")
public class PetService {
    public List getAvailablePets(String type){

        List petBreeds = new ArrayList();

        if(type.equalsIgnoreCase("Cat")){
            petBreeds.add("White Cat");
            petBreeds.add(("Black Cat"));

        }else if(type.equalsIgnoreCase("Dog")){
            petBreeds.add("brown dog");
            petBreeds.add("black dog");

        }else if(type.equalsIgnoreCase("fish")){
            petBreeds.add("goldFish");

        }else {
            petBreeds.add("No pets Available");
        }
        return petBreeds;
    }
}
