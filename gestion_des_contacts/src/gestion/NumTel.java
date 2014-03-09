package gestion;

public class NumTel implements Coordonnees{

	protected String type;
	protected String indicatifPays;
	protected String indicatifLocal;
	protected String numero;
	
	public NumTel() {
		this.type = null;
		this.indicatifPays = null;
		this.indicatifLocal = null;
		this.numero = null;
	}

	public String getIndicatifPays() {
		return indicatifPays;
	}

	public void setIndicatifPays(String indicatifPays) {
		this.indicatifPays = indicatifPays;
	}

	public String getIndicatifLocal() {
		return indicatifLocal;
	}

	public void setIndicatifLocal(String indicatifLocal) {
		this.indicatifLocal = indicatifLocal;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getNature() {
		return null;
	}

	@Override
	public String getValue() {
		return("Indicatif local: "+indicatifLocal+", indicatif du pays: "+indicatifPays+", n° de tél: "+numero);
	}

	@Override
	public String getType() {
		return type;
	}

}
