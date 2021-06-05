
public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello Hello";
		int count = 0;
		
		//counting characters without space
		for(int i = 0;i<s.length();i++) {
		
			if(s.charAt(i)!= ' ')

			count=count+1;
			
		}
		System.out.println("Length of String is "+count);

	}

}
