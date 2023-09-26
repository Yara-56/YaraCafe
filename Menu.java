public class Menu {
    public static void main(String[] args) {
        System.out.printf("Seja bem vindo ao Yara's Café! ");
        System.out.printf("Gostaria de olhar o nosso cardápio? ");
        String escolha = scanner.next();

        if (escolha.equals("Sim")) {
            do{
                String menoDoCafe = """
                                       Yara's Café
                                          MENU
                                          
                                      Tipos de café              Preço
                                      Caputino                  R$ 6
                                      Late                      R$ 6
                                      Espresso                  R$ 5
                                      Americano                 R$ 6
                                      Especial Da Casa          R$ 10
                                     
                        
                                    """;
                System.out.println("Qual seria o seu pedido? ");
                double primeiroPedido = scanner.nextDouble();

                switch (primeiroPedido){
                    case 1:
                        System.out.println("Seu pedido foi: caputino R$6");
                        break;
                    case 2:
                        System.out.println("Seu pedido foi: Latte R$ 6");
                        break;
                    case 3:
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println();
                        break;
                    case 5:
                        System.out.println();
                        break;
                    default:
                        System.out.println("Obrigada pela visita! ");
                }

                System.out.println();

            }while ();

        else {
                System.out.printf("Muito obrigada pela sua visita! ");
            }
        }
    }
}
