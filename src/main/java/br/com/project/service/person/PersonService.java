package br.com.project.service.person;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import br.com.project.models.Person;

@Path("/person")
public class PersonService {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void personCreate(Person person) throws Exception {
		// logic is here
		System.out.println(person);
	}
}
