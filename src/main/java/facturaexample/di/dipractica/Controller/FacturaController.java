package facturaexample.di.dipractica.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import facturaexample.di.dipractica.Model.Factura;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    private Factura factura;

    @GetMapping("/ver")    
    public Factura Mostrar(){
        return factura;
    }
}
