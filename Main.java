import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      JUEGO DE PERSONAJES");
        System.out.println("=================================");

        System.out.println("1 - Guerrero");
        System.out.println("2 - Mago");
        System.out.print("Seleccione un personaje: ");

        int opcion = teclado.nextInt();
        teclado.nextLine();

        if (opcion == 1) {

            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Salud: ");
            int salud = teclado.nextInt();

            System.out.print("Fuerza: ");
            int fuerza = teclado.nextInt();

            System.out.print("Defensa: ");
            int defensa = teclado.nextInt();

            System.out.print("Nivel: ");
            int nivel = teclado.nextInt();
            teclado.nextLine();

            Guerrero guerrero = new Guerrero(nombre, salud, fuerza, defensa, nivel);

            System.out.println();
            System.out.print("¿Desea crear una mascota? (s/n): ");

            String respuesta = teclado.nextLine();

            if(respuesta.equalsIgnoreCase("s")){

                System.out.print("Nombre de la mascota: ");
                String nomMascota = teclado.nextLine();

                System.out.print("Lealtad: ");
                int lealtad = teclado.nextInt();
                teclado.nextLine();

                Mascota mascota = new Mascota(nomMascota, lealtad);

                guerrero.setMascota(mascota);

            }

            int menu = 0;

            while(menu != 6){

                System.out.println();
                System.out.println("===== MENU GUERRERO =====");
                System.out.println("1. Mostrar datos");
                System.out.println("2. Atacar");
                System.out.println("3. Usar espada");
                System.out.println("4. Gritar Guerra");
                System.out.println("5. Gritar Desafío");
                System.out.println("6. Salir");

                if(guerrero.getMascota()!=null){

                    System.out.println("7. Mascota acompañar");

                }

                System.out.print("Opción: ");

                menu = teclado.nextInt();

                switch(menu){

                    case 1:
                        guerrero.mostrarDatos();
                        break;

                    case 2:
                        guerrero.atacar();
                        break;

                    case 3:
                        guerrero.usarEspada();
                        break;

                    case 4:
                        guerrero.GritarGuerra();
                        break;

                    case 5:
                        guerrero.GritarDesafio();
                        break;

                    case 7:

                        if(guerrero.getMascota()!=null){

                            guerrero.getMascota().acompañar();

                        }

                        break;

                    case 6:

                        System.out.println("Hasta luego.");

                        break;

                    default:

                        System.out.println("Opción incorrecta.");

                }

            }

        }

        else if(opcion==2){

            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Salud: ");
            int salud = teclado.nextInt();

            System.out.print("Mana: ");
            int mana = teclado.nextInt();

            System.out.print("Inteligencia: ");
            int inteligencia = teclado.nextInt();

            System.out.print("Nivel: ");
            int nivel = teclado.nextInt();
            teclado.nextLine();

            ArrayList<String> hechizos = new ArrayList<>();

            hechizos.add("Fuego");
            hechizos.add("Hielo");
            hechizos.add("Rayo");

            Mago mago = new Mago(nombre,
                    salud,
                    mana,
                    inteligencia,
                    hechizos,
                    nivel);

            ObjetoMagico objeto =
                    new ObjetoMagico(
                            "Bastón Ancestral",
                            "Bastón",
                            25,
                            5);

            int menu = 0;

            while(menu!=9){

                System.out.println();
                System.out.println("===== MENU MAGO =====");
                System.out.println("1. Mostrar datos");
                System.out.println("2. Atacar");
                System.out.println("3. Recuperar Mana");
                System.out.println("4. Lanzar Hechizo");
                System.out.println("5. Invocar Elemento");
                System.out.println("6. Usar Objeto Magico");
                System.out.println("7. Agregar Item");
                System.out.println("8. Ver Inventario");
                System.out.println("9. Salir");

                System.out.print("Opción: ");

                menu = teclado.nextInt();
                teclado.nextLine();

                switch(menu){

                    case 1:

                        mago.mostrarDatos();

                        break;

                    case 2:

                        mago.atacar();

                        break;

                    case 3:

                        mago.recuperarMana();

                        break;

                    case 4:

                        System.out.println("Hechizo:");

                        String hechizo = teclado.nextLine();

                        mago.lanzarHechizo(hechizo);

                        break;

                    case 5:

                        System.out.print("Elemento: ");

                        String elemento = teclado.nextLine();

                        mago.InvocarElemento(elemento);

                        break;

                    case 6:

                        mago.UsarObjetoMagico(objeto);

                        break;

                    case 7:

                        System.out.print("Nombre del item: ");

                        String item = teclado.nextLine();

                        mago.getInventario().agregarItem(item);

                        break;

                    case 8:

                        mago.getInventario().mostrarInventario();

                        break;

                    case 9:

                        System.out.println("Hasta luego.");

                        break;

                    default:

                        System.out.println("Opción inválida.");

                }

            }

        }

        else{

            System.out.println("Personaje inexistente.");

        }

        teclado.close();

    }

}