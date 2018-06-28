public class ContaPoupança extends Conta {

    public ContaPoupança(String nome) {
        super(nome);
    }

    @Override
    public double depositar(double valor) {
        valor += 5;
        rendimento();
        return super.depositar(valor);
    }



    public void rendimento(){
        this.setSaldo(this.getSaldo() * 1.05);
    }
    public void rendimento(String nome){
        this.setSaldo(this.getSaldo() * 1.14);
    }

    public void rendimento(int i){
        this.setSaldo(this.getSaldo() * 1.5);
    }



}
