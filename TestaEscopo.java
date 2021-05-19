public class TestaEscopo {
	public static void main(String [] args) {
		int idade = 18;
		int quantidadePessoas = 2; 
		boolean acompanhado;

		if(quantidadePessoas >= 2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		
		if(acompanhado) {
			System.out.println("Bem-vindos.");
		}else {
			System.out.println("Infelizmente nao pode entrar");
		}
	}
}