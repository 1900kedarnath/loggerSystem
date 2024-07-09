package loggesystem;

public class InfoLogger extends Logger {

	
	InfoLogger(Logger nextLogger){
		super(nextLogger);
	}
	
	InfoLogger(){
		
	}
	
	public void log(int logLevel,String message) {
		
		if(logLevel==info) {
			
			System.out.println("info"+message);
		}
		else {
			super.log(logLevel, message);
		}
		
		
	}
	
	
}
