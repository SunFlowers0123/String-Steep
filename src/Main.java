import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("qwertyuiopasdfghjklzxcvbnm");
		pyramid(str);
	}

	
	static void pyramid(StringBuilder str) {
		for(int i=0;i<=str.length();i++) {
			System.out.println(str.substring(0, i));
		}
		
	}
	
}
	
