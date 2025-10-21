package com.ingedwin.springboot.factura.di.springboot_facturadi.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Invoice {

    @Autowired
    private Client client;

    @Value("${invoice.description.property}")
    private String description;

    @Autowired
    private List<Item> listaItems;
}
