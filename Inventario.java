import java.util.ArrayList;

public class Inventario {

    private int capacidad;
    private ArrayList<String> items;

    public Inventario(int capacidad) {
        this.capacidad = capacidad;
        items = new ArrayList<>();
    }

    public void agregarItem(String item) {

        if(items.size() < capacidad){

            items.add(item);

            System.out.println(item + " agregado al inventario.");

        }else{

            System.out.println("Inventario lleno.");

        }

    }

    public String[] consultarInventario() {

        return items.toArray(new String[0]);// devuelve un arreglo

    }

    public void mostrarInventario(){

        if(items.isEmpty()){

            System.out.println("El inventario está vacío.");

            return;

        }

        System.out.println("===== INVENTARIO =====");

        for(String item : items){

            System.out.println("- " + item);

        }

    }

}