package com.redhat.training.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.redhat.training.model.Workorder;
import com.redhat.training.model.WorkorderResponse;

@Path("/workorders")
public interface WorkorderService {

	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public WorkorderResponse create(Workorder workorder);
	
	@GET
	@Path("/{accountNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Workorder retrieve(@PathParam("accountNumber") String accountNumber);
	
	@PUT
	@Path("/{accountNumber}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public WorkorderResponse update(Workorder workorder);
	
	@DELETE
	@Path("/{accountNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public WorkorderResponse delete(@PathParam("accountNumber") String accountNumber);
	
	@PUT
	@Path("/{accountNumber}/commit")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public WorkorderResponse commit(@PathParam("accountNumber") String accountNumber);
	
}
