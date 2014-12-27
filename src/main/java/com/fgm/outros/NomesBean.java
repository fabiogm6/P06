package com.fgm.outros;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
 import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;


@ManagedBean
@ViewScoped
public class NomesBean {
	private String nome;
	private List<String> nomes = new ArrayList<>();

	private HtmlInputText inputNome;
	private HtmlCommandButton botaoAdicionar;

	public void adicionar() {
		this.nomes.add(nome);
		
		// desativa campo e botão quando mais que 3 nomes
		// forem adicionados
		if (this.nomes.size() > 3) {
			this.inputNome.setDisabled(true);
			this.botaoAdicionar.setDisabled(true);
			this.botaoAdicionar.setValue("Muitos nomes adicionados...");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getNomes() {
		return nomes;
	}
}