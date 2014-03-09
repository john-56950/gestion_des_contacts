package gestion;

public class AdrPostale implements Coordonnees{

	protected String type;
	protected String numero;
	protected String rue;
	protected String codePostal;
	protected String ville;
	
	public AdrPostale() {
		this.type = null;
		this.numero = null;
		this.rue = null;
		this.codePostal = null;
		this.ville = null;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
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
		return ("Adresse: "+numero+" "+rue+", "+codePostal+" "+ville);
	}

	@Override
	public String getType() {
		return type;
	}

}
