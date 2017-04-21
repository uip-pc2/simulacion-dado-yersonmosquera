import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main( String [] args ){
        // Instaciamo la clase dado
        Dado dado = new Dado();

        //Teclado para solicitar datos al usuarios
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        //Manejo de la opcion seleccionada
        int opc = 0;

        //Menu de opciones
        do {
            System.out.println("JUEGO DE DADOS\n");
            System.out.println("\t1. Lanzar.");
            System.out.println("\t2. Ver Resultados.");
            System.out.println("\t3. Salir.\n");

            try {
                System.out.print("Opcion a Seleccionar----> ");
                opc = Integer.parseInt( teclado.readLine());
                
                switch (opc){
                    case 1:
                        System.out.println("--- Lanzando Dado --");
                        System.out.println( dado.lanzar() );
                        break;
                    case 2:
                        System.out.println("--- Resultado de lanzamientos --");
                        dado.resultados();
                        break;
                    case 3:
                        System.out.println("--- Saliendo --");
                        break;
                    default:
                        System.out.println("Opcion Incorrecta...");
                        break;
                }
                System.out.println();

            } catch (IOException e) {
                
                e.printStackTrace();
            }

          
        }while (opc != 3);
    }
}
