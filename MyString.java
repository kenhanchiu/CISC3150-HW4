import java.io.Console;
import java.util.Scanner;

public class MyString{
	private char[] input = new char[1000];
	private int inputlength;
	public MyString(char[] chars){
		for(int i=0;i<chars.length;i++){
			input[i] = chars[i];
		}
		System.out.println();
		System.out.print("Your word is: ");
		for(int j=0;j<chars.length;j++){
			System.out.print(input[j]);
		}
		System.out.println();
		System.out.println();
		inputlength = chars.length;
	}
	public char charAt(int index){
		return input[index];
	}
	public int length(){
		return inputlength;
	}
	public void substring(int begin, int end){
		char[] chars = new char[1000];
		int temp = begin;
		System.out.print("The substring is: ");
		for(int i=0;i<(end-begin);i++){
			chars[i] = input[temp];
			temp++;
			System.out.print(chars[i]);
		}
		System.out.println();
	}
	public void toLowerCase(){
		System.out.print("This is the lowercase form of your word: ");
		for(int i=0;i<inputlength;i++){
			input[i] = Character.toLowerCase(input[i]);
			System.out.print(input[i]);
		}
		System.out.println();
	}
	public void toUpperCase(){
		System.out.print("This is the uppercase form of your word: ");
		for(int i=0;i<inputlength;i++){
			input[i] = Character.toUpperCase(input[i]);
			System.out.print(input[i]);
		}
		System.out.println();
	}
	public boolean equals(MyString s){
		int counter = 0;
		for(int i=0;i<inputlength;i++){
			if(input[i] == s.input[i]){
				counter++;
			}
		}
		if(counter == inputlength){
			return true;
		}
		else{
			return false;
		}
	}
	public void getMyString(){
		System.out.print("Your word is: ");
		for(int j=0;j<inputlength;j++){
			System.out.print(input[j]);
		}
		System.out.println();
	}
	public String toString(){
		String[] list = new String[inputlength];
		String k = "";
		for(int j=0;j<inputlength;j++){
			list[j] = Character.toString(input[j]);
			k = k + list[j];
		}
		return k;
	}
	public void valueOf(int i){
		System.out.println("The value is: " + input[i]);
	}	
	public static void main(String[] args){
		Console c = System.console();
		System.out.println("Note: This program can not read spaces. It can only read single words.");
		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your word!");
		char[] chars = scan.next().toCharArray();
		MyString test = new MyString(chars);
		System.out.println("Your word contains " + test.length() + " letters!");
		System.out.println();
		String z = c.readLine("Enter a number to see the letter corresponding to that index.");
		int a = Integer.parseInt(z);
		System.out.println("The letter is " + test.charAt(a) + ".");
		System.out.println();
		System.out.println();
		String y = c.readLine("Enter a number for the beginning of the substring.");
		int b = Integer.parseInt(y);
		String x = c.readLine("Enter a number for the end of the substring.");
		int d = Integer.parseInt(x);
		System.out.println();
		System.out.println();
		test.substring(b,d);
		System.out.println();	
		System.out.println();
		test.getMyString();
		System.out.println("The converted string is: " + test.toString());
		System.out.println();	
		System.out.println();
		System.out.println("Please enter the word you wish to compare.");
		char[] secondchars = scan.next().toCharArray();
		MyString testtwo = new MyString(secondchars);
		System.out.println();
		System.out.println("If it is true then they are the same!");
		System.out.println("If it is false then they are different!");
		System.out.println();
		System.out.println("They are:" + test.equals(testtwo));
		System.out.println();
		String p = c.readLine("Enter a number to find value of it in the word.");
		int g = Integer.parseInt(p);
		test.valueOf(g);
		System.out.println();
		test.toLowerCase();
		test.toUpperCase();
		System.out.println();	
		System.out.println();
	}	
}