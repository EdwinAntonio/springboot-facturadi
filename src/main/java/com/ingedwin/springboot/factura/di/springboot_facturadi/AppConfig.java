package com.ingedwin.springboot.factura.di.springboot_facturadi;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.ingedwin.springboot.factura.di.springboot_facturadi.models.Item;
import com.ingedwin.springboot.factura.di.springboot_facturadi.models.Product;

@Configuration
@PropertySource("values.properties")
public class AppConfig {

    /*
     * Cuando implementamos la notacion @Bean no es necesario ponerle PUBLIC a nuestra clase ya que
     * va implizita en la notacion Bean
     */

    @Bean
	List<Item> itemsInvoice(){
        
        Product p1 = new Product("Camara", 1000);
        Product p2 = new Product("Telefono", 2000);
        Product p3 = new Product("Pantalla", 3000);
        Product p4 = new Product("Aspiradora", 4000);

        return Arrays.asList(
            new Item(p1, 2),
            new Item(p2,1),
            new Item(p3, 4),
            new Item(p4, 5)
            );
	}
}
