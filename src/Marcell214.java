import java.util.HashMap;
import java.util.Scanner;

public class Marcell214 {

	public static boolean proximoRey(Scanner scan) {
		boolean continuar = true;
		int reyes = scan.nextInt();
		if (reyes == 0) {
			continuar = false;
		} else {
			String array[] = new String[reyes];
			for (int i = 0; i < array.length; i++) {
				array[i] = scan.next();
			}
			int reyesBuscados = scan.nextInt();
			String array2[] = new String[reyesBuscados];
			for (int a = 0; a < array2.length; a++) {
				array2[a] = scan.next();
			}
			HashMap<String, Integer> listadoReyes = new HashMap<String, Integer>();
			for (String word : array) {
				if (listadoReyes.containsKey(word)) {
					listadoReyes.put(word, listadoReyes.get(word) + 1);
				} else {
					listadoReyes.put(word, 1);
				}
			}
			for (String word2 : array2)
				if (listadoReyes.containsKey(word2)) {
					listadoReyes.put(word2, listadoReyes.get(word2) + 1);
					System.out.println(listadoReyes.get(word2));
				} else {
					listadoReyes.put(word2, 1);
					System.out.println(listadoReyes.get(word2));
				}
			System.out.println();
		}
		return continuar;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (proximoRey(scan))
			;
	}
}
