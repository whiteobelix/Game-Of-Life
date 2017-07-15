import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MyInterface {
	
	static Scanner inputString = new Scanner(System.in);
	static Pattern numberPattern = Pattern.compile("\\d+");
	boolean condition = false;
	
	public void startGame(){
		do{
			boolean condition = areaChoosing(inputString);			
		}while (condition==false);
		
//		rysuj
//			opóżnienie
//		wypisz stat
	}
	
	public boolean areaChoosing(Scanner inputString){
		System.out.println("Choose area of the board (from 30 to 60):");//program nie sprawdza zakresu!!
		String s = inputString.nextLine();
		checkIsNumber(s);
		return checkIsNumber(s);
		
	}
	
	public boolean checkIsNumber(String s){
		Matcher matcher = numberPattern.matcher(s);
		return matcher.matches();
	}
	
}


/*
//try{
	String s = inputString.nextLine();
//}
//catch(IOException e){
//	System.out.println("Błąd rozmiaru planszy");
//}
*/