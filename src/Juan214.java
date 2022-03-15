import java.util.HashMap;
import java.util.Scanner;

public class Juan214 {

	public static boolean dinastia(Scanner in) {
		boolean seguir = true;
		int cantidadDeReyes = in.nextInt();
		if (cantidadDeReyes == 0)
			seguir = false;
		else {
			String[] listaReyes = new String[cantidadDeReyes];
			for (int i = 0; i < cantidadDeReyes; i++) {
				listaReyes[i] = in.next();
			}
			int futurosReyes = in.nextInt();
			String[] listaFuturosReyes = new String[futurosReyes];
			for (int i = 0; i < futurosReyes; i++) {
				listaFuturosReyes[i] = in.next();
			}
			HashMap<String, Integer> miTabla = new HashMap<>();
			for (int i = 0; i < listaReyes.length; i++) {
				String reyActual = listaReyes[i];
				if (miTabla.containsKey(reyActual))
					miTabla.put(reyActual, miTabla.get(reyActual) + 1);
				else
					miTabla.put(reyActual, 1);
			}
			for (int i = 0; i < listaFuturosReyes.length; i++) {
				String reyActual = listaFuturosReyes[i];
				if (miTabla.containsKey(reyActual)) {
					miTabla.put(reyActual, miTabla.get(reyActual) + 1);
					System.out.println(miTabla.get(reyActual));
				} else {
					miTabla.put(reyActual, 1);
					System.out.println(miTabla.get(reyActual));
				}
			}
		}
		return seguir;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (dinastia(in))
			System.out.println("");
		;
	}
}