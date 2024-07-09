package loggesystem;

public class ClientRequest {

	
	
	public static void main(String [] arg) {
		
		InfoLogger info=new InfoLogger();
		
		Logger loggerProcessor=new InfoLogger(new DebugLogger(new ErrorLogger(null)));
		
		loggerProcessor.log(Logger.info, "Error message");
		//loggerProcessor.log(Logger.debug, "Logger message");
		//loggerProcessor.log(Logger.info, "Info message");
		
		
		
	}
	
	
}
