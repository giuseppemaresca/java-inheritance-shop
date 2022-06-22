package jana60;

import java.text.DecimalFormat;

public class Prodotto {
	DecimalFormat df = new DecimalFormat("#.00$");
	private String nomeProdotto, marca;

	private double prezzo;

	private int codice, iva = 22;

	// costruttore

	public Prodotto(int codice, String nomeProdotto, String marca, double prezzo) {
		super();
		this.codice = codice;
		this.nomeProdotto = nomeProdotto;
		this.marca = marca;
		this.prezzo = prezzo;
	}

	// Getter and Setters
	public String getNome() {
		return nomeProdotto;
	}

	public void setNome(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}

	// Metodo per calcolare il prezzo

	double prezzoConIva() {
		return prezzo + prezzo * iva / 100;
	}

	@Override
	public String toString() {
		return " Hai acquistato il prodotto " + nomeProdotto + " di marca  " + marca + " al costo di  "
				+ df.format(prezzoConIva()) + " ";

	}

}
