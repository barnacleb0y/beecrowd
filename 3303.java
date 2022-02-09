import java.util.Scanner;

public class Palavrao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String palavra = entrada.nextLine();
		
		if(palavra.length() >= 10) {
			System.out.println("palavrao");
		} else {
			System.out.println("palavrinha");
		}
	}
}