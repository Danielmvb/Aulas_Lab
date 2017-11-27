package exercicio6_2;

public class PainelOrdenacao {
	private final Ordena ordenacao;

	public PainelOrdenacao(Ordena o) {
		ordenacao = o;
	}

	public void ordenar() {
		ordenacao.ordem(null);
	}

}
