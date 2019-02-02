
public class TrooperController {
	
	Command slot;
	 
	public TrooperController() {}
 
	public void setCommand(Command command) {
		slot = command;
	}
 
	public void buttonPressed() {
		slot.execute();
	}
}
