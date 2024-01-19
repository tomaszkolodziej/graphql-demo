package com.tolean.graphldemo.dto;

import com.tolean.graphldemo.domain.Person;

import java.time.LocalDate;

public record PersonDto(Long id, String firstName, String lastName, LocalDate dateOfBirth) {

    public PersonDto(Person person) {
        this(person.id(), person.firstName(), person.lastName(), person.dateOfBirth());
    }

}
