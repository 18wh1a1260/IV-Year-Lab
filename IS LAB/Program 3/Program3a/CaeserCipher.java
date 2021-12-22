import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class CaeserCipher {
	static Scanner sc=new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO code application logic here
		System.out.print("Enter any String: ");
		String str = br.readLine();
		System.out.print("\nEnter the Key: ");
		int key = sc.nextInt();
		String encrypted = encrypt(str, key);
		System.out.println("\nEncrypted String is: " +encrypted);
		String decrypted = decrypt(encrypted, key);
		System.out.println("\nDecrypted String is: "+decrypted);
		System.out.println("\n");
	}
	public static String encrypt(String str, int key){
		String encrypted = "";
		char alph;
		for(int i = 0; i<str.length(); i++) {
			alph=str.charAt(i);
			if (alph >='a'|| alph>='A'||alph<='z'||alph<='Z') {
				alph=(char)(alph+key);
			}
			encrypted+=alph;
		}
		return encrypted;
	}
	public static String decrypt(String str, int key){
		String decrypted = "";
		char alph;
		for(int i = 0; i<str.length(); i++) {
			alph=str.charAt(i);
			if (alph >='a'|| alph>='A'||alph<='z'||alph<='Z') {
				alph=(char)(alph-key);				
			}
			decrypted+=alph;
		}
		return decrypted;
	}
}