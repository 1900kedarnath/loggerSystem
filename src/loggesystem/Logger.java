package loggesystem;

public abstract class Logger {

	public static int error=1;
	public static int info=2;
	public static int debug=3;
	
	Logger nextLogger;
	
	Logger(Logger nextLogger){
		this.nextLogger=nextLogger ;
	}
	
	Logger(){
		
	}
	public  void log(int logLevel,String message) {
		
		if(nextLogger!=null) {
			nextLogger.log(logLevel, message);
		}
		
	}
	
	
}
