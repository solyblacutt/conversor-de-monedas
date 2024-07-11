import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conversor {
    private DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public Valores obtenerValorConvertido(double valorApi, double valor, String codigoISO, String codigoISOApi) {
        LocalDateTime now = LocalDateTime.now();
        String fechaDeConversion = now.format(format);
        double resultado = Math.round(valorApi * valor);
        String conversion = "El valor $" + valor + " [" + codigoISO + "] corresponde a $" + resultado + " [" + codigoISOApi + "] \n";
        System.out.println(conversion);
        Valores valores = new Valores(conversion, fechaDeConversion);
        return valores;
    }
}
