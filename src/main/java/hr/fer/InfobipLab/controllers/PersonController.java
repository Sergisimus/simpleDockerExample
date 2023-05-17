package hr.fer.InfobipLab.controllers;

import hr.fer.InfobipLab.models.Person;
import hr.fer.InfobipLab.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    PersonRepository repository;

    @GetMapping
    public List<Person> getPersons() {
        return repository.findAll();
    }

    @PostMapping("/add")
    public void addPerson(@RequestBody Person person) {
        repository.save(person);
    }
}
