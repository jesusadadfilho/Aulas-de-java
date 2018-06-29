public class ContaCorrente extends Conta {

    public ContaCorrente(String nome) {
        super(nome);
    }

    @Override
    public boolean sacar(double valor) {
        if (this.getSaldo() < valor){
            return false;
        }
        this.setSaldo(this.getSaldo() - valor - (valor * 0.05));
        return true;
    }
}
