package com.jersey.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jersey.pojo.User;


@Path("/user")
public class UserResource {

	private ObjectMapper mapper = new ObjectMapper();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser() {
		return new User(1, "Joao", "senha", "rua xyz", "joao@gmail.com");
	}
	
	
	@POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response userPost(User user) {
	
		try{
			return Response.status(Status.CREATED).entity(mapper.writeValueAsString(user)).build();
		}catch(Exception e){
			return Response.status(Status.BAD_REQUEST).entity(e.toString()).build();
		}
    }
	
}
