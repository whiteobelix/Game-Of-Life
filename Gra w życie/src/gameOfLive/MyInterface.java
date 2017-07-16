package gameOfLive;

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MyInterface {
	
	static Scanner inputString = new Scanner(System.in);
	static Pattern numberPattern = Pattern.compile("\\d+");
	boolean condition = false;
 	public String s;
 	static int inputNumber = 0;
// 	int xySize = 0; 
	
	public void startGame(){
		do{
			boolean condition = areaChoosing(inputString);			
		}while (condition==false);
		Simulation simulation = new Simulation();
//		bS = simulation.getBoardSet();
		drawBoard(simulation.getBoardSet(), simulation.getXYSize(), simulation.getToDraw(), simulation.getToDelete());
//		rysuj
//			opóżnienie
//		wypisz stat
	}
	
	public boolean areaChoosing(Scanner inputString){
		System.out.println("Choose area of the board (from 30 to 60):");//program nie sprawdza zakresu!!
		String s = inputString.nextLine();
		if (checkIsNumber(s) == true){
			inputNumber = Integer.parseInt(s);
			if (inputNumber == 0){
				System.out.println("Size can't be a zero. Type correct size:");
			} else if (condition == true){
				System.out.println("Size is: " + inputNumber + " x " + inputNumber);
			} else {			
			}
		} else {
			System.out.println("Size is incorrect. Type number:");
		}
				
		return condition;		
	}
	
	public boolean checkIsNumber(String s){
		Matcher matcher = numberPattern.matcher(s);
		boolean match = matcher.matches();
		condition = match;
		return match;
	}
	
	public static void drawBoard(int xySize,  Set<Bug> boardSet, Set<Bug> toDraw, Set<Bug> toDelete){
//		xySize = MyInterface.inputNumber;

		for (int i = 1; i < xySize; i++){
			for (int j = 1; j < xySize; j++){
				Bug bug = new Bug(i,j);
				if (toDraw.contains(bug)){
					System.out.println("b");				
				}	
			}
			System.out.println("/n");
		}
	}
	
	

//	public String getS() {
//		return s;
//	}
//	
//	public void setS(String s) {
//		this.s = s;
//	}

	
}








/*
//try{
	String s = inputString.nextLine();
//}
//catch(IOException e){
//	System.out.println("Błąd rozmiaru planszy");
//}
*/