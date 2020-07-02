package com.example.demo.domain;

import java.util.Date;

public class Cartao {
	
	private Integer id;
	private Integer numero;
	private Date vencimento;
	private String nomeCliente;
	
	public Cartao() {
		
	}

	private Integer cod;
	private String senha;
	
	public Cartao(Integer id, Integer numero, Date vencimento, String nomeCliente, Integer cod, String senha) {
		this.id = id;
		this.numero = numero;
		this.vencimento = vencimento;
		this.nomeCliente = nomeCliente;
		this.cod = cod;
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cartao other = (Cartao) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
