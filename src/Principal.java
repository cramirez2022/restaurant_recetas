
public class Principal {

	public static void main(String[] args) {
		
		
		Ingrediente ingrediente1 = new Ingrediente(1,"Pan hamburgesa",100);
		Ingrediente ingrediente2 = new Ingrediente(2,"Hamburgesa Vacuno",100);
		Ingrediente ingrediente3 = new Ingrediente(3,"Queso Cheddar",100);
		Ingrediente ingrediente4 = new Ingrediente(4,"Cebolla Morada",100);
		Ingrediente ingrediente5 = new Ingrediente(5,"Pepinillo",100);
		Ingrediente ingrediente6 = new Ingrediente(6,"Aros Cebolla",100);
		Ingrediente ingrediente7 = new Ingrediente(7,"Tomate",100);
		Ingrediente ingrediente8 = new Ingrediente(2,"Hamburgesa Garbanzo",100);

		
		

		
		Receta receta1 = new Receta(1, "Hamburgesa Suprema", "2019-09-22", "No vegana", ingrediente1, 4500);
		Receta receta2 = new Receta(1, "Hamburgesa Suprema Vegana", "2021-03-22", "No vegana", ingrediente1, 4500);

		


		 Cliente cliente1 = new Cliente(558, "Juan Perez", 228789241, "Santiago-CL", "Local" );

		 Empleado empleado1 = new Empleado(248566361, "Juan Perez", 98797244, "Santiago-CL", "Chef");
		 Empleado empleado2 = new Empleado(106454736, "Marco Benavente", 987432444, "Santiago-CL", "Chef");
		 Empleado empleado3 = new Empleado(96211945, "Alexis Bravo", 787878786, "Santiago-CL", "Mesero");
		 Empleado empleado4 = new Empleado(137170655, "Hector Venegas", 434564356, "Santiago-CL", "Bodega");
		 Empleado empleado5 = new Empleado(185531627, "Carlos Romero", 34564357, "Santiago-CL", "Cajero");
		 Empleado empleado6 = new Empleado(187864712, "Andrea Lopez", 436456546, "Santiago-CL", "Cajero");



		 Pedido pedido1= new Pedido(1, "02-01-2022 15:45 hrs", "Si", "11", receta1, cliente1, empleado3);
		 Pedido pedido2= new Pedido(2, "02-01-2022 15:45 hrs", "Si", "11", receta2, cliente1, empleado3);

		 		 
		 
		 System.out.println("Comprobante de Venta");
		 System.out.println("Cliente " + pedido1.getCliente().getNombre() + "- Rut: " + pedido1.getCliente().getRut() + "- En Local: " + pedido1.getEnlocal()+ "- Fecha/hora: " + pedido1.getFecha_pedido());
		 System.out.println("Pedido: " + pedido1.getReceta().getNombre_receta() + "Valor: "+ pedido1.getReceta().getPrecio() + " -Mesa: "+ pedido1.getNumero_mesa() + " - Entrega Pedido Mesa: "+ pedido1.getEmpleado().getNombre());
		 System.out.println("Cajero: " + empleado5.getNombre());
		 System.out.println("---------------");
		 System.out.println("Ingredientes");
		 System.out.println("ID:"+ ingrediente1.getId_ingrediente() + " Ingrediente "+ ingrediente1.getNombre_ingrediente());
		 System.out.println("ID:"+ ingrediente2.getId_ingrediente() + " Ingrediente "+ ingrediente2.getNombre_ingrediente());
		 System.out.println("ID:"+ ingrediente3.getId_ingrediente() + " Ingrediente "+ ingrediente3.getNombre_ingrediente());
		 System.out.println("ID:"+ ingrediente4.getId_ingrediente() + " Ingrediente "+ ingrediente4.getNombre_ingrediente());
		 System.out.println("ID:"+ ingrediente5.getId_ingrediente() + " Ingrediente "+ ingrediente5.getNombre_ingrediente());
		 System.out.println("ID:"+ ingrediente6.getId_ingrediente() + " Ingrediente "+ ingrediente6.getNombre_ingrediente());
		 System.out.println("ID:"+ ingrediente7.getId_ingrediente() + " Ingrediente "+ ingrediente7.getNombre_ingrediente());
		 System.out.println("----------------");
		 System.out.println("Pedido: " + pedido2.getReceta().getNombre_receta() + "Valor: "+ pedido2.getReceta().getPrecio() + " -Mesa: "+ pedido2.getNumero_mesa() + " - Entrega Pedido Mesa: "+ pedido2.getEmpleado().getNombre());
		 System.out.println("---------------");
		 System.out.println("Ingredientes");
		 System.out.println("ID:"+ ingrediente1.getId_ingrediente() + " Ingrediente "+ ingrediente1.getNombre_ingrediente());
		 System.out.println("ID:"+ ingrediente8.getId_ingrediente() + " Ingrediente "+ ingrediente8.getNombre_ingrediente());
		 System.out.println("ID:"+ ingrediente3.getId_ingrediente() + " Ingrediente "+ ingrediente3.getNombre_ingrediente());
		 System.out.println("ID:"+ ingrediente4.getId_ingrediente() + " Ingrediente "+ ingrediente4.getNombre_ingrediente());
		 System.out.println("ID:"+ ingrediente5.getId_ingrediente() + " Ingrediente "+ ingrediente5.getNombre_ingrediente());
		 System.out.println("ID:"+ ingrediente6.getId_ingrediente() + " Ingrediente "+ ingrediente6.getNombre_ingrediente());
		 System.out.println("ID:"+ ingrediente7.getId_ingrediente() + " Ingrediente "+ ingrediente7.getNombre_ingrediente());
		 System.out.println("----------------");
	
		 

		 
		 

		 




			 
	}

}
