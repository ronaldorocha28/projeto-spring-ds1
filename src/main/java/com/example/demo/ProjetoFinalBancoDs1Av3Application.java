package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Cartao;
import com.example.demo.domain.Categoria;
import com.example.demo.domain.Cliente;
import com.example.demo.domain.Conta;
import com.example.demo.domain.Endereco;
import com.example.demo.domain.Fatura;
import com.example.demo.repositories.CartaoRepository;
import com.example.demo.repositories.CategoriaRepository;
import com.example.demo.repositories.ClienteRepository;
import com.example.demo.repositories.ContaRepository;
import com.example.demo.repositories.EnderecoRepository;
import com.example.demo.repositories.FaturaRepository;

@SpringBootApplication
public class ProjetoFinalBancoDs1Av3Application implements CommandLineRunner{

	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Autowired
	ContaRepository contaRepository;
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	EnderecoRepository enderecoRepository;
	
	@Autowired
	CartaoRepository cartaoRepository;
	
	@Autowired
	FaturaRepository faturaRepository;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoFinalBancoDs1Av3Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Bronze");
		Categoria cat2 = new Categoria(null, "Silver");
		Categoria cat3 = new Categoria(null, "Gold");	
		
		Conta c1 = new Conta(null, 12345, 1000.00, true);
		Conta c2 = new Conta(null, 13579, 700.00, true);
		Conta c3 = new Conta(null, 24680, 400.00, true);
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		contaRepository.saveAll(Arrays.asList(c1,c2,c3));
		
		Cliente cli1 = new Cliente(null, "Shaka de Virgem", "shaka@cdz.com", c1);
		Cliente cli2 = new Cliente(null, "Toko de Libra", "toko@cdz.com", c2);
		Cliente cli3 = new Cliente(null, "Aiolos de Sagitário", "aiolos@cdz.com", c3);
		
		Endereco end1 = new Endereco(null, "Rua da Mangueira", "123", "Bairro da Manga", "Fotaleza", "Ceará", cli1);
		Endereco end2 = new Endereco(null, "Rua do Cajueiro", "321", "Bairro do Caju", "Salvador", "Bahia", cli2);
		Endereco end3 = new Endereco(null, "Rua do Coqueiro", "235", "Bairro do Coqueiro", "Rio de Janeiro", "Rio de Janeiro", cli3);
		
		cli1.getEnderecos().addAll(Arrays.asList(end1));
		cli1.getTelefones().addAll(Arrays.asList("2222-2222", "3333-3333"));
		
		cli2.getEnderecos().addAll(Arrays.asList(end2));
		cli2.getTelefones().addAll(Arrays.asList("4444-4444", "5555-5555"));
		
		cli3.getEnderecos().addAll(Arrays.asList(end3));
		cli3.getTelefones().addAll(Arrays.asList("6666-6666", "7777-7777"));

		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3));
		enderecoRepository.saveAll(Arrays.asList(end1, end2, end3));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		
		Cartao cart1 = new Cartao(null, 33333, sdf.parse("03/03/2022"), "Shaka de Virgem", 333, "12345");
		Cartao cart2 = new Cartao(null, 55555, sdf.parse("05/05/2022"), "Toko de Libra", 555, "54321");
		Cartao cart3 = new Cartao(null, 77777, sdf.parse("07/07/2022"), "Aiolos de Leão", 777, "13579");
		
		Fatura fat1 = new Fatura(null, sdf.parse("03/03/2020"), sdf.parse("01/03/2020"), 0.03, true, 300.00);
		Fatura fat2 = new Fatura(null, sdf.parse("05/05/2020"), sdf.parse("01/05/2020"), 0.05, true, 500.00);
		Fatura fat3 = new Fatura(null, sdf.parse("07/07/2020"), sdf.parse("01/07/2020"), 0.07, true, 700.00);

		cartaoRepository.saveAll(Arrays.asList(cart1, cart2, cart3));
		faturaRepository.saveAll(Arrays.asList(fat1, fat2, fat3));
		


		
	}

}
