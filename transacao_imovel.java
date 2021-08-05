package imoveis.transação;

import java.util.Scanner;
import imoveis.compras.compradores;
import imoveis.vendas.vendedores;

public class transacao_imovel {

	static int id_casa_c = 0, id_casa_v = 0;
	static double oferta_compra = 0, oferta_venda = 0;
	static compradores fulano = new compradores(id_casa_c, oferta_compra);
	static vendedores ciclano = new vendedores(id_casa_v, oferta_venda);

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// COMPRADOR: ID e oferta da casa
		id_casa_c = input.nextInt();
		fulano.setId_casa_c(id_casa_c);
		oferta_compra = input.nextDouble();
		fulano.setOferta_compra(oferta_compra);

		// VENDEDOR: ID e exigido na casa
		id_casa_v = input.nextInt();
		ciclano.setId_casa_v(id_casa_v);
		oferta_venda = input.nextDouble();
		ciclano.setOferta_venda(oferta_venda);

		transacao();
		// Confere se a TRANSAÇÃO deu MATCH
		input.close();
	}

	public static void transacao() {

		String msg;
		if (fulano.getId_casa_c() == ciclano.getId_casa_v() && fulano.getOferta_compra() >= ciclano.getOferta_venda()) {
			msg = "Parabéns! O imóvel foi vendido.";
		} else {
			msg = "Lamento, a transação não foi efetuada. Mais sorte na próxima!";
		}
		System.out.println(msg);
	}
}
