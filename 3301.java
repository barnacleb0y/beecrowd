import java.util.ArrayList;
import java.util.Scanner;

public class SobrinhodoMeio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String idades = entrada.nextLine();
		
		String[] arrayIdadesString = idades.split(" ");
		
		ArrayList<Integer> arrayIdadesInt = new ArrayList<Integer>();
		
		for(int i = 0; i < arrayIdadesString.length; i++) {
			arrayIdadesInt.add(Integer.parseInt(arrayIdadesString[i]));
		}
		
		if(arrayIdadesInt.get(0) > arrayIdadesInt.get(1) && arrayIdadesInt.get(0) > arrayIdadesInt.get(2)) {
			if(arrayIdadesInt.get(1) > arrayIdadesInt.get(2)) {
				System.out.println("zezinho");
			} else {
				System.out.println("luisinho");
			}
		} else if(arrayIdadesInt.get(1) > arrayIdadesInt.get(0) && arrayIdadesInt.get(1) > arrayIdadesInt.get(2)) {
			if(arrayIdadesInt.get(0) > arrayIdadesInt.get(2)) {
				System.out.println("huguinho");
			} else {
				System.out.println("luisinho");
			}
		} else {
			if(arrayIdadesInt.get(0) > arrayIdadesInt.get(1)) {
				System.out.println("huguinho");
			} else {
				System.out.println("zezinho");
			}
		}
	}
}
