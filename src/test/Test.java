package test;

import model.Cliente;
import persistence.ClientesJPA;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Contenido de la tabla clientes \n =============");
		ClientesJPA.ListaClientes();
		Cliente cl=new Cliente(4502,"superman@tour.fr","Miguel");
		ClientesJPA.creaClientes(cl);
		System.out.println("Contenido de la tabla despues de crear un cliente \n =============");
		ClientesJPA.ListaClientes();
		ClientesJPA.actualizaClientes(4502, "Miguel Lopez", "miguel.lopez@tour.fr");
		System.out.println("Contenido de la tabla despues de actualizar un cliente \n =============");
		ClientesJPA.ListaClientes();
		ClientesJPA.eliminaClientes(900);
		System.out.println("Contenido de la tabla despues de eliminar un cliente \n =============");
		ClientesJPA.ListaClientes();
	}
		        

}
