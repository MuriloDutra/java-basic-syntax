public class TestaConversao {
	public static void main(String [] args) {
		double salario = 1270.50;
		int valor = (int) salario; //Casting. Convertendo de 'double' para 'int'.
		System.out.println(valor);
		
		long numeroGrande = 132132143431414312l;
		short valorPequeno = 2131;
		byte valorSuperPequeno = 127;
		float pontoFlutuante = 3.14f; //or float pontoFlutuante = (float) 3.14;
		
		double valor01 = 0.2;
		double valor02 = 0.1;
		double total = valor01 + valor02;
		System.out.println(total);
	}
}