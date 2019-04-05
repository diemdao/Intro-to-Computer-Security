
import java.util.*;
//Diem Dao 
//Oct 26, 2018
//CSCE201

public class AtbashCipher {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the Atbash cipher!");
		
		boolean goOn = true;
		while(goOn = true) {
			System.out.println("Do you want to encrypt or decrypt data? Enter “E” to encrypt, “D” to decrypt or “Q” to quit:");
			String input = keyboard.nextLine();
			
			if(input.equalsIgnoreCase("E")){//to encrypt
				System.out.println("Enter message in plain­text:");
				String inputPlainText = keyboard.nextLine();
				System.out.println("Cipher Text is:");
				System.out.println(theEncrypt(inputPlainText));
			}
			else if(input.equalsIgnoreCase("D")) {//to decrypt
				System.out.println("Cipher Text is:");
				String inputCipher = keyboard.nextLine();
				System.out.println("Message in plain­text is:");
				System.out.println(theDecrypt(inputCipher));
			}
			else if(input.equalsIgnoreCase("Q")) {//to quit
				System.out.println("Exiting the Atbash cipher!");
				System.exit(0);//stop
			}
			else {
				System.out.println("Invalid input, bye");
				break;
			}
		goOn = true;
		}
	}
		
		//Encrypt method
		public static String theEncrypt(String aPlainText){//take in the plain text and return the encrypt text
			String aphabet = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";//can also take in blank space so it's easier not to separate the whole sentence into each word 
			String cipher = "zyxwvutsrqponmlkjihgfedcba ZYXWVUTSRQPONMLKJIHGFECBA";//can also take in Upper case so it's easier to not use any array 
			String textEncrypt = "";
			
			for(int i = 0; i< aPlainText.length(); i++) { //loop throught the plain text
				for(int j = 0; j< aphabet.length() ; j++) { //loop throught the aphabet
					if(aPlainText.charAt(i) == aphabet.charAt(j)) { //if the charater is match 
						textEncrypt += cipher.charAt(j); //the aphabet is convert to cipher and add to textEncrypt
					}
				}
			}
			return textEncrypt;
		}
		public static String theDecrypt(String aCipherText) {//take in cipher and return plain text
			String aphabet = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String cipher = "zyxwvutsrqponmlkjihgfedcba ZYXWVUTSRQPONMLKJIHGFECBA";
			String textCipher = "";
			
			for(int i = 0; i< aCipherText.length(); i++) { //loop throught the cipher text
				for(int j =0; j< aphabet.length() ; j++) { //loop throught the aphabet
					if(aCipherText.charAt(i) == aphabet.charAt(j)) { //if the charater is match 
						textCipher += cipher.charAt(j); 
				}	
				}
			}
			return textCipher;
		}
		
}
