package com.uca.capas.domain;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Producto {
	@NotEmpty(message = "Codigo producto en necesario")
	@Size(max = 12, message = "Codigo producto no debe tener más de 12 caracteres.")
	private String codigo;
	
	@NotEmpty(message = "Nombre producto en necesario")
	@Size(max = 100, message = "Nombre producto no puede tener más de 100 caracteres.")
	private String nombre;
	
	@NotEmpty(message = "Marca producto en necesario")
	@Size(max = 100, message = "Marca producto no puede tener más de 100 caracteres.")
	private String marca;
	
	@NotEmpty(message = "Descripción producto en necesario.")
	@Size(max = 500, message = "Descripción producto no puede tener más de 500 caracteres.")
	private String descripcion;
	
	@NotNull(message = "Existencia es requerida.")
	@Pattern(regexp = "[0-9]+", message = "Existencia debe ser un valor entero.")
	private String existencia;
	
	@NotNull(message = "Fecha ingreso es requerida.")
	@Pattern(regexp = "^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$",message = "Formato de fecha ingreso es incorrecta.")
	private String fechaingreso;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getExistencia() {
		return this.existencia;
	}
	public void setExistencia(String existencia) {
		this.existencia = existencia;
	}
	public String getFechaingreso() {
		return this.fechaingreso;
	}
	public void setFechaingreso(String fechaingreso) {
		this.fechaingreso = fechaingreso;
	}
}
