public class MaquinaRefrigerante extends MaquinaBebidas {
  public Bebida entregaBebiba() {
    return new Refrigerante();
  }
}