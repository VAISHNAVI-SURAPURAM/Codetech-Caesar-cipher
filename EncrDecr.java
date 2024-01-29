import java.util.*;
public class EncrDecr {
	public static void main(String []arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		System.out.println("enter encryption/decryption key");
		int key = Integer.valueOf(sc.nextLine());
		String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
		s=s.toLowerCase();
		//encryption
		String e="";
		 for (int i = 0; i < s.length(); i++)   
	        {
			 //getting position of each character 
		int pos = ALPHABET.indexOf(s.charAt(i)); 
		    //getting position of encrypted character
		int ep=(key+pos)%26;
		//getting encrypted character
		char ec=ALPHABET.charAt(ep);
		e+=ec;
		
	        }
		 System.out.println("encrypted word is ------"+e);
		 //decryption
		 String d="";
		 e=e.toLowerCase();
		 for (int i = 0; i < s.length(); i++)   
	        { 
			//getting position of each character 
		int pos = ALPHABET.indexOf(e.charAt(i));
		//getting position of decrypted character
		int dp=(pos-key)%26;
		if(dp<0) {
			dp=ALPHABET.length()+dp;
		}
		//getting decrypted character
		char dc=ALPHABET.charAt(dp);
		d+=dc;
	        }
		 System.out.println("decrypted word is ------"+d);
		
		sc.close();
		}
}
