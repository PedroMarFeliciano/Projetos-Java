package GerenciaFuncionarios;

public class Data {
    int dia;
    int mes;
    int ano;
    
    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
    }
    
    String formatada(){
        String data = String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(ano);
        return data;
    }
}
