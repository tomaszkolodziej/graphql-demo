package com.tolean.graphldemo.domain;

import java.time.LocalDate;

public record Person(Long id, String firstName, String lastName, LocalDate dateOfBirth) {

    public Person {
        if (dateOfBirth.isAfter(LocalDate.now().minusDays(18L))) {
            throw new IllegalArgumentException("dateOfBrith should be >= 18");
        }
    }

}
