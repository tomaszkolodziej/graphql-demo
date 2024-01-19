package com.tolean.graphldemo.domain;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class PersonRepository {

    public List<Person> getPeople() {
        return List.of(
                new Person(1L, "James", "Bond", LocalDate.of(1990, 1, 2)),
                new Person(2L, "Eva", "Bond", LocalDate.of(1993, 2, 3)),
                new Person(3L, "Tomasz", "Kolodziej", LocalDate.of(1984, 6, 9)),
                new Person(4L, "Anna", "Kolodziej", LocalDate.of(1984, 7, 12)),
                new Person(5L, "Lena", "Kolodziej", LocalDate.of(2013, 3, 20))
        );
    }

}
