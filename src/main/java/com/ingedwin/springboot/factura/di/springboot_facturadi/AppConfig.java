package com.ingedwin.springboot.factura.di.springboot_facturadi;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ingedwin.springboot.factura.di.springboot_facturadi.models.Invoice;
import com.ingedwin.springboot.factura.di.springboot_facturadi.models.Item;
import com.ingedwin.springboot.factura.di.springboot_facturadi.models.Product;

@Configuration
@PropertySource("values.properties")
public class AppConfig {

    @Value("classpath:jsons/values.json")
    private Resource resource;

    
    /*
     * Cuando implementamos la notacion @Bean no es necesario ponerle PUBLIC a nuestra clase ya que
     * va implizita en la notacion Bean
     */

    @Bean
	List<Item> itemsInvoice(){

        /*
         * Para leer un JSON desde nuestro proyecto siempre vamos a tener que transformar el archivo a un objeto
         * mapper, el cual le daremos la ruta del recurso con getInputStream y despues el tipo de modelo o DAO
         * que encaje con las caracteristicas que todo el JSON contiene para mostrarlo
         * 
         *

        ObjectMapper objMapper = new ObjectMapper();
        try {
            invoice = objMapper.readValue(resource.getInputStream(), Invoice.class);

            /*
             * Una vez encontremos el modelo que encaja con el json, extraemos lo que queramos, ya sea la lista
             * de items, el cliente, los productos, etc...
             *

            list = invoice.getListaItems();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;*/

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
