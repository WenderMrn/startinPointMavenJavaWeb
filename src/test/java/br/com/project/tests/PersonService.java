package br.com.project.tests;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Test;

public class PersonService {
	
	@Test
	public void CreatePerson(){
		try {
			
			Client client = ClientBuilder.newClient();
			WebTarget webTarget = client.target("http://localhost:8080/webservicerest/rest");
			String resultado = webTarget.path("/hello1/olá").request().get(String.class);
			System.out.println(resultado);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	} 
}
