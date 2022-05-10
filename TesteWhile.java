package b;

public class TesteWhile {

	public static void main(String[] args) {
		
		/*Diferença usando "do while". Este primeiro exemplo possui a condição verificada
		 antes de ser executado o bloco e o próximo exemplo possui a condição no final do bloco,
		 executando primeiro o bloco para depois verificar a condição*/
		
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
