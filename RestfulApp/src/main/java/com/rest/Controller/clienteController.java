package com.rest.Controller;

import java.util.List;

import com.rest.Entity.Cliente;
import com.rest.Entity.Service.ClienteService;

public class clienteController {
	
	public List<Cliente> listarTodos() {
		return new ClienteService().listarTodos();
	}

}
