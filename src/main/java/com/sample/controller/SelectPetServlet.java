package com.sample.controller;

import com.sample.model.Pet;
import com.sample.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/*@WebServlet(
        name = "selectpetservlet",
        urlPatterns = "/SelectPet"
)*/
@Controller
public class SelectPetServlet{

    @Autowired
    private PetService petService;

    @RequestMapping(value="/SelectPet", method=RequestMethod.POST)
    protected ModelAndView doPost(@ModelAttribute("pet") Pet pet) {

        ModelAndView view = new ModelAndView();
        view.setViewName("result");

        List petBreeds = petService.getAvailablePets(pet.getType());
        view.addObject("breeds", petBreeds);

        return view;

    }

    @RequestMapping(value ="/start", method= RequestMethod.GET)
    public String homePage(@ModelAttribute("pet") Pet pet){
        return "index";
    }

    @RequestMapping(value="/SelectPet/{type}", method = RequestMethod.GET)
    protected ModelAndView doPost(@PathVariable String type ){
        ModelAndView view = new ModelAndView();
        PetService petService = new PetService();
        List petBreeds = petService.getAvailablePets(type);
        view.addObject("breeds", petBreeds);

        view.setViewName("result");
        return view;

    }

}
