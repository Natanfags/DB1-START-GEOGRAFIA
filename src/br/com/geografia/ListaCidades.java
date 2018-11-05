package br.com.geografia;

import java.util.ArrayList;
import java.util.List;

public class ListaCidades {

	private List<Cidade> cidades;

	public ListaCidades()
		{
			this.cidades = new ArrayList<>();
			this.cidades.add(new Cidade("Curitiba"));
			this.cidades.add(new Cidade("Maring�"));
			this.cidades.add(new Cidade("Londrina"));
			this.cidades.add(new Cidade("Pinhais"));
			this.cidades.add(new Cidade("Chapec�"));
			this.cidades.add(new Cidade("Joinvile"));
			this.cidades.add(new Cidade("Blumenau"));
			this.cidades.add(new Cidade("Florian�polis"));
			this.cidades.add(new Cidade("Porto Alegre"));
			this.cidades.add(new Cidade("Gramado"));
		}

	public List<Cidade> getCidades() {
		return cidades;
	}

	public Cidade encontrarCidades(Cidade cidadeEntrada) {
		for (Cidade cidade : this.getCidades()) {
			if (cidade.equals(cidadeEntrada)) {
				return cidade;
			}
		}
		return null;
	}
}
