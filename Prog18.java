package Assignment;

public class Prog18 {
	interface DemoInterface  
	{   
	  
	default void display()   
	{   
	System.out.println("The dispaly() method invoked");   
	}   
	}   
	  
	interface DemoInterface1 extends DemoInterface  
	{   
	      
	}   
	 
	interface DemoInterface2 extends DemoInterface  
	{  
	      
	}   
	  
	public class DimondProblem implements DemoInterface1, DemoInterface2  
	{   
	public static void main(String args[])   
	{   
		Prog18 obj = new Prog18();   
	//calling method  
	obj.display();   
	}   
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}  



}
