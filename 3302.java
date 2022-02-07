import java.util.ArrayList;
import java.util.Scanner;

public class RespostaCerta {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numeroDePerguntas = entrada.nextInt();
		
		ArrayList<Integer> respostas = new ArrayList<Integer>();
		
		for(int i = 0; i < numeroDePerguntas; i++) {
			int resposta = entrada.nextInt();
			respostas.add(resposta);
		}
		
		for(int i = 0; i < numeroDePerguntas; i++) {
			System.out.println("resposta " + (i + 1) + ": " + respostas.get(i));
		}
	}
}