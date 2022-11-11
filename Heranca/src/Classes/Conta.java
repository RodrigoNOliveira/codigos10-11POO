package Classes;

public class Conta {


    protected int numero;
    protected String proprietario;
    protected double saldo;

    public Conta() {
    }

    public Conta(int numero, String proprietario, double saldo) {
        this.numero = numero;
        this.proprietario = proprietario;
        this.saldo = saldo;
    }





    public void deposito(double valor){
        this.saldo+= valor;
    }
    
    public void saque(double valor){
       this.saldo-= (valor + 5.0);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getProprietario() {
        return proprietario;
    }

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", proprietario=" + proprietario + ", saldo=" + saldo + "]";
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

   
   
    
    
}
