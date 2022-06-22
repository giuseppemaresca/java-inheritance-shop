package jana60;

import java.util.Random;

public class Smartphone extends Prodotto {
	private int memoria;
	private String imei;
	Random random = new Random();

	public Smartphone(int codice, String nomeProdotto, String marca, double prezzo, int memoria) {
		super(codice, nomeProdotto, marca, prezzo);
		this.imei = generaImei();
		this.memoria = memoria;

	}

	String generaImei() {
		String imei = "";
		for (int i = 0; i < 15; i++) {
			imei += random.nextInt(10);

		}
		return imei;

	}

	@Override
	public String toString() {

		return super.toString() + " Il tuo smartphone ha imei " + imei + " ed è di " + memoria + " Gb ";
	}
}
