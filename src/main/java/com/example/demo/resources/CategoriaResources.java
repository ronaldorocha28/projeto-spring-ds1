package com.example.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Categoria;
import com.example.demo.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {

	@Autowired
	private CategoriaService service;

	public ResponseEntity<Categoria> find(@PathVariable Integer id) {
		Categoria cat = service.find(id);

		return ResponseEntity.ok().body(cat);

	}

}
