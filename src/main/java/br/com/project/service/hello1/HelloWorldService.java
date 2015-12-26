package br.com.project.service.hello1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello1")
public class HelloWorldService {
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "URI hello1 say: " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
 
}
