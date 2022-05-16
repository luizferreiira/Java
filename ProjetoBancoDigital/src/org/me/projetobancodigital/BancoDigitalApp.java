package org.me.projetobancodigital;

public class BancoDigitalApp {
    public static void main(String[] args) {

        ContaPoupanca cp = new ContaPoupanca(1000, 500, 30, 30);
        ContaCorrente cc = new ContaCorrente(1000, 1000, 500, 100);

        System.out.println("Informações da conta poupança");
        System.out.println(cp.toString());

        System.out.println("***********************************");

        System.out.println("Informações da conta corrente");
        System.out.println(cc.toString());

    }
}
