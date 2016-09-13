package notassala;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
 */
public class Classe {
    private int numAlunos;
    private float media = 0;
    private float somaNotas = 0;
	
    Aluno[] alunos = new Aluno[100];
    Scanner sc = new Scanner(System.in);
	
    Classe(int numAlunos){
	this.numAlunos = numAlunos;
    }
	
    public void atribuiNotas(){
	for(int i = 0; i < numAlunos; i++){
            Aluno a = new Aluno();
			
            float nota = sc.nextFloat();
			
            a.setNota(nota);
            alunos[i] = a;
            somaNotas += nota;
	}
		
        calculaMedia(somaNotas);
    }
	
    private void calculaMedia(float nota){		
	media = nota / numAlunos;
    }
    
    public float getMedia(){
        return media;
    }
	
    public int acimaDaMedia(){
        int maiorQueMedia = 0;
		
	for(int i = 0; i < numAlunos; i++){
            if(alunos[i].getNota() > media){
            maiorQueMedia++;
            }
	}
		
    return maiorQueMedia;
    }
}