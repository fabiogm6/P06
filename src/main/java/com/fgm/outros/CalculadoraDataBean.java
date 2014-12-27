package com.fgm.outros;

import java.util.Calendar;
import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalculadoraDataBean {
	private Date dataBase;
	public Date getDataBase() {
		return dataBase;
	}

	public void setDataBase(Date dataBase) {
		this.dataBase = dataBase;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}

	public Date getResultado() {
		return resultado;
	}

	public void setResultado(Date resultado) {
		this.resultado = resultado;
	}

	private Integer dias;
	private Date resultado;

	public void adicionar() {
		Calendar dataCalculo = Calendar.getInstance();
		dataCalculo.setTime(this.dataBase);
		dataCalculo.add(Calendar.DAY_OF_MONTH, dias);
		this.resultado = dataCalculo.getTime();
	}
	// getter e setter
}