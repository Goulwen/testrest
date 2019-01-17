package fr.bge.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/calculatrice")
public class Calculatrice {

	@GET
	@Path("/addition/{premier}/{second}")
	public Response addition(@PathParam("premier") Integer premier, @PathParam("second") Integer second) {
		Integer output = premier + second;
		return Response.status(200).entity(output).build();
	}
	
	@GET
	@Path("/multiplication")
	public Response multiplication(@QueryParam("premier") Integer premier, @QueryParam("second") Integer second) {
		Integer output = premier * second;
		return Response.status(200).entity(output).build();
	}
}
