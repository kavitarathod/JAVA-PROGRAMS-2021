import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "grab";
		String s2 = "Brag";
		char [] c1;
		char [] c2;
		
		s1.toLowerCase();
		s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			System.out.println("Strings are not anagram");
		}
		else {
			c1 = s1.toCharArray();
			c2 = s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2)) {
				System.out.println("Strings are Anagram");
			}
			else {
				System.out.println("Strings are not Anagram");
			}
		}

	}

}
