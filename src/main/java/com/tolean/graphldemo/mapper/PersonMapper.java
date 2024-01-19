package com.tolean.graphldemo.mapper;

import com.tolean.graphldemo.domain.Person;
import com.tolean.graphldemo.dto.PersonDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonMapper {

    public List<PersonDto> map(List<Person> list) {
        return list.stream().map(this::map).collect(Collectors.toList());
    }

    public PersonDto map(Person person) {
        return new PersonDto(person);
    }

}
