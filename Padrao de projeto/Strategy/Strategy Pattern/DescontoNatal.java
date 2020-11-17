import java.math.BigDecimal;

public class DescontoNatal implements AplicadorDesconto {
    @Override
    public BigDecimal aplicarDesconto(final BigDecimal valorCompra) {
        return valorCompra.multiply(BigDecimal.valueOf(0.9));
    }
}