class Main {
  public static void main(String[] args) {
    MaquinaBebidas maquinaCafe = new MaquinaCafe();
    Bebida b1 = maquinaCafe.entregaBebiba();

    MaquinaBebidas maquinaRefrigerante = new MaquinaRefrigerante();
    Bebida b2 = maquinaRefrigerante.entregaBebiba();

    Bebida b3 = maquinaRefrigerante.entregaBebiba();
  }
}