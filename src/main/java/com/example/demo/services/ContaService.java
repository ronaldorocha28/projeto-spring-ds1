package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Conta;
import com.example.demo.repositories.ContaRepository;

@Service
public class ContaService {
	
	@Autowired
	private ContaRepository repository;
	
	public Conta find(Integer id) {

		Optional<Conta> conta = repository.findById(id);
		return conta.orElse(null);
	}

}
