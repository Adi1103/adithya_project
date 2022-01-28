package Assignment;

public class Proj22 {



	public static void main(String[] args) {
		
		String s = "340";
		int n = Integer.parseInt(s);
		float f = Float.valueOf(s);
		double d = Double.valueOf(s);
		long l = Long.valueOf(s);
		char[] c = s.toCharArray();
		boolean b =Boolean.valueOf(s);
		System.out.println(n);
		System.out.println(f);
		System.out.println(d); 
		System.out.println(l);
		System.out.println(c);
		System.out.println(b);
	}
}