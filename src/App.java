import java.io.File;

import Utils.InputReader;

public class App {
  public static final String ResourcesPath = System.getProperty("user.dir") + File.separator + "resources";

  public static void main(String[] args) throws Exception {
    Estoque.inicializar();

    boolean exit = false;
    do {
      exit = Menu.selecionarOpcao();
    } while (!exit);

    InputReader.close();
  }
}
