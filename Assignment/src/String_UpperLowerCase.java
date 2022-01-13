
import java.util.Scanner;
public class String_UpperLowerCase {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter String");
		String str=sc.next();
		int Length=str.length();
		char ch[]=str.toCharArray();
		char temp;
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] >ch[j]) {
				
				
				
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		
				}

				
				else {
					
				}
			}
		}
		System.out.println();
		
		System.out.println(new String(ch));
		
      
        }
	}
   

