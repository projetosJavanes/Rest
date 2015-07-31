package com.rest.Resource;

import java.util.List;

import com.rest.Controller.clienteController;
import com.rest.Entity.Cliente;
import com.rest.Entity.Service.ClienteService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/cliente")
public class clienteResource {

	@GET
	@Path("/listarTodos")
	@Produces("application/xml")
	public List<Cliente> listarTodos() {
		return ClienteService.getInstance().listarTodos();
	}

}
