import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Bienvenido a tu conversor de divisas");

        Map<String, Double> tasasDeCambio = null;
        int salirDeAplicacion = 2;
        while (salirDeAplicacion != 0) {
            if (salirDeAplicacion == 2){
                System.out.println("Escriba el tipo de moneda que desee convertir: ");
                String primeraMoneda = lectura.nextLine();
                tasasDeCambio = Divisas.MonedasDisponibles.disponibilidad(primeraMoneda);

            }
            if (tasasDeCambio != null){
                System.out.println("Ingrese la cantidad a convertir: ");
                double cantidad = lectura.nextDouble();
                lectura.nextLine();

                System.out.println("¿A que moneda desea convertir su cantidad?");
                String segundaMoneda = lectura.nextLine();

                System.out.println("Su cantidad equivale a: " + ConversionDeDivisa.Convertir(cantidad, segundaMoneda, tasasDeCambio) + " " + segundaMoneda);
                String siguienteAccion = """
                        Seleccione la siguiente accion a seguir:
                        0 si desea salir
                        1 si desea repetir con la misma moneda
                        2 si desea repetir con monedas diferentes
                        """;
                System.out.println(siguienteAccion);
                salirDeAplicacion = lectura.nextInt();
                lectura.nextLine();
            }
        }

    }
}