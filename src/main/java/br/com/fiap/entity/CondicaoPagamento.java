package br.com.fiap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_CONDICAO_PAGAMENTO")
public class CondicaoPagamento {

	@Id
	@SequenceGenerator(name = "pagamento" , sequenceName = "sq_tb_pagamento", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pagamento" )
	@Column(name="id_Pagameto")
	private Integer idPagamento;
	
	@Column(name = "desc_pagmto" , length = 100)
	private String descCondicaoPagamento;
	
	
	
	public CondicaoPagamento(Integer idPagamento, String descCondicaoPagamento) {
		super();
		this.idPagamento = idPagamento;
		this.descCondicaoPagamento = descCondicaoPagamento;
	}


	public CondicaoPagamento() {
		// TODO Auto-generated constructor stub
	}


	public Integer getIdPagamento() {
		return idPagamento;
	}


	public void setIdPagamento(Integer idPagamento) {
		this.idPagamento = idPagamento;
	}


	public String getDescCondicaoPagamento() {
		return descCondicaoPagamento;
	}


	public void setDescCondicaoPagamento(String descCondicaoPagamento) {
		this.descCondicaoPagamento = descCondicaoPagamento;
	}

	
	
}
