package challenge.java.alura.menu;

import challenge.java.alura.ConversorAPI;
import challenge.java.alura.Moedas;
import java.util.Scanner;

public class Menu {

    private ConversorAPI conversorAPI = new ConversorAPI();
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        boolean continuar = true;

        while (continuar) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (opcao == 0) {
                continuar = false;
                System.out.println("Saindo...");
            } else {
                processarOpcao(opcao);
            }
        }
    }

    private void exibirMenu() {
        System.out.println("Escolha a conversão de moedas:");
        System.out.println("1. USD para BRL");
        System.out.println("2. BRL para USD");
        System.out.println("3. EUR para BRL");
        System.out.println("4. BRL para EUR");
        System.out.println("5. GBP para BRL");
        System.out.println("6. BRL para GBP");
        System.out.println("0. Sair");
    }

    private void processarOpcao(int opcao) {
        String moedaBase;
        String moedaDestino;

        switch (opcao) {
            case 1:
                moedaBase = "USD";
                moedaDestino = "BRL";
                break;
            case 2:
                moedaBase = "BRL";
                moedaDestino = "USD";
                break;
            case 3:
                moedaBase = "EUR";
                moedaDestino = "BRL";
                break;
            case 4:
                moedaBase = "BRL";
                moedaDestino = "EUR";
                break;
            case 5:
                moedaBase = "GBP";
                moedaDestino = "BRL";
                break;
            case 6:
                moedaBase = "BRL";
                moedaDestino = "GBP";
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                return;
        }

        realizarConversao(moedaBase, moedaDestino);
    }

    private void realizarConversao(String moedaBase, String moedaDestino) {
        System.out.println("Digite o valor que deseja converter:");
        double valor = scanner.nextDouble();

        try {
            Moedas newMoedas = conversorAPI.BuscaMoedas(moedaBase, moedaDestino, valor);
            System.out.println("Resultado: " + newMoedas);
        } catch (Exception e) {
            System.out.println("Erro ao converter moedas: " + e.getMessage());
        }
    }
}
