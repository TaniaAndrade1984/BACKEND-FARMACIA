package org.generation.farmacia.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")	
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@UpdateTimestamp
	private LocalDateTime validade; 
	
	@NotBlank(message  = "O atributo nome é obrigatório!")
	@Size(min = 5, max = 100, message =  "O atributo nome deve conter no minimo 05 e no máximo 500 caracteres")
	private String nome;
	
	@NumberFormat(style = Style.CURRENCY)
	private Float valor;
	
	private String generico;
	@NotBlank(message = "O atributo fornecedor é obrigatorio!")
	@Size(min = 5, max = 100, message = "O atributo fornecedor deve conter no minimo 05 caracteres")
	
	private String fornecedor;
	@NotBlank(message = "O atributo lote é obrigatorio!")
	@Size(min = 2, max = 100, message = "O atributo lote deve conter no minimo 02 caracteres")
	
	private String lote; 
	@NotBlank(message = "O atributo lote é obrigatorio!")
	@Size(min = 2, max = 100, message = "O atributo lote deve conter no minimo 02 caracteres")
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	public Long getId() {
		return id;
	}
	public LocalDateTime getValidade() {
		return validade;
	}
	public String getNome() {
		return nome;
	}
	public Float getValor() {
		return valor;
	}
	public String getGenerico() {
		return generico;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public String getLote() {
		return lote;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setValidade(LocalDateTime validade) {
		this.validade = validade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public void setGenerico(String generico) {
		this.generico = generico;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
	
	
	
	
	

