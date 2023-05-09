package CarrinhoDeCompras;
public class Compra {
    private String objCompra;
    private double valor;

    public Compra(String objCompra, double valor) {
        this.objCompra = objCompra;
        this.valor = valor;
    }

    public String getObjCompra() {
        return objCompra;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: objCompra ='" + objCompra +
                ", valor =" + valor;
    }
}
