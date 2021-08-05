package imoveis.vendas;

public class vendedores {

	private int id_casa_v;
	private double oferta_venda;

	public int getId_casa_v() {
		return id_casa_v;
	}

	public void setId_casa_v(int id_casa_v) {
		this.id_casa_v = id_casa_v;
	}

	public double getOferta_venda() {
		return oferta_venda;
	}

	public void setOferta_venda(double oferta_venda) {
		this.oferta_venda = oferta_venda;
	}

	public vendedores(int id_casa_v, double oferta_venda) {
		this.id_casa_v = id_casa_v;
		this.oferta_venda = oferta_venda;
	}

}
