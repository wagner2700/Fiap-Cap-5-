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
@Table(name="TB_ITEMVENDA")
public class ItemVenda {
	
	

	@Id
	@SequenceGenerator(name = "itemvenda" , sequenceName = "sq_item_venda",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="itemvenda" )
	private Integer seqItem;
	
	@Column(name="detalhesVenda" , length = 100)
	private String detalhes;
	
	@ManyToOne
	private Vendas venda;
	
	@OneToOne
	@JoinColumn(name="id_produto")
	private Produtos produto;
	
	
	public String getDetalhes() {
		return detalhes;
	}





	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}





	public Vendas getVenda() {
		return venda;
	}





	public void setVenda(Vendas venda) {
		this.venda = venda;
	}





	public Produtos getProduto() {
		return (Produtos) produto;
	}





	public void setProduto(Produtos produto) {
		this.produto = (Produtos) produto;
	}





	public ItemVenda() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Integer getSeqItem() {
		return seqItem;
	}





	public void setSeqItem(Integer seqItem) {
		this.seqItem = seqItem;
	}





	public ItemVenda(Integer seqItem) {
		super();
		this.seqItem = seqItem;
	}
	
	
	
	

	

}
