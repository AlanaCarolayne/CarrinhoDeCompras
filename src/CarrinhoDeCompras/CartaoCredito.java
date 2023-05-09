package CarrinhoDeCompras;
import java.util.List;
import java.util.ArrayList;
public class CartaoCredito {
    private double limite;
    private double saldo;
    private List<Compra> compra;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compra = new ArrayList<>();
    }

    public boolean continuaCompra (Compra compra) {
    if (this.saldo>  compra.getValor()){
        this.saldo -= compra.getValor();
        this.compra.add(compra);
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

    public List<Compra> getCompras() {
        return compra;
    }

    public void setCompras(List<Compra> compras) {
        this.compra = compras;
    }
}
