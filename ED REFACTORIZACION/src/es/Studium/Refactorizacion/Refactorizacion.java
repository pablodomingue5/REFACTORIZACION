package es.Studium.Refactorizacion;

public class Refactorizacion {
	public double calcularPrecio(int unidades,double preciounitario) {
		double precio = unidades*preciounitario;
		double precioiva = precio*1.21;
		return(precioiva);
	}
}
