import java.io.File;
import java.util.ArrayList;

import Utils.CsvReader;

public class Estoque {
  private static final String ProductLoadPath = App.ResourcesPath + File.separator + "Produtos.csv";
  private static final String DefaultColumnSeparator = ",";

  private static final ArrayList<Produto> products = new ArrayList<Produto>();

  public static void inicializar() {
    ArrayList<String[]> tempList = CsvReader.toArrayList(ProductLoadPath, DefaultColumnSeparator);

    for (String[] item : tempList.subList(1, tempList.size())) {
      cadastrarProduto(
          Integer.parseInt(item[0]),
          item[1],
          Double.parseDouble(item[2]),
          Integer.parseInt(item[3]));
    }
  }

  public static ArrayList<Produto> getListaProdutos() {
    return products;
  }

  public static boolean cadastrarProduto(int id, String nome, double preco, int quantidadeEstoque) {
    return cadastrarProduto(new Produto(id, nome, preco, quantidadeEstoque));
  }

  public static boolean cadastrarProduto(Produto produto) {
    if (encontrarProduto(produto.getNome()) != null) {
      return false;
    }

    products.add(produto);

    return true;
  }

  public static Produto encontrarProduto(int id) {
    for (Produto produto : getListaProdutos()) {
      if (produto.getId() == id) {
        return produto;
      }
    }

    return null;
  }

  public static Produto encontrarProduto(String nome) {
    for (Produto produto : getListaProdutos()) {
      if (produto.getNome().equalsIgnoreCase(nome)) {
        return produto;
      }
    }

    return null;
  }

  public static void imprimirListaProdutos() {
    System.out.println("CATALOGO");
    System.out.println(" ---------------------------------------------------");

    System.out.printf("| ID   | NOME             | PRECO      | QUANTIDADE |\n");
    System.out.println("|---------------------------------------------------|");

    for (Produto produto : getListaProdutos()) {
      System.out.printf(
          "| %-4d | %-16s | R$%-8.2f | %-11d| \n",
          produto.getId(),
          produto.getNome(),
          produto.getPreco(),
          produto.getQuantidadeEstoque());
    }

    System.out.println(" ---------------------------------------------------");
  }
}
