package br.com.caelum.argentum.managedbeans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.caelum.argentum.modelo.Negociacao;
import br.com.caelum.argentum.ws.ClienteWebService;

@ManagedBean
@ViewScoped
public class ArgentumBean implements Serializable{
	
	//por conta do ViewScoped deve implementar serializable
	
	private List<Negociacao> negociacoes;
	
	public ArgentumBean() {
		this.negociacoes = new ClienteWebService().getNegociacoes();
	}
	
	public List<Negociacao> getNegociacoes(){
		return this.negociacoes;
	}
}
