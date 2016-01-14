package br.com.project.service.person;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.project.models.Person;

@Path("/person")
public class PersonService {
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Person personCreate(Person person) throws Exception {
		// logic is here
		//System.out.println(person);
		return person;
	}
}
