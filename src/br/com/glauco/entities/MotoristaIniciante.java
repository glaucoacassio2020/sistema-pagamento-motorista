package br.com.glauco.entities;

public class MotoristaIniciante extends Motorista {
    private static final double PERCENTUAL_REPASSE = 0.75;
    private static final double TAXA_INATIVIDADE = 50.0;
    private static final int MINIMO_CORRIDAS = 5;

    public MotoristaIniciante(String nome, String placa) {
        super(nome, placa);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamentoLiquido = getValorBruto() * PERCENTUAL_REPASSE;

        if (getQuantidadeCorridas() < MINIMO_CORRIDAS) {
            pagamentoLiquido -= TAXA_INATIVIDADE;
        }

        return pagamentoLiquido;
    }
}