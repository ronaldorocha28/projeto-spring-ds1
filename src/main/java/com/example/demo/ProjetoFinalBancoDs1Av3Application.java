package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Categoria;
import com.example.demo.domain.Conta;
import com.example.demo.repositories.CategoriaRepository;
import com.example.demo.repositories.ContaRepository;

@SpringBootApplication
public class ProjetoFinalBancoDs1Av3Application implements CommandLineRunner{

	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Autowired
	ContaRepository contaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoFinalBancoDs1Av3Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Categoria 1");
		Categoria cat2 = new Categoria(null, "Categoria 2");
		
		Conta c1 = new Conta(null, 12345, 1000.00, true);
		Conta c2 = new Conta(null, 13579, 700.00, true);
		Conta c3 = new Conta(null, 24680, 400.00, true);
		
		cat1.getContas().addAll(Arrays.asList(c1,c2));
		cat2.getContas().addAll(Arrays.asList(c1));

		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		contaRepository.saveAll(Arrays.asList(c1,c2,c3));


	}

}
