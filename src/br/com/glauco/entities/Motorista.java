package br.com.glauco.entities;

public abstract class Motorista {
    private String nome;
    private String placa;
    private int quantidadeCorridas;
    private double valorBruto;

    public Motorista(String nome, String placa) {
        this.nome = nome;
        this.placa = placa;
        this.quantidadeCorridas = 0;
        this.valorBruto = 0.0;
    }

    public void registrarCorrida(double valor) {
        quantidadeCorridas++;
        valorBruto += valor;
    }

    public abstract double calcularPagamentoLiquido();

    public String getNome() {
        return nome;
    }

    public String getPlaca() {
        return placa;
    }

    public int getQuantidadeCorridas() {
        return quantidadeCorridas;
    }

    public double getValorBruto() {
        return valorBruto;
    }
}
