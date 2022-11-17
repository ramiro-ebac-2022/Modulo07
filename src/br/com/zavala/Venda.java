package br.com.zavala;

import java.util.Date;
import java.util.Objects;

/**
 * Esta classe representa a entidade VENDA.
 * @author Ramiro
 *
 */
public class Venda {

	private Integer codigoVenda;
	private Float valorTotal;
	private Float valorDesconto;
	private Float valorFrete;
	private String observacao;
	private Date dataVenda;
	private Date dataEntrega;
	public Integer getCodigoVenda() {
		return codigoVenda;
	}
	public void setCodigoVenda(Integer codigoVenda) {
		this.codigoVenda = codigoVenda;
	}
	public Float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Float getValorDesconto() {
		return valorDesconto;
	}
	public void setValorDesconto(Float valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	public Float getValorFrete() {
		return valorFrete;
	}
	public void setValorFrete(Float valorFrete) {
		this.valorFrete = valorFrete;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigoVenda);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		return Objects.equals(codigoVenda, other.codigoVenda);
	}
	
	
}
