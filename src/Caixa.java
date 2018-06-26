public class Caixa {
    public static void main(String[] args) {
        Conta conta1 = new Conta("igor");
        conta1.depositar(5000);
        System.out.println(conta1.getSaldo());
        if(conta1.sacar(1000)){
            System.out.println(conta1.getSaldo());
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
