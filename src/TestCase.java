import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase {

	@Test
	void test() {
		
		TrooperController remote = new TrooperController();
		Stormtrooper stormtrooper = new Stormtrooper();
		
		DeployStormtrooper deployStormtrooper = new DeployStormtrooper(stormtrooper);
		RecallStormtrooper recallStormtrooper = new RecallStormtrooper(stormtrooper);
		
		remote.setCommand(deployStormtrooper);
		remote.buttonPressed();
		remote.setCommand(recallStormtrooper);
		remote.buttonPressed();
	}

}
