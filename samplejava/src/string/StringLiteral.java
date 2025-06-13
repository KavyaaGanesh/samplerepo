package string;

public class StringLiteral {

	public static void main(String[] args) {
		String s="kavya";
		String s1="kavya";
		String s2="Kavya";
		String s3=new String("java");
		String s4=new String("java");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.equals (s1));
		System.out.println(s3.equals (s4));
		System.out.println(s.equals(s4));

	}

}
