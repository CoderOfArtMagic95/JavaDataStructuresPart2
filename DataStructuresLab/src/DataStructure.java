import java.util.Arrays;
import java.util.Scanner;

public class DataStructure {

	    int number;
		int number2;
		int number3;
		int number4;
		int number5;
		int number6;
		int numbers[] = new int[20];
		
	    public void Sum() {
	    	Scanner checker = new Scanner(System.in);
	    	System.out.println("Choose a number");
	    	number = Integer.parseInt(checker.nextLine());
	    	System.out.println("Choose another number");
	    	number2 = Integer.parseInt(checker.nextLine());
	    	System.out.println("And another one");
	    	number3 = Integer.parseInt(checker.nextLine());
	    	System.out.println("Another one");
	    	number4 = Integer.parseInt(checker.nextLine());
	    	System.out.println("Another one");
	    	number5 = Integer.parseInt(checker.nextLine());
	    	System.out.println("One more");
	    	number6 = Integer.parseInt(checker.nextLine());
	    	checker.close();
	    	
	    	int numbers[] = {number, number2, number3, number4, number5, number6};
	    	int sum = 0;
			for(int num = 0; num < numbers.length; num++) {
				//adds all numbers
				sum += numbers[num]++;
				//sum = Arrays.stream(numbers).sum();
			}
			System.out.println("Sum: " + sum);
		}
	    
		public int Maximum() {
			numbers[0] = number;
			numbers[1] = number2;
			numbers[2] = number3;
			numbers[3] = number4;
			numbers[4] = number5;
			numbers[5] = number6;
			
			//need to fix Maximum method
			
	    	int max = 0;
	    	int index = 0;
	    	for(int num2 : numbers) {
	    		if(max < numbers[num2]) {
	    			max =  numbers[num2];
	    			index++;
	    		}
	    		System.out.println("Maximum Output: " + max + " " +"Maximum index: " + numbers[num2]);
	    		break;
	    	}
	    	return max;
	    }
	    public static void toPower(int size, int power) {
	    	int[] powerOf = new int[size];
	    	int result = 0;
	    	for(int n : powerOf) {
	    	  result = (int)Math.pow(size,power) / power;
	    	}
	    	 System.out.println("To The Power Of: " + (result) + ", " + (result * 2)
	    			 + ", " + (result * 3) + ", " + (result * 4));
	    }
	    
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      DataStructure data = new DataStructure();
	      
	      data.Sum();
	      data.Maximum();
	      DataStructure.toPower(2, 4);
		}

	}