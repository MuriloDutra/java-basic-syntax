public class TestaCondicional2 {
	public static void main(String[] args) {
		int idade = 18;
		int quantidadePessoas = 2; 
		boolean podemEntrar = false;
		
		if(idade >= 18 && quantidadePessoas >= 2){
			podemEntrar = true;
		}
		
		if(podemEntrar) {
			System.out.println("Bem-vindos.");
		}else {
			System.out.println("Infelizmente nao pode entrar");
		}
	}
}