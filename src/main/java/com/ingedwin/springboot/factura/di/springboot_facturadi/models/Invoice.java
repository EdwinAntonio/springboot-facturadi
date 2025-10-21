package com.ingedwin.springboot.factura.di.springboot_facturadi.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    private Client client;
    private String description;
    private List<Item> listaItems;
}
