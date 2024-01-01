package p2;

final public class C {
public static void main(String[] args) {
	String str="aababbbaabaabaaabaz";
	System.out.println(str.startsWith("a"));
	System.out.println(str.startsWith("b"));
	System.err.println(str.endsWith("a"));
	System.out.println(str.endsWith("z"));
	System.out.println(str.length());
}
}
