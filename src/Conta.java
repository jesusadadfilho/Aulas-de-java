public class Conta {
    private double saldo;
    private String nome;
    private double saldoDevedor;

    public Conta(String nome) {
        this.nome = nome;
        this.saldo = 0;
    }

    public Conta(){
        this.saldo = 100;
    }

    public double getSaldo() {
        return saldo;
    }


    public String getNome() {
        return nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public double depositar(double valor){
        this.saldo += valor;
        return getSaldo();
    }

    public boolean sacar(double valor){
        if (this.saldo < valor){
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public boolean trasferir(Conta conta, double valor){
        if(this.saldo < valor){
            return false;
        }else{
            this.saldo -= valor;
            conta.depositar(valor);
            return true;
        }

    }

}
