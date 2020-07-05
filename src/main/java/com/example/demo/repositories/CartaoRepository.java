package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Cartao;

public interface CartaoRepository extends JpaRepository<Cartao, Integer>{

}
