package br.com.project.tests;

import org.junit.Test;

import br.com.project.daojpa.DAO;
import br.com.project.daojpa.DAOPerson;
import br.com.project.models.Person;

public class PersonDAO {
	
	@Test
	public void createPerson(){
		DAOPerson daoperson = new DAOPerson();
		try {
			DAO.open();
			DAO.begin();
			daoperson.create(new Person("Fulano","fulano@gmail.com","00 0000-0000"));	
			DAO.commit();
			DAO.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}	
	}
}
