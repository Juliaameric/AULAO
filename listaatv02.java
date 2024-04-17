package repeticao;

import java.util.Scanner;

public class listaatv02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
			int numero,soma=0,media ;
			
			for (int i =0; i<=4; i++) {
				System.out.print("informe um numero: ");
				
				numero= ler.nextInt();
				
				soma= soma + numero ;
				
				System.out.println("a soma dos valores é " + soma);
			}
				
				media= soma/5;
				System.out.println("a media dos valores é " +media);
			
	}

}
