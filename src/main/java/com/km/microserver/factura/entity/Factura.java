package com.km.microserver.factura.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "facturas")


public class Factura {

    @Id
    private String id;
    private String clienteId;
    private double monto;
    private LocalDate fecha;
    
    
    
	public Factura(String id, String clienteId, double monto, LocalDate fecha) {
		this.id = id;
		this.clienteId = clienteId;
		this.monto = monto;
		this.fecha = fecha;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClienteId() {
		return clienteId;
	}
	public void setClienteId(String clienteId) {
		this.clienteId = clienteId;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
    
    

}
