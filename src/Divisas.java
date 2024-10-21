import java.util.Map;



public class Divisas {
    private String base_code;
    private Map<String, Double> conversion_rates;

    public Map<String, Double> getTasas(){
        return conversion_rates;
    }

    public String getBaseCode(){
        return base_code;
    }

    class MonedasDisponibles {
        public static Map<String, Double> disponibilidad (String moneda) {
            Busqueda busqueda = new Busqueda();
            Divisas divisas = busqueda.tasasDeCambio(moneda);

            if (divisas != null && divisas.getTasas() != null){
                opcionesDeMonedas( "destino", divisas.getTasas());
                return divisas.getTasas();
            } else {
                System.out.println("Divisa no disponible, por favor intente con otra");
                return null;
            }
        }

        public static void opcionesDeMonedas(String tipo, Map<String, Double> tasas) {

        }
    }

}

