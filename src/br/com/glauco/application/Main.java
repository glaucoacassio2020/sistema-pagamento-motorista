package br.com.glauco.application;

import br.com.glauco.entities.*;

public class Main {
    public static void main(String[] args) {
        Motorista iniciante = new MotoristaIniciante("Ana", "ABC1D23");
        Motorista premium = new MotoristaPremium("Bruno", "DEF4G56");
        Motorista frotista = new MotoristaParceiroFrotista("Carlos", "GHI7J89");

        iniciante.registrarCorrida(50.0);
        iniciante.registrarCorrida(70.0);
        iniciante.registrarCorrida(80.0);

        premium.registrarCorrida(100.0);
        premium.registrarCorrida(150.0);
        premium.registrarCorrida(200.0);

        frotista.registrarCorrida(300.0);
        frotista.registrarCorrida(400.0);
        frotista.registrarCorrida(500.0);

        Motorista[] motoristas = {iniciante, premium, frotista};

        for (Motorista motorista : motoristas) {
            System.out.println("===== HOLERITE / EXTRATO =====");
            System.out.println("Nome: " + motorista.getNome());
            System.out.println("Placa: " + motorista.getPlaca());
            System.out.println("Quantidade de corridas: " + motorista.getQuantidadeCorridas());
            System.out.println("Valor bruto: R$ " + String.format("%.2f", motorista.getValorBruto()));
            System.out.println("Valor líquido a receber: R$ "
                    + String.format("%.2f", motorista.calcularPagamentoLiquido()));
            System.out.println();
        }
    }
}