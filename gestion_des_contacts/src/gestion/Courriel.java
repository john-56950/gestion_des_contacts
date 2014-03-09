package gestion;

public class Courriel implements Coordonnees{
	
	protected String type;
	protected String email;
	
	public Courriel(){
		this.type = null;
		this.email = null;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		return ("email: "+email);
	}

	@Override
	public String getType() {
		return type;
	}

}
