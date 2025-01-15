import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {

    private double limite;
    private double saldo;
    private List<compra> listaDeCompras;

    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    public boolean lanzarCompra (compra compra){
        if (this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaDeCompras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<compra> getListaDeCompras() {
        return listaDeCompras;
    }

    public void setListaDeCompras(List<compra> listaDeCompras) {
        this.listaDeCompras = listaDeCompras;
    }
}
