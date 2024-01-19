package com.tolean.graphldemo.service;

import com.tolean.graphldemo.domain.Person;
import com.tolean.graphldemo.domain.PersonRepository;
import com.tolean.graphldemo.dto.PersonDto;
import com.tolean.graphldemo.mapper.PersonMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public PersonService(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    public List<PersonDto> getPeople() {
        List<PersonDto> list = personMapper.map(personRepository.getPeople());
        return list;
    }

}
