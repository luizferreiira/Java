package org.me.projetobancodigital;

public class ContaPoupanca extends ContaBancaria{

    private double saldo;

    public ContaPoupanca(double saldo, double deposito, double saque, double transferencia) {

        super(deposito, saque, transferencia);
        this.saldo = saldo;

    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public double SaldoAttDeposito(){

        return (this.getSaldo() + this.getDeposito());

    }

    @Override
    public double SaldoAttSaque() {
        return this.SaldoAttDeposito() - this.getSaque();
    }

    @Override
    public double SaldoAttTransferencia() {
        return this.SaldoAttSaque() - this.getTransferencia();
    }

    @Override
    public String toString(){

        return String.format("%s \n %s %.2f \n %s %.2f \n %s %.2f",super.toString(), "Saldo atualizado Após deposito: ", this.SaldoAttDeposito(),
                "Saldo atualizado após saque: ", this.SaldoAttSaque(), "Saldo atualizado após transferência: ", this.SaldoAttTransferencia());

    }
}
