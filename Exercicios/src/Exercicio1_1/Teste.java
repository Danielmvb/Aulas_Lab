package Exercicio1_1;

public class Teste {

	public static void main(String[] args) {
		Teste teste = new Teste();
		teste.aleatorio();
		String mensagem = "shutdown -s -t 3600";
		EscritorFactory factory = new EscritorFactory();
		Escritor escritor = factory.getEscritorInstance(teste.aleatorio());
		escritor.escrever(mensagem);
		
	}
	
	public int aleatorio() {
		double decimal = Math.random();	
		decimal *= 100;		
		int inteiro = (int)decimal;		
		int resto = inteiro%2;		
		int resultado = resto + 1;		
		return resultado;
	}

}
