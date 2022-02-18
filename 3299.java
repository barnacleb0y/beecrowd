import java.util.Scanner;

public class NumerosMaSortePequenos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String numero = entrada.nextLine();
		
		char[] digitos = numero.toCharArray();
		
		boolean malaSuerte = false;
		
		for(int i = 0; i < digitos.length - 1; i++) {
			if(Character.getNumericValue(digitos[i]) == 1) {
				if(Character.getNumericValue(digitos[i + 1]) == 3) {
					malaSuerte = true;
					break;
				} 
			}
		}
		
		if(malaSuerte) {
			System.out.println(numero + " es de Mala Suerte");
		} else {
			System.out.println(numero + " NO es de Mala Suerte");
		}
		
	}
}
