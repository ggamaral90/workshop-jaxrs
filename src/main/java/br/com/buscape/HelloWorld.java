package br.com.buscape;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author Gabriel Amaral 15/04/2016
 *
 */
@Path("/hello")
public class HelloWorld {
	
	@GET
	public Response hello() {
		return Response.ok().entity("Hello World!").build();
	}
}
