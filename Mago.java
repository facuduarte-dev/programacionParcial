import java.util.ArrayList;
import java.util.List;

public class Mago extends Personaje {

    private int mana;
    private int inteligencia;
    private List<String> hechizosConocidos; 
    private int nivel;

    private Inventario inventario;

    public Mago(String nombre,
                int salud,
                int mana,
                int inteligencia,
                List<String> hechizosConocidos,
                int nivel) {

        super(nombre, salud);

        this.mana = mana;
        this.inteligencia = inteligencia;
        this.hechizosConocidos = hechizosConocidos;
        this.nivel = nivel;

        inventario = new Inventario(10); //defino la capacidad del inventario en 10

    }

    public void recuperarMana(){

        mana += 20;

        System.out.println("Mana recuperado.");

        System.out.println("Mana actual: " + mana);

    }

    public void lanzarHechizo(String hechizo){

        if(!hechizosConocidos.contains(hechizo)){

            System.out.println("No conoces ese hechizo.");

            return;

        }

        if(mana < 20){

            System.out.println("No tienes suficiente mana.");

            return;

        }

        mana -= 20;

        int daño = inteligencia + nivel;

        System.out.println(getNombre() + " lanzó " + hechizo);

        System.out.println("Daño mágico: " + daño);

        System.out.println("Mana restante: " + mana);

    }

    public void InvocarElemento(String elemento){

        if(mana < 30){

            System.out.println("No tienes suficiente mana.");

            return;

        }

        mana -= 30;

        System.out.println(getNombre() + " invocó el elemento " + elemento);

        System.out.println("Mana restante: " + mana);

    }

    public void UsarObjetoMagico(ObjetoMagico objeto){

        objeto.usar();

        System.out.println("La potencia obtenida es: " + objeto.getPotencia());

    }

    public void aprenderHechizo(String hechizo){

        hechizosConocidos.add(hechizo);

    }

    public Inventario getInventario(){

        return inventario;

    }

    public void mostrarDatos(){

        System.out.println("Nombre: " + getNombre());
        System.out.println("Salud: " + getSalud());
        System.out.println("Mana: " + mana);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Nivel: " + nivel);

        System.out.println();

        System.out.println("Hechizos conocidos:");

        for(String h : hechizosConocidos){

            System.out.println("- " + h);

        }

    }

}