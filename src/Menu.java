import Utils.InputReader;

public class Menu {
  public static boolean selecionarOpcao() {
    descreverOpcoes();

    System.out.print("ESCOLHA UMA OPCAO: ");

    switch (InputReader.getInt()) {
      case 0:
        return true;
      case 1:
        Estoque.imprimirListaProdutos();
        break;
      case 2:
        // TODO: Lançamento de item
        break;
      case 3:
        // TODO: Imprimir pedido
        break;
      default:
        System.out.println("OPCAO INVALIDA!!!");
    }

    System.out.println();

    return false;
  }

  private static void descreverOpcoes() {
    System.out.println("----:::::::::::::::::----");
    System.out.println("----::: SUPER POS :::----");
    System.out.println("----:::::::::::::::::----");

    System.out.println("--- 1 MOSTRAR CATALOGO --");
    System.out.println("--- 2 LANCAR ITEM -------");
    System.out.println("--- 3 VER PEDIDO --------");
    System.out.println("--- 0 ENCERRAR ----------");

    System.out.println();
  }
}
