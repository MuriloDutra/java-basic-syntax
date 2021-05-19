public class TestaCaracteres {
	public static void main(String [] args) {
		char letra = 'a';
		System.out.println("letra: " + letra);
		
		char valor = 66;
		System.out.println("valor: " + valor);

		valor = (char) (valor + 1);//67
		System.out.println("valor: " + valor);
		
		String palavra = "Alura cursos online de tecnologia";
		System.out.println("palavra: " + palavra);
		
		palavra = palavra + 2020;
		System.out.println("palavra: " + palavra);
	}
}