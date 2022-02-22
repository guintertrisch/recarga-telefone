public class Conta {
    private int saldo;
    private int vl_recarga;

    public Conta(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}