package GerenciaFuncionarios;

public class Empresa {
    String nome;
    String cnpj;
    int funcionarios = 0;
    Funcionario[] empregado;
    
    Empresa(String nome, String cnpj, int funcionarios){
        this.nome = nome;
        this.cnpj = cnpj;
        this.empregado = new Funcionario[funcionarios];
    }
    
    void cadastraFuncionario(String nome, String dept, String cargo, String rg, int dia, int mes, int ano, double salario){
        empregado[this.funcionarios] = new Funcionario(nome, dept, cargo, rg, dia, mes, ano, salario);
        funcionarios++;
    }
    
    void listaSimplesFuncionarios(){
        int i = 0;
        
        for(Funcionario x : empregado){
            System.out.println("Número Funcionário: " + i);
            x.mostraSimples();
            i++;
        }
    }
    
    void listaCompletaFuncionarios(){
        int i = 0;
        
        for(Funcionario x : empregado){
            System.out.println("Número Funcionário: " + i);
            x.mostraCompleta();
            i++;
        }
    }
    
    void demiteFuncionario(int idFuncionario){
        for(int i = idFuncionario; i < empregado.length; i++){
            empregado[i] = empregado[i + 1];
        }
    }
}
