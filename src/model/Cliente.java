package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clientes database table.
 * 
 */
@Entity
@Table(name="clientes")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private int idclientes;

	private String emailclientes;

	private String nomclientes;

	public Cliente() {
	}

	public Cliente(int idclientes, String emailclientes, String nomclientes) {
		super();
		this.idclientes = idclientes;
		this.emailclientes = emailclientes;
		this.nomclientes = nomclientes;
	}
	
	public int getIdclientes() {
		return this.idclientes;
	}
	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}

	public String getEmailclientes() {
		return this.emailclientes;
	}

	public void setEmailclientes(String emailclientes) {
		this.emailclientes = emailclientes;
	}

	public String getNomclientes() {
		return this.nomclientes;
	}

	public void setNomclientes(String nomclientes) {
		this.nomclientes = nomclientes;
	}

	@Override
	public String toString() {
		return "Cliente [idclientes=" + idclientes + ", emailclientes=" + emailclientes + ", nomclientes=" + nomclientes
				+ "]";
	}
	

}