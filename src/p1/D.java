package p1;

public class D {
public static void main(String[] args) {
	String s1=new String("xyz");
	String s2="xyz";
	String s3="xyz";
	String s4=new String("xyz");
	System.out.println(s1==s4);
	System.out.println(s2==s1);
	System.out.println(s2==s3);
}
}
