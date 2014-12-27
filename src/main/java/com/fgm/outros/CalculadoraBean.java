package com.fgm.outros;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalculadoraBean {
	private Double valorA;
	private Double valorB;
	private Double resultado;

	public void somar() {
		this.resultado = this.valorA + this.valorB;
	}
	// getters e setters
}