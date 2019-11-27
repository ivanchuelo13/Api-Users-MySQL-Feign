package co.web.mysql.invoice.feign;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import co.web.mysql.invoice.model.*;
import co.web.mysql.invoice.service1.UsuarioService;

@FeignClient(name = "user-repositorio", url = "localhost:10010")
public class UsuariosServiceFeign {
	
	@Autowired
	UsuarioService service;

	@GetMapping
	public List<Usuario> getList(){
		return service.getAllList();
	}

	@GetMapping(path = "/{id}")
	public Usuario getById(@PathVariable("id") long id) {
		return service.getById(id);
	}
}
