import java.util.Scanner;

public class Program {
    final static int OPCION_ENCENDER = 2, OPCION_APAGAR = 1, OPCION_SALIR = 3;

    public static void main(String[] args) {
        Car carSaab = new Car("Saab ", "Diesel 99", 1999);
        //Car carSeat = new Car("Seat", "Ibiza Mk2", 2000);
        //Car carPeugeot = new Car("Peugeot", "508SW", 2017);

        int op = -1;

        while (op != 3) {
            op = getUserInput();
            if (op == OPCION_APAGAR) {
                carSaab.stopEngine();
            }
            if (op == OPCION_ENCENDER) {
                carSaab.startEngine();
            }
            if (op == OPCION_SALIR) {
                System.out.println("Saliendo del programa...");
            }
        }

        //carSaab.startEngine();
        //carSeat.startEngine();
        //carSeat.stopEngine();
        //carSeat.stopEngine();

        //Ejercicio Posterior: Hacer bucle para que pregunte que coche quieres
        //encender y/o apagar
    }

    public static int getUserInput() {
        System.out.println("1. Apagar motor.");
        System.out.println("2. Encender motor.");
        System.out.println("3. Salir del programa");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        return op;
    }
}