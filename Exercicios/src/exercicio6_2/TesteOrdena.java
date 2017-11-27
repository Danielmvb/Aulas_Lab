package exercicio6_2;

public class TesteOrdena {
	public static void main(String[] args) {
	Ordena[] ordens = { new OrdenaBubbleSort(), new OrdenaInsertionSort() };

	PainelOrdenacao painel;
	for(Ordena ordem:ordens)
	{
		painel = new PainelOrdenacao(ordem);
		painel.ordenar();
	}
}

}
