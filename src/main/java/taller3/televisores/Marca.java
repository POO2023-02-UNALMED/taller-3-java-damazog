package taller3.televisores;

public class Marca {
	private String nombre;
	
	public Marca (String nombre) {
		this.nombre=nombre;
	}
	
	public String getMarca() {
		return this.nombre;
	}
	
	public void setMarca(String nombre) {
		this.nombre=nombre;
	}
}