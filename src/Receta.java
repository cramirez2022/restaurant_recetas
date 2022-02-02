
public class Receta {
	
private int id_receta;
private String nombre_receta;
private String fecha_ingreso_restaurant;
private String tiporeceta;
private Ingrediente ingrediente;
private int precio;

public Receta(int id_receta, String nombre_receta,
		String fecha_ingreso_restaurant, String tiporeceta,
		Ingrediente ingrediente, int precio) {
	super();
	this.id_receta = id_receta;
	this.nombre_receta = nombre_receta;
	this.fecha_ingreso_restaurant = fecha_ingreso_restaurant;
	this.tiporeceta = tiporeceta;
	this.ingrediente = ingrediente;
	this.precio = precio;
}

public int getId_receta() {
	return id_receta;
}

public void setId_receta(int id_receta) {
	this.id_receta = id_receta;
}

public String getNombre_receta() {
	return nombre_receta;
}

public void setNombre_receta(String nombre_receta) {
	this.nombre_receta = nombre_receta;
}

public String getFecha_ingreso_restaurant() {
	return fecha_ingreso_restaurant;
}

public void setFecha_ingreso_restaurant(String fecha_ingreso_restaurant) {
	this.fecha_ingreso_restaurant = fecha_ingreso_restaurant;
}

public String getTiporeceta() {
	return tiporeceta;
}

public void setTiporeceta(String tiporeceta) {
	this.tiporeceta = tiporeceta;
}

public Ingrediente getIngrediente() {
	return ingrediente;
}

public void setIngrediente(Ingrediente ingrediente) {
	this.ingrediente = ingrediente;
}

public int getPrecio() {
	return precio;
}

public void setPrecio(int precio) {
	this.precio = precio;
}


}
