package br.com.fiap.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_PRODUTOS")
public class Produtos {
	
	@Id
	@SequenceGenerator(name = "produtos" , sequenceName = "sq_tb_produtos", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "produtos" )
	private Integer IdProduto ;
	
	@Column(name="descProduto", nullable = false , length = 20)
	private String descProduto;
	
	@Column(name="tipProduto", nullable = false , length = 20)
	private Character tipProduto;
	
	@Column(name="cusProduto" )
	private double cusProduto;
	
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categorias categoria;
	
	@OneToOne(mappedBy = "produto")
	private Estoque estoque;
	
//	@OneToOne(mappedBy = "id_produto")
//	private ItemVenda itemVenda;
	
	
	public Estoque getEstoque() {
		return estoque;
	}



	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}



	public Integer getIdProduto() {
		return IdProduto;
	}
	
	

	public Categorias getCategoria() {
		return categoria;
	}



	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}



	public Produtos() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Produtos(Integer idProduto, String descProduto, Character tipProduto, double cusProduto) {
		super();
		IdProduto = idProduto;
		this.descProduto = descProduto;
		this.tipProduto = tipProduto;
		this.cusProduto = cusProduto;
	}



	public void setIdProduto(Integer idProduto) {
		IdProduto = idProduto;
	}

	public String getDescProduto() {
		return descProduto;
	}

	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}

	public Character getTipProduto() {
		return tipProduto;
	}

	public void setTipProduto(Character tipProduto) {
		this.tipProduto = tipProduto;
	}

	public double getCusProduto() {
		return cusProduto;
	}

	public void setCusProduto(double cusProduto) {
		this.cusProduto = cusProduto;
	}
	
	
	
}
