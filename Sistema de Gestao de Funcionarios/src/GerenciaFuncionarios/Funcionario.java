package GerenciaFuncionarios;

public class Funcionario {
    String nome;
    String departamento;
    String cargo;
    String rg;
    Data dataEntradaBanco;
    double salario;
    double bancoDeHoras = 0.0;
    boolean ferias = false;
    
    Funcionario(String nome, String dept, String cargo, String rg, int dia, int mes, int ano, double salario){
        this.nome = nome;
        this.departamento = dept;
        this.cargo = cargo;
        this.rg = rg;
        this.dataEntradaBanco = new Data(dia, mes,ano);
        this.salario = salario;
    }
    
    void mostraSimples(){
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Cargo: " + cargo);
        System.out.println("Data de entrada na empresa: " + this.dataEntradaBanco.formatada());
    }
    
    void mostraCompleta(){
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("Departamento: " + departamento);
        System.out.println("Cargo: " + cargo);
        System.out.println("Data de entrada na empresa: " + this.dataEntradaBanco.formatada());
        System.out.println("Salario: R$" + salario);
        System.out.println("Banco de horas: " + bancoDeHoras);
        
        if(ferias){
            System.out.println("Está de férias.");
        }else{
            System.out.println("Não está de férias");
        }
    }
    
    void recebeAumento(double aumento){
        this.salario += aumento;
    }
    
    double calculaGanhoAnual(){
        return (this.salario * 12);
    }
    
    void mudaDepartamento(String novoDept){
        this.departamento = novoDept;
    }
    
    void recebePromocao(String departamento, String cargo, double aumento){
        this.departamento = departamento;
        this.cargo = cargo;
        recebeAumento(aumento);
    }
    
    void recebePromocao(String cargo, double aumento){
        this.cargo = cargo;
        recebeAumento(aumento);
    }
    
    void acrescentaHoras(double horas){
        bancoDeHoras += horas;
    }
    
    void diminuiHoras(double horas){
        bancoDeHoras -= horas;
    }
    
    void setFerias(boolean ferias){
        this.ferias = ferias;
    }
    
    boolean getFerias(){
        return ferias;
    }
}
