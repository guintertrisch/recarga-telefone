public class Telefone {
    private String numero_linha;
    private int saldo;

    public Telefone(String numero_linha, int saldo) {
        this.numero_linha = numero_linha;
        this.saldo = saldo;
    }

    public String getNumeroLinha() {
        return this.numero_linha;
    }

    public void setNumeroLinha(String numero_linha) {
        this.numero_linha = numero_linha;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
