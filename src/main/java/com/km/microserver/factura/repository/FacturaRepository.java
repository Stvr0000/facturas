package com.km.microserver.factura.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.km.microserver.factura.entity.Factura;

public interface FacturaRepository extends MongoRepository<Factura, String> {

}
