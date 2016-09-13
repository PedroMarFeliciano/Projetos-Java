package GerenciaFuncionarios;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        int opcao;
        int numEmpresa = 0;
        int empresaSelecionada = 0;
        boolean sair = false;
        
        Empresa empresa[] = null;       
        Scanner sc = new Scanner(System.in);
        
        while(!sair){
            if(numEmpresa == 0){
                System.out.println("Ainda não existem empresas cadastradas.\n"
                        + "Para começar a utilizar o sistema é necessário cadastrar pelo menos uma empresa.\n"
                        + "Digite o nome da empresa: ");
                String nome = sc.nextLine();
                
                System.out.println("Digite o CNPJ da " + nome + ": ");
                String cnpj = sc.nextLine();
                
                System.out.println("Digite o número de funcionários que a empresa possui: ");
                int numFuncionarios = sc.nextInt();
                
                empresa[numEmpresa] = new Empresa(nome, cnpj, numFuncionarios);
            }else{                
                int i = 0;
                for(Empresa x: empresa){
                    System.out.println((i + 1) + " - " + x.nome);
                }
                
                System.out.println("Selecione uma das empresas listada: ");
                empresaSelecionada = sc.nextInt();
                empresaSelecionada--;
            }
            
            System.out.println("EMPRESA SELECIONADA: " + (empresaSelecionada + 1) + empresa[empresaSelecionada].nome
                             + "1 - Cadastrar empresa.\n"
                             + "2 - Cadastrar funcionário.\n"
                             + "3 - Deletar funcinoário."
                             + "4 - Listar funcionários (simples).\n"
                             + "5 - Listar funcionários (completo).\n"
                             + "6 - Mostrar funcionário específico.\n"
                             + "7 - Ajustar férias.\n"
                             + "8 - Ajustar salário.\n"
                             + "9 - Ajustar banco de horas.\n"
                             + "10 - Ajustar departamento.\n"
                             + "11 - Promover funcionário.\n"
                             + "12 - TROCAR EMPRESA.\n"
                             + "13 - Sair\n\n"
                             + "Escolha a opção desejada: ");
            opcao = sc.nextInt();
            
            switch(opcao){
            case 1:
                String nome = sc.nextLine();
                String cnpj = sc.nextLine();
                int numFuncionarios = sc.nextInt();
                
                empresa[numEmpresa] = new Empresa(nome, cnpj, numFuncionarios);
                numEmpresa++;
            }
        }
    }
}
