package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the productos database table.
 * 
 */
@Entity
@Table(name="productos")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_prodcuto")
	private int idProdcuto;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	@Column(name="nom_producto")
	private String nomProducto;

	public Producto() {
	}

	public int getIdProdcuto() {
		return this.idProdcuto;
	}

	public void setIdProdcuto(int idProdcuto) {
		this.idProdcuto = idProdcuto;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNomProducto() {
		return this.nomProducto;
	}

	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}

}