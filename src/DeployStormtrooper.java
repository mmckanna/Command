
public class DeployStormtrooper implements Command {
	
	Stormtrooper stormtrooper;
	  
	public DeployStormtrooper(Stormtrooper stormtrooper) {
		this.stormtrooper = stormtrooper;
	}
 
	public void execute() {
		stormtrooper.deploy();
	}

}
