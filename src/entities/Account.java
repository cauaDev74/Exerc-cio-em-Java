package entities;

public class Account {
    private String titular;
    private double saldo;
    private static int totalContas = 0;

    //Construtores
    public Account(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
        totalContas++;
    }

    //Getters e Setters
    public String getTitular(){return titular;}

    public void setTitular(String titular){
        //Set para modificar o nome do titular caso precise;
        this.titular = titular;
    }

    public double getSaldo(){return saldo;}

    //Methods

    public static int getTotalContas(){return totalContas;}

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Saldo atualizado.");
        }else{
            System.out.println("Erro.");
        }

    }
    public void sacar(double valor){
        if(valor > 0 && this.saldo >= valor ){
            this.saldo -= valor;
            System.out.println("Saldo atualizado.");
        }else{
            System.out.println("Erro.");
        }
    }



}
