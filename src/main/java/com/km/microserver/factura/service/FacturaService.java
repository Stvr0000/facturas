package com.km.microserver.factura.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.km.microserver.factura.entity.Factura;
import com.km.microserver.factura.repository.FacturaRepository;


@Service
public class FacturaService {
    
    @Autowired
    private FacturaRepository facturaRepository;

    public Factura crearFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

    public List<Factura> obtenerTodosLasFacturas() {
        return facturaRepository.findAll();
    }

    public Optional<Factura> obtenerFacturaPorId(String id) {
        return facturaRepository.findById(id);
    }

    public Factura actualizarFactura(Factura factura) {
        if (facturaRepository.existsById(factura.getId())) {
            return facturaRepository.save(factura);
        }
        return null; // Considera lanzar una excepción o manejarlo de otra manera
    }

    public void eliminarFacturaPorId(String id) {
        facturaRepository.deleteById(id);
    }
}

