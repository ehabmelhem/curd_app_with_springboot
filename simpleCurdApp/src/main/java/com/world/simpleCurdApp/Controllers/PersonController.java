package com.world.simpleCurdApp.Controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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
	public  ResponseEntity<String> addPerson(@Valid @RequestBody Person person) throws NotFoundException {
		if(!personReops.findById(person.getId()).isPresent()){
		personReops.save(person);
		return ResponseEntity.ok("User is valid");
		}
		else {
			return ResponseEntity.ok("User is not valid or the user is already exist");
		}
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
	public ResponseEntity<String> deletePerson(@PathVariable String id) throws NotFoundException {
		if(personReops.findById(id).isPresent()) {
			personReops.deleteById(id);
			return ResponseEntity.ok("the user hase been deleted");
			}
			else {
				return ResponseEntity.ok("the user dose not found");	
			}
	}

	@PutMapping(Routes.updatePersonById)
	public ResponseEntity<Person> updatePerson(@PathVariable(value = "id") String id, @RequestBody Person person)
			throws NotFoundException {
		Person oldPerson = personReops.findById(id).orElseThrow(() -> new NotFoundException());

		person.setId(oldPerson.getId());
		personReops.save(person);
		return ResponseEntity.ok(person);
	}

}
