package Classes;

public class ContaPoupanca extends Conta{
    
    private Double taxaRendimento;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(int numero, String proprietario, double saldo, Double taxaRendimento) {
        super(numero, proprietario, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void saque(double quantia){
            this.saldo -= quantia;
    }



    public void renderJuros(){
        this.saldo += (this.saldo*taxaRendimento)/100;
    }



    @Override
    public String toString() {
        return "ContaPoupanca [numero=" + numero + ", proprietario=" + proprietario + ", saldo=" + saldo + ", taxaRendimento=" + taxaRendimento + "]";
    }

    public Double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(Double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    
}
