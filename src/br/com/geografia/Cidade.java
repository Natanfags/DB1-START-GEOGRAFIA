package br.com.geografia;

public class Cidade {

	private String nome;
	private Estado estado;

	public Cidade(String nome)
		{
			this.nome = nome;
			this.estado = Estado.daCidade(this);
		}

	@Override
	public boolean equals(Object object) {
		Cidade outraCidade = (Cidade) object;
		return this.nome.equals(outraCidade.nome) && this.estado.equals(outraCidade.estado);
	}

	@Override
	public String toString() {
		return "Pertence ao " + estado + (isCapital() ? ", É capital." : ", Não é capital.");
	}

	public String getNome() {
		return this.nome;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public boolean isCapital() {
		switch (this.nome) {
		case "Curitiba":
		case "Florianópolis":
		case "Porto Alegre":
			return true;
		default:
			return false;

		}
	}

}
