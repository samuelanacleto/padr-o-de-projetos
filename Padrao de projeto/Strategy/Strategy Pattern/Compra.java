import java.math.BigDecimal;

public class Compra {
  private AplicadorDesconto aplicadorDesconto;
  private BigDecimal valor;

  public Compra(AplicadorDesconto aplicadorDesconto) {
    this.aplicadorDesconto = aplicadorDesconto;
    valor = new BigDecimal(0);
  }

  public void adicionarValor(BigDecimal valor) {
    this.valor = this.valor.add(valor);
  }

  public BigDecimal obterValorFinal() {
    return aplicadorDesconto.aplicarDesconto(this.valor);
  }
}