package loggesystem;

public class DebugLogger extends Logger {

	
	DebugLogger(Logger nextLogger){
		super(nextLogger);
	}
	
DebugLogger(){
		
	}
	
	public void log(int logLevel,String message) {
		
		if(logLevel==debug) {
			
			System.out.println("Debug"+message);
		}
		else {
			super.log(logLevel, message);
		}
		
		
	}
}
