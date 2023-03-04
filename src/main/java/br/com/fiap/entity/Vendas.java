package br.com.fiap.entity;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name ="TB_VENDAS")
public class Vendas {

	@Id
	@SequenceGenerator(name = "vendas" ,sequenceName = "sq_id_venda", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "vendas")
	private Integer Id_Vendas;
	
	@Id
	@SequenceGenerator(name = "vendas" , sequenceName = "sq_ano_venda" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vendas")
	private Integer anoVenda;
	
	@OneToOne
	@JoinColumn(name="fornecedor_id")
	private Fornecedor fornecedor;
	
	@OneToOne
	@JoinColumn( name ="cliente_id")
	private Cliente cliente;
	
	@OneToOne
	@JoinColumn(name = "condPagamento_id")
	private CondicaoPagamento condPagmento;
	

	public Cliente getCliente() {
		return cliente;
	}





	public CondicaoPagamento getCondPagmento() {
		return condPagmento;
	}





	public void setCondPagmento(CondicaoPagamento condPagmento) {
		this.condPagmento = condPagmento;
	}





	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}





	public Integer getId_Vendas() {
		return Id_Vendas;
	}





	public Fornecedor getFornecedor() {
		return fornecedor;
	}





	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}





	public Vendas() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setId_Vendas(Integer id_Vendas) {
		Id_Vendas = id_Vendas;
	}


	public Integer getAnoVenda() {
		return anoVenda;
	}


	public void setAnoVenda(Integer anoVenda) {
		this.anoVenda = anoVenda;
	}
	


	public Vendas(Integer id_Vendas, Integer anoVenda) {
		Id_Vendas = id_Vendas;
		this.anoVenda = anoVenda;
	}

	
}
