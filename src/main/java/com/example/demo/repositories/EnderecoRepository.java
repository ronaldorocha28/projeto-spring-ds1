package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

}
