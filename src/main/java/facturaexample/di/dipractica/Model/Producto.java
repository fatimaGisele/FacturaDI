package facturaexample.di.dipractica.Model;

public class Producto {

    private String pNombre;
    private double precio;

    

    public Producto() {}
    
    public Producto(String pNombre, double precio) {
        this.pNombre = pNombre;
        this.precio = precio;
    }
    public String getpNombre() {
        return pNombre;
    }
    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

}
