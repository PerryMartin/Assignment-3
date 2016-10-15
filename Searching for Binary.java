/****************************************************************************
 *
 * Created by: Perry Martin
 * Created on: Oct 2016
 * Assignment 3 Binary search
 ****************************************************************************/


import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class Main {
	
	public static int[] arraySorted(int[] list){
		
		int[]  sortedList = new int[250];
		int highestValue = 1000;
		int lowestValue = 0;
		
		for (int oneCounter = 0; oneCounter < 250; oneCounter++){
			
			highestValue = 1000;
			
			for (int twoCounter = 0; twoCounter < 250; twoCounter++){
				
				if (list[twoCounter] <= highestValue ){
					
					highestValue  = list[twoCounter];
					lowestValue = twoCounter;	
				}
			}
			sortedList[oneCounter] = highestValue;
			list[lowestValue] = 1001;
		}
		return sortedList;
	}
		
 public static void main(String[] args) {
   
        Random randomNumber = new Random();
        
		int[] setOfNumbers = new int[250];
		int[] organizedNumbers = new int[250];
		
		Scanner userInput = new Scanner(System.in);
		int userInputInt;
		
		for (int countNum = 0; countNum < 250; countNum++){
			setOfNumbers[countNum] = randomNumber.nextInt(1000) + 1;
		}
		
		//System.out.println(Arrays.toString(numberSet));
		organizedNumbers = arraySorted(setOfNumbers).clone(); 
		System.out.println(Arrays.toString(organizedNumbers));
		
		while (true){
			System.out.println("Pick a number between 1-1000");
			if (userInput.hasNextInt()){
				userInputInt = userInput.nextInt();
				if ((userInputInt>0)&&(userInputInt<1001)){
					searchForVal(organizedNumbers, userInputInt);
				}
				else{
					System.out.println("That is not a number between 1-1000.");
				}
			}
			else {
				System.out.println("Please type a NUMBER.");
				break;
			}
		}
	}
   
   
   public static void searchForVal(int[]array, int userInput){

		boolean isFound = false;
		
		for (int counter = 0; counter < 250; counter++){
			
			if (userInput == array[counter]){
				
				System.out.println("Your number is number " + (counter + 1) + " on the list.");
				isFound = true;
			}
		}
		if (!isFound){
			
			System.out.println("Your number isn’t on the list, try again.");
			
		}
	}
  
  
  
}
