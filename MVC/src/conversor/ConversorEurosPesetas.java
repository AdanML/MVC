package conversor;
public class ConversorEurosPesetas extends ConversorEuros {
// Adaptador de clase
  public ConversorEurosPesetas () {
        super(166.386D);
  }
  public double eurosApesetas(double cantidad) { // Invocado por el Controlador
        return eurosAmoneda(cantidad);
  }
  public double pesetasAeuros(double cantidad) { // Invocado por el Controlador
        return monedaAeuros(cantidad);
  }
}
/*
public class ConversorEurosPesetas { // Adaptador de objetos
  private ConversorEuros conversor;
  public ConversorEurosPesetas () {
        Conversor = new ConversorEuros(166.386D);
  }
  public double eurosApesetas(double cantidad) {
        return conversor.eurosAmoneda(cantidad);
  }
  public double pesetasAeuros(double cantidad) {
        return conversor.monedaAeuros(cantidad);
  }
}

*/

