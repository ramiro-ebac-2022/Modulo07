package br.com.zavala;

import java.util.Objects;

/**
 * Representa a entidade ESTOQUE no sistema. Podem existir um ou vários estoques.
 * Pode ser utilizado um estoque para armazenar produtos da mesma natureza.
 * @author Ramiro
 *
 */
public class Estoque {

	private Integer codigoEstoque;
	private String descricaoEstoque;
	public Integer getCodigoEstoque() {
		return codigoEstoque;
	}
	public void setCodigoEstoque(Integer codigoEstoque) {
		this.codigoEstoque = codigoEstoque;
	}
	public String getDescricaoEstoque() {
		return descricaoEstoque;
	}
	public void setDescricaoEstoque(String descricaoEstoque) {
		this.descricaoEstoque = descricaoEstoque;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigoEstoque);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estoque other = (Estoque) obj;
		return Objects.equals(codigoEstoque, other.codigoEstoque);
	}
	
	
}
