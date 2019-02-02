
public class RecallStormtrooper implements Command{
	
	Stormtrooper stormtrooper;
	 
	public RecallStormtrooper(Stormtrooper stormtrooper) {
		this.stormtrooper = stormtrooper;
	}
 
	public void execute() {
		stormtrooper.recall();
	}

}
