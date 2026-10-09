package br.com.glauco.entities;

public class MotoristaParceiroFrotista extends Motorista {
    public MotoristaParceiroFrotista(String nome, String placa) {
        super(nome, placa);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamentoLiquido = getValorBruto() * 0.80 - 800.0;
        if (pagamentoLiquido < 0.0) {
            return 0.0;
        }
        return pagamentoLiquido;
    }
}
