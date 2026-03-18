package Application;

import entities.Account;

import java.util.Scanner;

import static entities.Account.getTotalContas;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        double valor;

        int select = 0;

        Account conta1 = new Account("Caua", 500.00);

        Account conta2 = new Account("Ana", 320.50);


        System.out.println("Contas: ");
        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo: " + conta1.getSaldo());

        System.out.println("Titular: " + conta2.getTitular());
        System.out.println("Saldo: " + conta2.getSaldo());

        System.out.print("Efetue um deposito: ");
        valor = sc.nextDouble();
        sc.nextLine();
        conta1.depositar(valor);

        System.out.println();

        System.out.print("Efetue um deposito: ");
        valor = sc.nextDouble();
        sc.nextLine();
        conta2.depositar(valor);

        System.out.println();

        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo: " + conta1.getSaldo());
        System.out.print("Efetue um saque: ");
        valor = sc.nextDouble();
        sc.nextLine();
        conta1.sacar(valor);

        System.out.println("Titular: " + conta2.getTitular());
        System.out.println("Saldo: " + conta2.getSaldo());
        System.out.print("Efetue um saque: ");
        valor = sc.nextDouble();
        sc.nextLine();
        conta2.sacar(valor);

        //Extra
        for(int i = 0; i<3;i++){
            conta1.depositar(50.00);
        }

        System.out.println();
        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo: " + conta1.getSaldo());
        System.out.println();
        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo: " + conta1.getSaldo());

        System.out.println("Total de contas criadas: " + getTotalContas());

    }
}
