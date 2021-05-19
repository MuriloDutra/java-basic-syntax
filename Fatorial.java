public class Fatorial {
	public static void main(String [] args) {
		int total = 1;
		
		for(int numero = 1; numero < 11; numero++) {
			total = total * numero;
			System.out.println("Fatorial de " + numero + " = " +total);
		}
	}
}