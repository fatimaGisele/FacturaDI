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
        double total = this.Items.stream().map(item -> item.getMonto()).reduce(0.0,(sum, monto)->sum+monto);
        return total;
    }
 


    
}
