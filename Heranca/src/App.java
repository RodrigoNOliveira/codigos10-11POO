import java.util.Locale;

import Classes.Banco;
import Classes.Conta;
import Classes.ContaEmpresarial;
import Classes.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Banco b1 = new Banco();
        b1.iniciar();
        /*Conta c1 = new Conta(1, "Jorge", 100.00);
        System.out.println(c1);
        Conta c2 = new ContaEmpresarial(2, "Pedro", 17000.00, 100000.00);
        System.out.println(c2);
        Conta c3 = new ContaPoupanca(3, "Rodigo", 10000, 1.0);
        System.out.println(c3);

        System.out.println();
        System.out.println();

        c1.saque(50);
        c2.saque(50);
        //c3.saque(50);
        System.out.println(c1);
        System.out.println(c2);
        //System.out.println(c3);




        if(c2 instanceof ContaPoupanca){

        ContaPoupanca cp = (ContaPoupanca) c2;
        cp.renderJuros();
        System.out.println(cp);
        c2 = cp;
        } else if(c2 instanceof ContaEmpresarial){
            ContaEmpresarial ce = (ContaEmpresarial)c2;
            System.out.println(ce);
            ce.pegaEmprestimo(2000);
            c2 = ce;
            System.out.println(c2);
        }*/
        


    }
}
