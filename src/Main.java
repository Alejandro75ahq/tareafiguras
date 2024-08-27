//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        Rectangulo rectangulo = new Rectangulo();
        Circulo circulo = new Circulo();

        triangulo.calcularArea();
        rectangulo.calcularArea();
        circulo.calcularArea();
    }
}