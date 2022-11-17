package br.com.zavala;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Esta classe representa a entidade PRODUTO.
 * @author Ramiro
 *
 */
public class Produto {

	private Integer sku;
	private String nome;
	private Double precoUnitario;
	private BigDecimal comissao;
	public Integer getSku() {
		return sku;
	}
	public void setSku(Integer sku) {
		this.sku = sku;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public BigDecimal getComissao() {
		return comissao;
	}
	public void setComissao(BigDecimal comissao) {
		this.comissao = comissao;
	}
	@Override
	public int hashCode() {
		return Objects.hash(sku);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(sku, other.sku);
	}
	
	
}
