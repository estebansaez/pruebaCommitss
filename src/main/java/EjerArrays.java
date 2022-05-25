import java.util.ArrayList;
import java.util.Collections;

public class EjerArrays {
    public static void main(String[] args) {
        //Arreglo de largo 20 (con N°s aleatorios), rango 0 - 25, que no se repitan
        ArrayList<Integer> numeros = new ArrayList<>();
        llenar (numeros, 100, 100);

        //ordenar el arreglo (numeros de menor a mayor y strings alfabeticamente)
        Collections.sort(numeros);
        System.out.println("Numeros: "+numeros);

        System.out.println("Hola prueba giit");

    }
    private static void llenar(ArrayList<Integer>arr, int cantidad, int rango){
        while (arr.size() < cantidad) {
            int n = (int)(Math.random()*rango);
            if(!arr.contains(n)){
                arr.add(n);
            }
        }
    }
}
