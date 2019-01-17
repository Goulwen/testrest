package fr.bge.rest;

import java.io.ByteArrayInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/telechargement")
public class PdfService {

	@GET
	@Produces("application/pdf")
	public Response getFichier() {
//		File tmpFile = new File("C:\\Users\\admin\\eclipse-workspace\\testrest\\src\\main\\resources\\DESIGN_PATTERNS.pdf");
		try {
			java.nio.file.Path path = Paths.get(getClass().getClassLoader().getResource("DESIGN_PATTERNS.pdf").toURI());
			byte[] fileBytes = Files.readAllBytes(path);
			return Response.ok(new ByteArrayInputStream(fileBytes)).build();
		}
		catch(Exception e) {
			return Response.status(200).entity("Une erreur est survenue").build();
		}
	}
}
