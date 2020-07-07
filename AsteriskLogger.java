
public class AsteriskLogger implements Logger {

	
	String str;

	@Override
	public void Log(String str) {
		// TODO Auto-generated method stub
		str = "***" + str + "***";
		System.out.println(str + "\n");
	}

	@Override
	public void Error(String str) {
		// TODO Auto-generated method stub
		str = "*** ERROR: " + str + "***";
		
		String astString = "";
		for(int i = 0; i < str.length(); i++ ) {
			astString = astString + "*";
		}
		
		System.out.println(astString + "\n" + str + "\n" + astString);
		
	}

}