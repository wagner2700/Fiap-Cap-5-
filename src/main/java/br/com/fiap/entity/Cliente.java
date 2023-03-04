package br.com.fiap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_CLIENTE")
public class Cliente {
	
	@Id
	@SequenceGenerator(name = "cliente" , sequenceName = "sq_tb_cliente", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cliente" )
	private Integer idCliente;
	
	@Column(name = "nm_Cliente", length = 30)
	private String nmCliente;
	
	@Column(name = "nm_Cidade", length = 30)
	private String nmCidade;
	
	@Column(name = "nm_Estado", length = 30)
	private String nmEstado ;
	
	@Column(name = "nm_Rua", length = 100)
	private String nmRua ; 
	
	@Column(name = "nm_Casa")
	private int nrCasa;
	




	public Cliente(Integer idCliente, String nmCliente, String nmCidade, String nmEstado, String nmRua, int nrCasa) {
		super();
		this.idCliente = idCliente;
		this.nmCliente = nmCliente;
		this.nmCidade = nmCidade;
		this.nmEstado = nmEstado;
		this.nmRua = nmRua;
		this.nrCasa = nrCasa;
	}




	public Integer getIdCliente() {
		return idCliente;
	}




	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}




	public String getNmCliente() {
		return nmCliente;
	}




	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
	}




	public String getNmCidade() {
		return nmCidade;
	}




	public void setNmCidade(String nmCidade) {
		this.nmCidade = nmCidade;
	}




	public String getNmEstado() {
		return nmEstado;
	}




	public void setNmEstado(String nmEstado) {
		this.nmEstado = nmEstado;
	}




	public String getNmRua() {
		return nmRua;
	}




	public void setNmRua(String nmRua) {
		this.nmRua = nmRua;
	}




	public int getNrCasa() {
		return nrCasa;
	}




	public void setNrCasa(int nrCasa) {
		this.nrCasa = nrCasa;
	}




	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
