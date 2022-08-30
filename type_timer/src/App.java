import java.lang.*;

class Program{
	static void Main(String[] args){

		long startTime = System.nanoTime(); //Gets the time before evaluating next statements

		System.out.println("Your System properties");
		System.out.println("**********************");
		Properties p = System.getProperties();  //Creating a new instance of 
		System.out.println("User name: " + p.getProperty("user.name")); //get User's account name  
		System.out.println("User home directory: " + p.getProperty("user.home")); //get User's home directory  
		System.out.println("User current working directory: " + p.getProperty("user.dir")); //get User's current working directory  
		System.out.println("User Operating System: " + p.getProperty("os.name")); //get operating System
		System.out.println("User Operating System version: " + p.getProperty("os.version")); //get operating system version
		
		long elapsedTime = System.nanoTime() - startTime; //Calculate after executing getProperty() statements
		
				// 1 second = 1_000_000_000 nano seconds
		double elapsedTimeInSecond = (double) elapsedTime / 1_000_000_000;

		System.out.println("Time in seconds it took to execute program: " + elapsedTimeInSecond + " seconds");
	}
}