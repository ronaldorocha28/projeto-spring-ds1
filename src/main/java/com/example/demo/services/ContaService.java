package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Conta;
import com.example.demo.repositories.ContaRepository;
import com.example.demo.services.exceptions.ObjectNotFoundException;

@Service
public class ContaService {
	
	@Autowired
	private ContaRepository repository;
	
	public Conta find(Integer id) {
		Optional<Conta> conta = repository.findById(id);
		return conta.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Conta.class.getName()));
	}
}
