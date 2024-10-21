import java.util.Map;

public class ConversionDeDivisa {
    public static double Convertir(double cantidad, String base_code, Map<String, Double> conversion_rates){
        Double tasaCambio = conversion_rates.get(base_code);

        if (tasaCambio != null){
            double nuevaCantidad = cantidad * tasaCambio;
            return nuevaCantidad;
        } else {
            throw new IllegalArgumentException("La tasa de cambio solicitada no se encuentra disponible");
        }
    }
}
