package br.com.fiap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_ESTOQUE")
public class Estoque {
	
	@Id
	@SequenceGenerator(name = "estoque" , sequenceName = "sq_tb_estoque", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "estoque" )
	private Integer id_Estoque;
	
	@Column(name = "saldoProduto" , nullable = false)
	private int saldoProduto;
	
	@Column(name = "locArmazenamento" , length = 20)
	private String locArmazenamento;
	
	@OneToOne
	@JoinColumn(name ="id_produto")
	private Produtos produto;
	
	

	public Produtos getProduto() {
		return produto;
	}





	public void setProduto(Produtos produto) {
		this.produto = produto;
	}





	public Estoque(Integer id_Estoque, int saldoProduto, String locArmazenamento) {
		super();
		this.id_Estoque = id_Estoque;
		this.saldoProduto = saldoProduto;
		this.locArmazenamento = locArmazenamento;
	}





	public Integer getId_Estoque() {
		return id_Estoque;
	}





	public void setId_Estoque(Integer id_Estoque) {
		this.id_Estoque = id_Estoque;
	}





	public int getSaldoProduto() {
		return saldoProduto;
	}





	public void setSaldoProduto(int saldoProduto) {
		this.saldoProduto = saldoProduto;
	}





	public String getLocArmazenamento() {
		return locArmazenamento;
	}





	public void setLocArmazenamento(String locArmazenamento) {
		this.locArmazenamento = locArmazenamento;
	}





	public Estoque() {
		// TODO Auto-generated constructor stub
	}

}
