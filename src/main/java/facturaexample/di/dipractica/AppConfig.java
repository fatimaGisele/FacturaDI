package facturaexample.di.dipractica;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//import com.fasterxml.jackson.databind.ObjectMapper;

import facturaexample.di.dipractica.Model.Item;
import facturaexample.di.dipractica.Model.Producto;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {

    //private List<Producto> lista;

    @Bean
    List<Item> ItemsFacturaTecno(){
        Producto p1 = new Producto( "airpods",  60500);
        Producto p2 = new Producto("Kindle", 400000);
        return Arrays.asList(new Item(10,p1), new Item(10,p2));
        
    }

    @Bean
    @Primary
    List<Item> ItemsFacturaOfic(){
        Producto p1 = new Producto( "pisapapeles",  6500);
        Producto p2 = new Producto("Resma A4", 15000);
        return Arrays.asList(new Item(10,p1), new Item(10,p2));
        
    }
}
