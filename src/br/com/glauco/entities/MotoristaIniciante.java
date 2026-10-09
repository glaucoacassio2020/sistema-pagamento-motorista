package br.com.glauco.entities;

public class MotoristaIniciante extends Motorista {
    public MotoristaIniciante(String nome, String placa) {
        super(nome, placa);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamentoLiquido = getValorBruto() * 0.75;
        if (getQuantidadeCorridas() < 5) {
            pagamentoLiquido -= 50.0;
        }
        return pagamentoLiquido;
    }
}
