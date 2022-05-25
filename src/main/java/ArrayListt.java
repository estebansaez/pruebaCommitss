import java.util.ArrayList;

//  ArrayList<tipo> nombre = new ArrayList<>();


public class ArrayListt {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        //agregar elemento
        nombres.add("perro");
        nombres.add("gato");
        nombres.add("aguila");
        nombres.add("paloma");
        System.out.println("Nombres: "+nombres);

        //Get: obtener el valor de un elemento en un espacio
        System.out.println("Nombres get0: "+ nombres.get(0));

        //size: El largo del arreglo
        System.out.println("Nombres size(): "+ nombres.size());

        //Eliminar elemento
        nombres.remove(2);
        nombres.remove("Gato");
        System.out.println("nombres: "+nombres);

        //Reemplazar elemento
        nombres.set(1, "Loro");
        System.out.println("Nombres: "+nombres);

        //Ver si un elemento existe (retorna true or false)
        if(nombres.contains("perro")==true){
            System.out.println("Perro existe");
        }else {
            System.out.println("Perro no existe");
        }
    }
}
