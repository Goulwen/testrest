package fr.bge.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import fr.bge.domaine.Personne;

@Path("/list")
public class Groupe {

	@GET
	@Path("/beatles")
	@Produces("application/json")
	public Response getBeatles() {
		List<Personne> resultat = new ArrayList<>();
		resultat.add(new Personne("test1", "tttttt1"));
		resultat.add(new Personne("test2", "tttttt2"));
		return Response.status(200).entity(resultat).build();
	}
}
