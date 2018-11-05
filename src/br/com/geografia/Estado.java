package br.com.geografia;

public class Estado {

	private String nome;
	private String sigla;

	public Estado(String nome, String sigla)
		{
			this.nome = nome;
			this.sigla = sigla;
		}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}

	@Override
	public boolean equals(Object object) {
		Estado outroEstado = (Estado) object;
		return this.nome.toLowerCase().equals(outroEstado.nome.toLowerCase()) && this.sigla.equals(outroEstado.sigla);
	}

	@Override
	public String toString() {
		return this.sigla;
	}

	public static Estado daCidade(Cidade cidade) {
		switch (cidade.getNome()) {
		case "Curitiba":
		case "Maringá":
		case "Londrina":
		case "Pinhais":
			return new Estado("Paraná", "PR");
		case "Chapecó":
		case "Joinvile":
		case "Blumenau":
		case "Florianópolis":
			return new Estado("Santa Catarina", "SC");
		case "Porto Alegre":
		case "Gramado":
			return new Estado("Rio Grande do Sul", "RS");
		default:
			throw new IllegalArgumentException("Cidade inválida");

		}
	}

}
