package jana60;

public class Tv extends Prodotto {
	private int dimensioni;
	boolean smart;

	public Tv(int codice, String nomeProdotto, String marca, double prezzo, int dimensioni, boolean smart) {
		super(codice, nomeProdotto, marca, prezzo);
		this.dimensioni = dimensioni;
		this.smart = smart;

	}

	@Override
	public String toString() {
		String tipo = "";
		if (smart) {
			tipo = "smart";

		} else {
			tipo = "Non Smart";
		}

		return super.toString() + "di tipo" + tipo + "ha le dimensioni di " + dimensioni;
	}

}
