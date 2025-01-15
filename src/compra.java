public class compra {
    private double valor;
    private String descripcion;

    public compra(double valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "compra: " +
                "valor=" + valor +
                ", descripcion= '" + descripcion;
    }
}
