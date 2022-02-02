
public class Ingrediente {
	private int id_ingrediente;
	private String nombre_ingrediente;
	private int stock_ingrediente;
	
	public Ingrediente(int id_ingrediente, String nombre_ingrediente,
			int stock_ingrediente) {
		super();
		this.id_ingrediente = id_ingrediente;
		this.nombre_ingrediente = nombre_ingrediente;
		this.stock_ingrediente = stock_ingrediente;
	}

	public int getId_ingrediente() {
		return id_ingrediente;
	}

	public void setId_ingrediente(int id_ingrediente) {
		this.id_ingrediente = id_ingrediente;
	}

	public String getNombre_ingrediente() {
		return nombre_ingrediente;
	}

	public void setNombre_ingrediente(String nombre_ingrediente) {
		this.nombre_ingrediente = nombre_ingrediente;
	}

	public int getStock_ingrediente() {
		return stock_ingrediente;
	}

	public void setStock_ingrediente(int stock_ingrediente) {
		this.stock_ingrediente = stock_ingrediente;
	}

	
}
