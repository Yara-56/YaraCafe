package br.com.sistema.cafe.estrutura;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.printf("Seja bem vindo ao Yara's Café! ");
        System.out.printf("Gostaria de olhar o nosso cardápio? ");
        Scanner scanner = new Scanner(System.in);
        String escolha = scanner.next();

        if (escolha.equals("Sim")) {
            do{
                String menuDoCafe = """
                                       Yara's Café
                                          MENU
                                          
                                      Tipos de café              Preço
                                      Caputino                  R$ 6
                                      Late                      R$ 6
                                      Espresso                  R$ 5
                                      Americano                 R$ 6
                                      Especial Da Casa          R$ 10
                                      """;
                System.out.println(menuDoCafe);
                System.out.println("Qual seria o seu pedido? ");
                double primeiroPedido = scanner.nextDouble();

                if (primeiroPedido == 1) {
                    System.out.println("Seu pedido foi: caputino R$6");
                } else if (primeiroPedido == 2) {
                    System.out.println("Seu pedido foi: Latte R$ 6");
                } else if (primeiroPedido == 3) {
                    System.out.println("Seu pedido foi:");
                } else if (primeiroPedido == 4) {
                    System.out.println("Seu pedido foi:");
                } else if (primeiroPedido == 5) {
                    System.out.println("Seu pedido foi:");
                } else {
                    System.out.println("Obrigada pela visita! ");
                }

                System.out.println();

            }while (escolha.equals("Não"));
            System.out.printf("Muito obrigada pela sua visita! ");

        }
    }
}
