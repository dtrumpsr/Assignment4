import java.util.Scanner;


public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	      String str;
	      char ch;
	      int vowela=0, vowele=0, voweli=0,vowelo=0,vowelu=0, nonvowels =0;
	      Scanner in = new Scanner(System.in);
	      
	      System.out.println("Enter a string");
	      str = in.nextLine();	     
	      for(int i = 0; i < str.length(); i ++)
			{
				ch = str.charAt(i);

				if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
				ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
				{
					if(ch == 'a' || ch == 'A')
						vowela++;
					if(ch == 'e' || ch == 'E')
						vowele++;
					if(ch == 'i' || ch == 'I')
						voweli++;
					if(ch == 'o' || ch == 'O')
						vowelo++;
					if(ch == 'u' || ch == 'U')
						vowelu++;
				}
				else
				{
				 nonvowels++;				
				}
			}
	      
	      System.out.println("a: "+vowela);
	      System.out.println("e: "+vowele);
	      System.out.println("i: "+voweli);
	      System.out.println("o: "+vowelo);
	      System.out.println("u: "+vowelu);
	      System.out.println("nonvowels: "+nonvowels);

	}

}
