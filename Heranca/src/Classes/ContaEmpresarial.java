package Classes;

public class ContaEmpresarial extends Conta{

    private double limiteEmprestimo;

    public ContaEmpresarial() {
        super();
    }


    public ContaEmpresarial(int numero, String proprietario, double saldo, double limiteEmprestimo) {
        super(numero, proprietario, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    @Override
    public void saque(double quantia){
        super.saque(quantia);
        this.saldo -= 2;
    }


    @Override
    public String toString() {
        return "ContaEmpresarial [numero=" + numero + ", proprietario=" + proprietario + ", saldo=" + saldo + ", limite de emprestimo " + this.limiteEmprestimo + " ]";
    }


    public void pegaEmprestimo(double quantia){
        if(quantia <= this.limiteEmprestimo){
            this.saldo += quantia - 10;
        }
    }


    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }


    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    
    
}
