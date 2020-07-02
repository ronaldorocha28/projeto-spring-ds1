package com.example.demo.domain;

import java.util.Date;

public class Fatura {
	
	private Integer id;
	private Date dataVencimento;
	private Date dataPagamento;
	private double juros;
	private boolean estado;
	private double total;
	
	public Fatura() {
	
	}

	public Fatura(Integer id, Date dataVencimento, Date dataPagamento, double juros, boolean estado, double total) {
		this.id = id;
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
		this.juros = juros;
		this.estado = estado;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
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
		Fatura other = (Fatura) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
