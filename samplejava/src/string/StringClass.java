package string;

public class StringClass {

	public static void main(String[] args) {
		String s1= "Hello World";
		
		//method 1-Length
		System.out.println(s1.length());
		
		//Method 2- characterAt()
		System.out.println(s1.charAt(3));
		
		//method 3-valueof()
		int a=123;
		String a1=String.valueOf(a);
		System.out.println(a1);
		
		//method 4- equals
		String s2="java";
		System.out.println(s1.equals(s2));
		
		//method 5-equalsignorecase()
		
		String s3="hello World";
				System.out.println(s1.equalsIgnoreCase(s3));
		
		//method-6  isEmpty()
				System.out.println(s2.isEmpty());
				
		//method 7- concate()
				System.out.println(s1.concat(s3));
				
		
				//method 8- toLowerCase()
				System.out.println(s1.toLowerCase());
				
				//method 9-toUpperCase()
				System.out.println(s1.toUpperCase());
				
				
				//method 10-contains()
				System.out.println(s1.contains("world"));
				
		

	}

}
