package facturaexample.di.dipractica.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Factura {

    @Autowired
    private Cliente cliente;
    @Value("${Factura.numeroFactura}")
    private int numeroFactura;
    @Autowired
    private List<Item> Items;
    private double total;

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public int getNumeroFactura() {
        return numeroFactura;
    }
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    public List<Item> getItems() {
        return Items;
    }
    public void setItems(List<Item> items) {
        Items = items;
    }

    public double getTotal() {
    return total;
    }
    public void setTotal(double total) {
    this.total = total;
    }


    
}
