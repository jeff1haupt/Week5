
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AsteriskLogger wordToLog = new AsteriskLogger();
		wordToLog.Log("Hello");
		wordToLog.Error("Unexpectedly");
		
		SpacedLogger wordToSpace = new SpacedLogger(); 
		wordToSpace.Log("Hello");
		wordToSpace.Error("Unexpectedly");
	}


}
