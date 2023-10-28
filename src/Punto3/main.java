package Punto3;

public class main {
    public static <T> void imprimirArreglo(T[] array){
        for (T item:array) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // Se imprimer los dos arreglos;
        String[] strings = {"C","0","M","E","T","A"};
        Integer[] integers = {100,200,101,30,90,21,200};
        System.out.print("El array de Strings es \n");
        imprimirArreglo(strings);
        System.out.print("El array de integers es \n");
        imprimirArreglo(integers);
    }
}
