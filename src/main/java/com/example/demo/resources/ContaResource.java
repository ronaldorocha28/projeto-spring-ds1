package com.example.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Conta;
import com.example.demo.services.ContaService;

@RestController
@RequestMapping(value = "/conta")
public class ContaResource {

	private ContaService service;
	
	public ResponseEntity<Conta> find(@PathVariable Integer id) {
		Conta conta = service.find(id);

		return ResponseEntity.ok().body(conta);

	}
}
