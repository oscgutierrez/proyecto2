package Producto;

    public class Producto {
    private String codigo;
    private String descripcion;
    private int stockMinimo;
    private int stockActual;
    private int precio;

    public Producto(String codigo, String descripcion, int stockMinimo, int stockActual, int precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stockMinimo = stockMinimo;
        this.stockActual = stockActual;
        this.precio = precio;
    }

    Producto() {
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
 
    
}
