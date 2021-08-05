package imoveis.compras;

public class compradores {

	private int id_casa_c;
	private double oferta_compra;

	public int getId_casa_c() {
		return id_casa_c;
	}

	public void setId_casa_c(int id_casa_c) {
		this.id_casa_c = id_casa_c;
	}

	public double getOferta_compra() {
		return oferta_compra;
	}

	public void setOferta_compra(double oferta_compra) {
		this.oferta_compra = oferta_compra;
	}

	public compradores(int id_casa_c, double oferta_compra) {
		this.id_casa_c = id_casa_c;
		this.oferta_compra = oferta_compra;
	}

}
