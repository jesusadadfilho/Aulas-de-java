public class Caixa {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta("alysson");
        ContaPoupança conta3 = new ContaPoupança("david");
        Conta conta4 = new ContaCorrente("jesus");
        System.out.println(conta1.getSaldo());
        conta1.depositar(5000);
        conta2.depositar(100);
        conta3.depositar(200);
        conta4.depositar(10000);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        conta1.trasferir(conta3,2450);
        conta4.sacar(1000);
        System.out.println(conta1.getSaldo() + "-" + conta1.getNome());
        System.out.println(conta3.getSaldo() + "-" + conta3.getNome());
        System.out.println(conta4.getSaldo() + "-" + conta4.getNome());
    }
}
