import java.util.Scanner;

public class BolinhasDeNatal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantBolinhas = entrada.nextInt();
		int quantGalhos = entrada.nextInt();
		
		if(quantGalhos % 2 != 0) {
			quantGalhos -= 1;
		}
		
		int bolinhasFaltantes = 0;
		
		if(quantGalhos - quantBolinhas <= quantBolinhas) {
			System.out.println("Amelia tem todas bolinhas!");
		} else {
			bolinhasFaltantes = quantGalhos/2 - quantBolinhas;
			System.out.println("Faltam " + bolinhasFaltantes + " bolinha(s)");
		}
	}
}
