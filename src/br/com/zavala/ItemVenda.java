package br.com.zavala;

import java.util.Objects;

/**
 * Esta classe representa os itens de uma venda. Está identificado pelo código da venda
 * e o código do produto vendido.
 * @author Ramiro
 *
 */
public class ItemVenda {

	private Integer codigoVenda;
	private Integer sku;
	private Integer quantidadeVendida;
	private Float valorUnitario;
	public Integer getCodigoVenda() {
		return codigoVenda;
	}
	public void setCodigoVenda(Integer codigoVenda) {
		this.codigoVenda = codigoVenda;
	}
	public Integer getSku() {
		return sku;
	}
	public void setSku(Integer sku) {
		this.sku = sku;
	}
	public Integer getQuantidadeVendida() {
		return quantidadeVendida;
	}
	public void setQuantidadeVendida(Integer quantidadeVendida) {
		this.quantidadeVendida = quantidadeVendida;
	}
	public Float getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(Float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigoVenda, sku);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemVenda other = (ItemVenda) obj;
		return Objects.equals(codigoVenda, other.codigoVenda) && Objects.equals(sku, other.sku);
	}
	
	
}
