package b;

public class TesteWhile {

	public static void main(String[] args) {
		
		/*Diferen�a usando "do while". Este primeiro exemplo possui a condi��o verificada
		 antes de ser executado o bloco e o pr�ximo exemplo possui a condi��o no final do bloco,
		 executando primeiro o bloco para depois verificar a condi��o*/
		
		int i = 20;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		int j = 20;
		do {
			System.out.println(j);
			j++;
		} while (j < 10); // Se for verdadeiro retorna e executa o bloco novamente
	}
}
