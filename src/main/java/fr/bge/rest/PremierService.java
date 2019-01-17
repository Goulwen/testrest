package fr.bge.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/premier")
public class PremierService {

	@GET
	@Path("/isalive")
	public Response isAlive() {
		String output = "Je suis vivant";
		return Response.status(200).entity(output).build();
	}
	
	@GET
	public Response testGet() {
		String output = "C'est du GET !";
		return Response.status(200).entity(output).build();
	}
	
	@POST
	@Path("/testpost")
	public Response testPost() {
		String output = "C'est du POST !";
		return Response.status(200).entity(output).build();
	}
}
