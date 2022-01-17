package com.world.simpleCurdApp.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.world.simpleCurdApp.Controllers.Routers.Routes;
import com.world.simpleCurdApp.model.Person;
import com.world.simpleCurdApp.repository.PersonReopsitory;

@RestController
@RequestMapping(Routes.PERSON)
public class PersonController {

	@Autowired
	private PersonReopsitory personReops;

	@PostMapping(Routes.ADD_PERSON)
	public String addpERSON(@RequestBody Person person) {
		System.out.println(person);
		personReops.save(person);
		return "the Person hass been added";
	}

	@GetMapping(Routes.getAllPeople)
	public List<Person> getAll() {
		return personReops.findAll();
	}

	@GetMapping(Routes.getPersonById)
	public Optional<Person> getPerson(@PathVariable String id) {
		return personReops.findById(id);
	}

	@DeleteMapping(Routes.deletePersonById)
	public String deletePerson(@PathVariable String id) {
		try {
			personReops.deleteById(id);
			return "the person hass been deleted";
		} catch (Exception e) {
			return e.toString();
		}
	}

}
