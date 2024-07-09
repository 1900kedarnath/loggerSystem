package loggesystem;

public class ErrorLogger extends Logger {

	
	ErrorLogger(Logger nextLogger){
		super(nextLogger);
	}
ErrorLogger(){
		
	}
	
	
	public void log(int logLevel,String message) {
		
		if(logLevel==error) {
			
			System.out.println("Error"+message);
		}
		else {
			super.log(logLevel, message);
		}
		
		
	}	
	
	
}
