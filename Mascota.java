public class Mascota {

    private String nombre;
    private int lealtad;

    public Mascota(String nombre, int lealtad) {
        this.nombre = nombre;
        this.lealtad = lealtad;
    }

    public void acompañar() {

        System.out.println(nombre + " acompaña al guerrero.");

        if (lealtad >= 80) {
            System.out.println("La mascota aumenta mucho la moral.");
        } else if (lealtad >= 50) {
            System.out.println("La mascota brinda ayuda.");
        } else {
            System.out.println("La mascota todavía no es muy leal.");
        }
    }

    public int getLealtad() {
        return lealtad;
    }

    public void setLealtad(int valor) {
        lealtad = valor;
    }
}