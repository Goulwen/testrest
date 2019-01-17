package fr.bge.rest;

import org.glassfish.jersey.server.ResourceConfig;

public class GrizzlyConfig extends ResourceConfig {

	public GrizzlyConfig() {
		packages("fr.bge");
	}
}
