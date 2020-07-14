package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the articulos database table.
 * 
 */
@Entity
@Table(name="articulos")
@NamedQuery(name="Articulo.findAll", query="SELECT a FROM Articulo a")
public class Articulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idarticulo;

	private String articuloscol;

	public Articulo() {
	}

	public int getIdarticulo() {
		return this.idarticulo;
	}

	public void setIdarticulo(int idarticulo) {
		this.idarticulo = idarticulo;
	}

	public String getArticuloscol() {
		return this.articuloscol;
	}

	public void setArticuloscol(String articuloscol) {
		this.articuloscol = articuloscol;
	}

}