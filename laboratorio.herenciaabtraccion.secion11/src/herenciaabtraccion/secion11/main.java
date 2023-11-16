package herenciaabtraccion.secion11;
import java.io.PrintStream;
import java.util.Scanner;

public class main {

        public static Scanner keyboard = new Scanner(System.in);
        public static PrintStream screen = System.out;

        public static void main(String[] args) {

            carro mazda = new carro("renault", "2001", 100);
            bicicleta gw = new bicicleta("chevrolet", "2018", 30);

            System.out.println("1. montar bicicleta");
            System.out.println("2. caballito bicicleta");
            System.out.println("3. manejar el carro");
            System.out.println("4. gastar llantas");
            System.out.println("5. ver velocidad bicicleta");
            System.out.println("6. ver velocidad carro");
            System.out.println("7. ver velocidad total");
            System.out.println("8. salir");

            double result = 0;
            int opcion = 8;

            while (opcion !=0){
                screen.println(" elija un numero del 1 al 7.Numero 8 para salir ");

                opcion = Integer.parseInt(keyboard.next());

                switch (opcion) {
                    case 1:
                        gw.andarBicicleta();
                        System.out.println("la bicicleta  kilometros andando");

                        break;
                    case 2:
                        gw.picarBicicleta();
                        System.out.println("la bicicleta  kilometros picando");
                        break;
                    case 3:
                        mazda.andarCarro();
                        System.out.println("el carro kilometros andando");
                        break;
                    case 4:
                        mazda.quemarLlantaCarro();
                        System.out.println("el carro kilometros quemando llanta");
                        break;
                    case 5:
                        screen.println(" el kilometraje de la bicicleta es:" );
                        break;
                    case 6:
                        mazda.getKilometrosRecorridos();
                        screen.println(" el kilometraje del carro es: ");
                        break;
                    case 7:
                        result = gw.kilometrosRecorridos + mazda.kilometrosRecorridos;
                        screen.println(" el kilometraje total de ambos vehiculos es de: " + result + " kilometros");
                        break;
                    case 8:
                        vehiculo.salir();
                        return;
                }

                screen.println(" el usuario escogio el numero " + opcion);
            }
        }
    }

