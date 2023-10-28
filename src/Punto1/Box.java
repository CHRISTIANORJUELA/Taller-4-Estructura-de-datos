package Punto1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Box<T> {
    private T t;
    public Box(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public static void main(String[] args) {
      Box<Integer> integerBox = new Box<>(9);
      Box<Long> longBox = new Box<>(3L);
      Box<Float> floatBox = new Box<>(90.1f);
      Box<Double> doubleBox = new Box<>(45.2);
      // Obtenemos los valores de cada Instancia de la clase Box
      System.out.printf("El valor de integer box es : "+integerBox.getT());
      System.out.printf("El valor de longbox es : "+longBox.getT());
      System.out.println("El valor de floatbox es : "+floatBox.getT());
      System.out.printf("El valor de doublebox es "+doubleBox.getT());

    }
}