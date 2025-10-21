package com.ingedwin.springboot.factura.di.springboot_facturadi.models;

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
public class Client {

    @Value("${client.name}")
    private String name;
    @Value("${client.lastName}")
    private String lastName;

}
