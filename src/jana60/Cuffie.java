package jana60;

public class Cuffie extends Prodotto {
	private String colore;
	private boolean tipo;

	public Cuffie(int codice, String nomeProdotto, String marca, double prezzo, String colore, boolean tipo) {
		super(codice, nomeProdotto, marca, prezzo);
		this.colore = colore;
		this.tipo = tipo;

	}

	@Override
	public String toString() {
		String tipoCuffie = "";
		if (tipo) {
			tipoCuffie = "Wireless";

		} else {
			tipoCuffie = "Cavo";
		}
		return super.toString() + " Cuffia di colore " + colore + " e di tipo " + tipoCuffie;
	}
}
