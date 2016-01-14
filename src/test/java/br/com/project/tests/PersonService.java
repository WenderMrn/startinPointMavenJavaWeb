package br.com.project.tests;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientResponse;
import org.junit.Test;

import br.com.project.models.Person;

public class PersonService {
	
	@Test
	public void CreatePerson(){
		try {
			
			Client client = ClientBuilder.newClient();
			WebTarget webTarget = client.target("http://localhost:8080/webservicerest/rest");
	
			/*String resultado = 
					webTarget.path("/person/create").request()
					.post(ClientResponse.class,new Person("Fulano","fulano@gmail.com","00000-0000"));
			
			System.out.println(resultado);*/
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	} 
}
