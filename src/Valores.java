public class Valores {
    public String conversion;
    public String fechaDeConversion;

    public Valores(String conversion, String fechaDeConversion) {
        this.conversion = conversion;
        this.fechaDeConversion = fechaDeConversion;
    }

    @java.lang.Override
    public String toString() {
        return "{" +
                "Conversion realializada = '" + conversion + '\'' +
                ", Fecha de conversion = '" + fechaDeConversion + '\'' +
                '}';
    }
}
