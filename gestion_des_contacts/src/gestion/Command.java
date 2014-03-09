package gestion;

public enum Command {
	AJOUTER("ajouter"), SUPPRIMER("supprimer"), REPERTOIRE("repertoire"), QUITTER("quitter");
	
	private final String cmd;
	
	private Command(final String cmd){
		this.cmd = cmd;
	}
	
	public static Command getCommand(final String cmd){
		for(Command c:Command.values()){
			if(cmd.equals(c.cmd)){
				return c;
			}
		}
		return null;
	}
	
	public static void allCommand(){
		for(Command c:Command.values()){
			System.out.println(c);
		}
	}
}
