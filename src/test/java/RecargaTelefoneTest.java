import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecargaTelefoneTest {
    @ParameterizedTest(name = "{index} - > Cenário: {0}")
    @MethodSource("DataProvider#dataProviderRecargaSucesso")
    public void deveRealizarRecargaComSucesso(String cenario, Cliente cliente, int valorRecarga, int saldoEsperadoConta, int saldoEsperadoTelefone) {

        assertAll("Recarga",
                () -> assertTrue(cliente.recarregarCelular(valorRecarga)
                        , "Valor Recarga: " + valorRecarga + ", Saldo da conta: " + cliente.getConta().getSaldo()),
                () -> assertEquals(saldoEsperadoConta, cliente.getConta().getSaldo()
                        , "Saldo esperado da conta: " + saldoEsperadoConta + ", Saldo atual da conta: " + cliente.getConta().getSaldo()),
                () -> assertEquals(saldoEsperadoTelefone, cliente.getTelefone().getSaldo()
                        , "Saldo esperado do telefone: " + saldoEsperadoTelefone + ", Saldo atual do telefone: " + cliente.getTelefone().getSaldo())
        );
    }

    @ParameterizedTest(name = "{index} - > Cenário: {0}")
    @MethodSource("DataProvider#dataProviderRecargaFalha")
    public void naoDeveRealizarRecarga(String cenario, Cliente cliente, int valorRecarga, int saldoEsperadoConta, int saldoEsperadoTelefone) {

        assertAll("Recarga",
                () -> assertFalse(cliente.recarregarCelular(valorRecarga)
                        , "Valor Recarga: " + valorRecarga + ", Saldo da conta: " + cliente.getConta().getSaldo()),
                () -> assertEquals(saldoEsperadoConta, cliente.getConta().getSaldo()
                        , "Saldo esperado da conta: " + saldoEsperadoConta + ", Saldo atual da conta: " + cliente.getConta().getSaldo()),
                () -> assertEquals(saldoEsperadoTelefone, cliente.getTelefone().getSaldo()
                        , "Saldo esperado do telefone: " + saldoEsperadoTelefone + ", Saldo atual do telefone: " + cliente.getTelefone().getSaldo())
        );

    }
}
