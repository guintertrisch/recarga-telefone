public class Cliente {
    private String nome_cliente;
    private Telefone telefone;
    private Conta conta;

    public Cliente(String nome_cliente, Telefone telefone, Conta conta) {
        this.nome_cliente = nome_cliente;
        this.telefone = telefone;
        this.conta = conta;
    }

    public String getNome() {
        return this.nome_cliente;
    }

    public void setNome(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public void setLinha(Telefone telefone) {
        this.telefone = telefone;
    }

    public Telefone getTelefone() {
        return this.telefone;
    }

    public Conta getConta() {
        return this.conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public boolean recarregarCelular(int valorRecarga) {
        if (validaSaldoConta(valorRecarga)) {
            this.conta.setSaldo(this.conta.getSaldo() - valorRecarga);
            this.telefone.setSaldo(this.telefone.getSaldo() + valorRecarga);
            return true;
        }
        return false;

    }

    private boolean validaSaldoConta(int valorRecarga) {
        if (valorRecarga <= this.conta.getSaldo() && valorRecarga > 0) {
            return true;
        }
        return false;
    }
}
