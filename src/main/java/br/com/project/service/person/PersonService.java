package br.com.project.service.person;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.project.daojpa.DAO;
import br.com.project.daojpa.DAOPerson;
import br.com.project.models.Person;

@Path("/person")
public class PersonService {
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Person personCreate(Person person) throws Exception {
		
		DAOPerson daoperson = new DAOPerson();
		try {
			DAO.open();
			DAO.begin();
			daoperson.create(person);	
			DAO.commit();
			DAO.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}	// logic is here
		//System.out.println(person);
		
		return person;
	}
}
