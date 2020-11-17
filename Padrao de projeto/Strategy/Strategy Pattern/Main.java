import java.util.Scanner;
import java.math.BigDecimal;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Compra cp = new Compra(new DescontoNatal());
    
    System.out.println("Valor da compra: ");
    BigDecimal valorCompra = sc.nextBigDecimal();
    cp.adicionarValor(valorCompra);
    
    System.out.println("Valor com desconto: " + cp.obterValorFinal());
  }
}