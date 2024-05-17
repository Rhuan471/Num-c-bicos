public class FibonacciGenerator {
  private int a;
  private int b;

  public FibonacciGenerator() {
      this.a = 0;
      this.b = 1;
  }

  public int next() {
      int nextFib = a;
      int newB = a + b;
      a = b;
      b = newB;
      return nextFib;
  }

  public void reset() {
      this.a = 0;
      this.b = 1;
  }

  public static void main(String[] args) {
      FibonacciGenerator generator = new FibonacciGenerator();

      // Exibindo os primeiros 10 números de Fibonacci
      for (int i = 0; i < 10; i++) {
          System.out.println(generator.next());
      }

      // Reiniciando a progressão
      generator.reset();
      System.out.println("Progressão reiniciada");

      // Exibindo os primeiros 5 números de Fibonacci novamente após reiniciar
      for (int i = 0; i < 5; i++) {
          System.out.println(generator.next());
      }
  }
}
// Interface para desenhar retângulos
interface RectangleDrawer {
    void drawRectangle(String text);
}

// Classe para desenhar retângulo com bordas arredondadas
class RoundedRectangleDrawer implements RectangleDrawer {
    public void drawRectangle(String text) {
        System.out.println("╭────────────────────╮");
        System.out.println("│ " + text + " │");
        System.out.println("╰────────────────────╯");
    }
}

// Classe para desenhar retângulo com linhas duplas
class DoubleLineRectangleDrawer implements RectangleDrawer {
    public void drawRectangle(String text) {
        System.out.println("╔════════════════════╗");
        System.out.println("║ " + text + " ║");
        System.out.println("╚════════════════════╝");
    }
}

// Classe para desenhar retângulo com ASCII art
class AsciiArtRectangleDrawer implements RectangleDrawer {
  public void drawRectangle(String text) {
      System.out.println("+--------------------+");
      System.out.println("| " + text + " |");
      System.out.println("+--------------------+");
  }
}

// Classe para desenhar retângulo colorido (utilizando ANSI escape codes para simplicidade)
class ColoredRectangleDrawer implements RectangleDrawer {
  public void drawRectangle(String text) {
      String ANSI_RED = "\u001B[31m";
      String ANSI_RESET = "\u001B[0m";
      System.out.println(ANSI_RED + "+--------------------+" + ANSI_RESET);
      System.out.println(ANSI_RED + "| " + text + " |" + ANSI_RESET);
      System.out.println(ANSI_RED + "+--------------------+" + ANSI_RESET);
  }
}

public class Main {
  public static void main(String[] args) {
      RectangleDrawer roundedDrawer = new RoundedRectangleDrawer();
      RectangleDrawer doubleLineDrawer = new DoubleLineRectangleDrawer();
      RectangleDrawer asciiArtDrawer = new AsciiArtRectangleDrawer();
      RectangleDrawer coloredDrawer = new ColoredRectangleDrawer();

      String text = "Hello, World!";

      roundedDrawer.drawRectangle(text);
      doubleLineDrawer.drawRectangle(text);
      asciiArtDrawer.drawRectangle(text);
      coloredDrawer.drawRectangle(text);
  }
}
