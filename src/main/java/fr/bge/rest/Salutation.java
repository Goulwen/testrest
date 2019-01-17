package fr.bge.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/salutation")
public class Salutation {

	@POST
	@Consumes("application/x-www-form-urlencoded")
	public Response salutation(@FormParam("nom") String nom) {
		String output = "coucou " + nom;
		return Response.status(200).entity(output).build();
	}
	
}
