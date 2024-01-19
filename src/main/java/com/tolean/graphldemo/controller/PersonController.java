package com.tolean.graphldemo.controller;

import com.tolean.graphldemo.dto.PersonDto;
import com.tolean.graphldemo.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<PersonDto> getPeople() {
        return personService.getPeople();
    }

}
