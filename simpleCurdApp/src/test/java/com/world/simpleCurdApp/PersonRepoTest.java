package com.world.simpleCurdApp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.world.simpleCurdApp.model.Person;
import com.world.simpleCurdApp.repository.PersonReopsitory;


@DataJpaTest
public class PersonRepoTest {
	
	@Autowired
	private PersonReopsitory personReops;
	
	@Test
	public void addnewPerson() {
		Person p=new Person();
		p.setId("ehab");
		p.setAge(13);
		personReops.save(p);
		Assertions.assertThat(p.getAge()<0);
	}

}
