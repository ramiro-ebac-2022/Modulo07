package br.com.zavala;

import java.util.Objects;

/**
 * Esta classe representa a quantidade de unidades de um determinado produto, que estão
 * armazenados num determinado estoque.
 * @author Ramiro
 *
 */
public class EstoqueProduto {

	private Integer sku;
	private Integer codigoEstoque;
	private Integer quantidadeEstoque;
	public Integer getSku() {
		return sku;
	}
	public void setSku(Integer sku) {
		this.sku = sku;
	}
	public Integer getCodigoEstoque() {
		return codigoEstoque;
	}
	public void setCodigoEstoque(Integer codigoEstoque) {
		this.codigoEstoque = codigoEstoque;
	}
	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigoEstoque, sku);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EstoqueProduto other = (EstoqueProduto) obj;
		return Objects.equals(codigoEstoque, other.codigoEstoque) && Objects.equals(sku, other.sku);
	}
	
	
}
