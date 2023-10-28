package Punto2;

public class main {
    public static <T extends Comparable<T>> T minumum(T a,T b,T c,T d ,T e){
        T min = a;

        if(b.compareTo(min)<0){
            min = b;
        }

        if(c.compareTo(min)<0){
            min = c;
        }

        if(d.compareTo(min)<0){
            min = d;
        }

        if (e.compareTo(min)<0){
            min = e;
        }

        return min;
    }

    public static void main(String[] args) {
        // Pasamos 5 numeros y se calcula el menor
        System.out.print("El minimo de los numeros es : "+minumum(8,3,1,10,45));
    }
}
