public class Guerrero extends Personaje {

    private int fuerza;
    private int defensa;
    private int nivel;

    private Mascota mascota;

    public Guerrero(String nombre,int salud,int fuerza,int defensa,int nivel) {

        super(nombre,salud);

        this.fuerza=fuerza;
        this.defensa=defensa;
        this.nivel=nivel;
    }

    public void setMascota(Mascota mascota){
        this.mascota=mascota;
    }

    public void usarEspada(){

        int daño= fuerza + nivel;

        System.out.println(getNombre()+" usa su espada.");

        System.out.println("Daño realizado: " + daño);

    }


    //aumenta en 5 la defensa
    public void GritarDesafio(){

        defensa+= 5;

        System.out.println(getNombre()+" grita un desafío.");

        System.out.println("Defensa aumentada a " +defensa);

    }

    public void GritarGuerra(){

        fuerza+=5;

        System.out.println(getNombre()+" grita GUERRA!");

        System.out.println("Fuerza aumentada a "+fuerza);

    }

    public void mostrarDatos(){

        System.out.println("Nombre: "+getNombre());
        System.out.println("Salud: "+getSalud());
        System.out.println("Fuerza: "+fuerza);
        System.out.println("Defensa: "+defensa);
        System.out.println("Nivel: "+nivel);

        if(mascota!=null){

            System.out.println("Mascota: SI");

        }else{

            System.out.println("Mascota: NO");

        }

    }

    public Mascota getMascota(){

        return mascota;

    }

}