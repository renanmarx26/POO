public class ContaBancaria {

    int numero;
    String titular;
    double saldo;


    void depositar_dinheiro(double valor_deposito){
        System.out.println("Digite o valor do deposito: ");
        saldo = saldo + valor_deposito;
        System.out.println("Deposito de " + valor_deposito + "realizado");
    }
    void sacar_dinheiro(double valor_saque){
        System.out.println("Digite o valor do saque: ");

        if (saldo > valor_saque){
            saldo = saldo - valor_saque;
        }
        else{
            System.out.println("Você não possui saldo suficiente.");
        }
    }
   void saldo_conta(double saldo){
     System.out.println("Seu saldo é de: " + saldo);
 }

}
