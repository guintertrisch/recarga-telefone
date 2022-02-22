import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DataProvider {
    static Stream<Arguments> dataProviderRecargaSucesso() {
        return Stream.of(
                arguments("Recarga com valor dentro do limite do saldo"
                        , new Cliente("Maria"
                                , new Telefone("5193784367", 200)
                                , new Conta(300))
                        , 100
                        , 200
                        , 300),
                arguments("Recarga com valor igual do limite do saldo"
                        , new Cliente("Maria"
                                , new Telefone("5193784367", 200)
                                , new Conta(300))
                        , 300
                        , 0
                        , 500)

        );
    }

    static Stream<Arguments> dataProviderRecargaFalha() {
        return Stream.of(
                arguments("Recarga com valor acima do limite do saldo"
                        , new Cliente("Maria"
                                , new Telefone("5193784367", 200)
                                , new Conta(300))
                        , 301
                        , 300
                        , 200),
                arguments("Recarga com valor zerado"
                        , new Cliente("Maria"
                                , new Telefone("5193784367", 200)
                                , new Conta(300))
                        , 0
                        , 300
                        , 200)
        );
    }
}
