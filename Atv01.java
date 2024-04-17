package repeticao;

import java.util.Scanner;

public class Atv01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		
		
		for (int  i=0; i <= 5 ; i++) {
			System.out.println("informe seu nome: ");
			nome = ler.next();
			System.out.println("o seu nome é: "+nome);
		}
		ler.close();
	}

}
