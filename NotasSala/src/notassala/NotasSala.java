/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notassala;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class NotasSala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numAlunos = 0, acimaDaMedia = 0;
		
        Scanner sc = new Scanner(System.in);		
		
	System.out.println("Quantos alunos essa classe possui?");
	numAlunos = sc.nextInt();
		
	Classe classe = new Classe(numAlunos);
		
	System.out.println("Digite a nota de cada um dos alunos a seguir:");
	classe.atribuiNotas();
	
	System.out.println("A media da sala e': " + classe.getMedia());
	
	acimaDaMedia = classe.acimaDaMedia();
	System.out.println("O num de alunos acima da media e': " + acimaDaMedia);

	System.exit(0);
    }
    
}
