package gestorAplicación.sujetos;

import java.util.ArrayList;

import gestorAplicación.servicios.Carrito;
import gestorAplicación.servicios.Enums.Genero;
import gestorAplicación.servicios.Tienda;

import java.io.Serializable;

public class Administrador extends Persona implements Serializable {
	private static final long serialVersionUID = -9139003303968753008L;
	
	private ArrayList<Tienda> tiendas=new ArrayList<Tienda>();
	
	public Administrador(String nombre, int id, int edad, Genero genero) {
		super(nombre,id,edad,genero);
	}
	
	

	public ArrayList<Tienda> getTiendas() {
		return tiendas;
	}

	public ArrayList<Carrito> getFacturas(Tienda tiendaSeleccionada){
		ArrayList<Carrito> misFacturas = new ArrayList<Carrito>();
    	for(Carrito c:tiendaSeleccionada.getFacturas()) {
    		misFacturas.add(c);
    	}
    	return misFacturas;
	}

	public ArrayList<Tienda> getTiendasConFacturas() {
	    ArrayList<Tienda> tiendas = new ArrayList<>();
	    for (Tienda t : this.tiendas) {
	        if (t != null) {
	            for (Carrito c : t.getFacturas()) {
	                if (c != null && c.getTienda() != null) {
	                    tiendas.add(c.getTienda());
	                }
	            }
	        }
	    }
	    return tiendas;
	}


	public void setTiendas(ArrayList<Tienda> tiendas) {
		this.tiendas = tiendas;
	}
	
}
