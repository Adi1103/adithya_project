package Assignment; 


public class Proj37 {


    public void send(String msg) 
    { 
        System.out.println("Sending\t"  + msg ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + msg + "Sent"); 
    } 
} 
class ThreadedSend extends Thread 
{ 
    private String msg; 
    Proj37 Sender; 
    ThreadedSend(String m,  Proj37 obj) 
    { 
        msg = m; 
    } 
  
    @SuppressWarnings("null")
	public void run() 
    {  
        Object Proj37 = null;
		synchronized(Proj37) 
        { 
        	((Assignment.Proj37) Proj37).send(msg); 
        } 
    } 
} 
class Threads
{ 
    public static void main(String args[]) 
    { 
    	Proj37 snd = new Proj37(); 
        ThreadedSend S1 = 
            new ThreadedSend( " Hello " , snd ); 
        ThreadedSend S2 = 
            new ThreadedSend( " how r u " , snd ); 
        S1.start(); 
        S2.start(); 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
    } 
}