package br.com.fiap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_FORNECEDOR")
public class Fornecedor {
	
	@Id
	@SequenceGenerator(name = "fornecedor" ,sequenceName = "sq_fornecedor", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "fornecedor")
	private Integer IdFornecedor;
	
	@Column(name="nm_Fornecedor", length = 30)
	private String nomeFornecedor;
	
	@Column(name="nm_Cidade" , length = 30)
	private String cidade;
	
	@Column(name="nm_Estado" , length = 30)
	private String estado;
	
	
	
	
	


	public Fornecedor(Integer idFornecedor, String nomeFornecedor, String cidade, String estado) {
		super();
		IdFornecedor = idFornecedor;
		this.nomeFornecedor = nomeFornecedor;
		this.cidade = cidade;
		this.estado = estado;
	}



	


	public Integer getIdFornecedor() {
		return IdFornecedor;
	}



	public void setIdFornecedor(Integer idFornecedor) {
		IdFornecedor = idFornecedor;
	}



	public String getNomeFornecedor() {
		return nomeFornecedor;
	}



	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public Fornecedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
