package br.com.fiap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_CATEGORIAS")
public class Categorias {
	@Id
	@SequenceGenerator(name = "categorias" , sequenceName = "sq_tb_categorias", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "categorias" )
	private Integer IdCategoria ;
	
	@Column(name="descCategoria", nullable = false , length = 30)
	private String descCategoria;

	
	
	
	
	public Integer getIdCategoria() {
		return IdCategoria;
	}

	
	
	public Categorias(Integer idCategoria, String descCategoria) {
		super();
		IdCategoria = idCategoria;
		this.descCategoria = descCategoria;
	}



	public Categorias() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void setIdCategoria(Integer idCategoria) {
		IdCategoria = idCategoria;
	}

	public String getDescCategoria() {
		return descCategoria;
	}

	public void setDescCategoria(String descCategoria) {
		this.descCategoria = descCategoria;
	}
	
	
	
	
}
