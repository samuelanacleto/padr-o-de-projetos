import java.math.BigDecimal;

public class DescontoPascoa implements AplicadorDesconto {
    @Override
    public BigDecimal aplicarDesconto(final BigDecimal valorCompra) {
        return valorCompra.multiply(BigDecimal.valueOf(0.5));
    }
}