package org.me.projetobancodigital;

public abstract class ContaBancaria {

    private double deposito, saque, transferencia;

    public ContaBancaria(double deposito, double saque, double transferencia){

        this.deposito = deposito;
        this.saque = saque;
        this.transferencia = transferencia;

    }

    public double getDeposito() {
        return deposito;
    }

    public double getSaque() {
        return saque;
    }

    public double getTransferencia() {
        return transferencia;
    }

    public abstract double SaldoAttDeposito();

    public abstract double SaldoAttSaque();

    public abstract double SaldoAttTransferencia();

    public String toString(){

        return String.format("%s %.2f \n %s %.2f \n %s %.2f","Deposito: ", this.getDeposito(),"Saque: ",
                this.getSaque(), "Transferência: ", this.getTransferencia());

    }

}
