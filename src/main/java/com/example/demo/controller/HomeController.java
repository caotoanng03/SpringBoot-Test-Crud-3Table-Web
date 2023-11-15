package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.model.Telephone;
import com.example.demo.model.Vehicle;
import com.example.demo.repository.PersonRepo;
import com.example.demo.repository.TelephoneRepo;
import com.example.demo.repository.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired private PersonRepo personRepo;
    @Autowired private TelephoneRepo telephoneRepo;
    @Autowired private VehicleRepo vehicleRepo;

    @GetMapping("/")
    public String home(Model model, String message) {
        String str = A();
        model.addAttribute("str", str);
        return "/pages/index";
    }

    String A() {
        String str="";
        for(Person person: personRepo.findAll()) {
            str+=String.format("%d ; %s ; %s ; %d%n",
                    person.getId(), person.getName(), person.getPlateNumber(), person.getHeight());
            str += "<br/>";
        }
        str += "<br/>";
        for(Telephone telephone: telephoneRepo.findAll()) {
            str+=String.format("%d ; %d ; %s%n",
                    telephone.getId(), telephone.getPersonId(), telephone.getPhoneNumber());
            str += "<br/>";
        }
        str += "<br/>";
        for(Vehicle vehicle: vehicleRepo.findAll()) {
            str+=String.format("%s ; %s ; %s%n",
                    vehicle.getPlateNumber(), vehicle.getBrand(), vehicle.getColor());
            str += "<br/>";
        }
        return str;
    }
}
