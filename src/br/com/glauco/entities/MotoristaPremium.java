package br.com.glauco.entities;

public class MotoristaPremium extends Motorista {
    private static final double PERCENTUAL_REPASSE = 0.85;
    private static final double BONUS_POR_CORRIDA = 2.0;

    public MotoristaPremium(String nome, String placa) {
        super(nome, placa);
    }

    @Override
    public void registrarCorrida(double valor) {
        super.registrarCorrida(valor + BONUS_POR_CORRIDA);
    }

    @Override
    public double calcularPagamentoLiquido() {
        return getValorBruto() * PERCENTUAL_REPASSE;
    }
}