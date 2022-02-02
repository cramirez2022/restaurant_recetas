
public class Pedido {
	
	private int id_pedido;
	private String fecha_pedido;
	private String enlocal;
	private String numero_mesa;
	private Receta receta;
	private Cliente cliente;
	private Empleado empleado;
	
	public Pedido(int id_pedido, String fecha_pedido, String enlocal,
			String numero_mesa, Receta receta, Cliente cliente,
			Empleado empleado) {
		super();
		this.id_pedido = id_pedido;
		this.fecha_pedido = fecha_pedido;
		this.enlocal = enlocal;
		this.numero_mesa = numero_mesa;
		this.receta = receta;
		this.cliente = cliente;
		this.empleado = empleado;
	}

	public int getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}

	public String getFecha_pedido() {
		return fecha_pedido;
	}

	public void setFecha_pedido(String fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}

	public String getEnlocal() {
		return enlocal;
	}

	public void setEnlocal(String enlocal) {
		this.enlocal = enlocal;
	}

	public String getNumero_mesa() {
		return numero_mesa;
	}

	public void setNumero_mesa(String numero_mesa) {
		this.numero_mesa = numero_mesa;
	}

	public Receta getReceta() {
		return receta;
	}

	public void setReceta(Receta receta) {
		this.receta = receta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
	
}
