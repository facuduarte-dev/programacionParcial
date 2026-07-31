public class ObjetoMagico {

    private String nombre;
    private String tipo;
    private int potencia;
    private int durabilidad;

    private int durabilidadMaxima;

    public ObjetoMagico(String nombre, String tipo, int potencia, int durabilidad) {

        this.nombre = nombre;
        this.tipo = tipo;
        this.potencia = potencia;
        this.durabilidad = durabilidad;
        this.durabilidadMaxima = durabilidad;

    }

    public void usar(){

        if(durabilidad > 0){

            durabilidad--;

            System.out.println(nombre + " fue utilizado.");

            System.out.println("Durabilidad restante: " + durabilidad);

            if(durabilidad==0){

                System.out.println("El objeto quedó inutilizable.");

            }

        }else{

            System.out.println("Este objeto está roto.");

        }

    }

    public void reparar(){

        durabilidad = durabilidadMaxima;

        System.out.println(nombre + " fue reparado.");

    }

    public int getPotencia(){

        return potencia;

    }

    public String getNombre(){

        return nombre;

    }

}