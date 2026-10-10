package br.com.glauco.entities;

public class MotoristaParceiroFrotista extends Motorista {
    private static final double PERCENTUAL_REPASSE = 0.80;
    private static final double ALUGUEL_VEICULO = 800.0;

    public MotoristaParceiroFrotista(String nome, String placa) {
        super(nome, placa);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamentoLiquido =
                getValorBruto() * PERCENTUAL_REPASSE - ALUGUEL_VEICULO;

        if (pagamentoLiquido < 0.0) {
            return 0.0;
        }

        return pagamentoLiquido;
    }
}