import java.util.Scanner;

public class ProjectZero {

	public static void main(String[] args) {
		
			Scanner inputSource = new Scanner(System.in);
			int input1, input2, result;
			
			System.out.print("Please enter two numbers of your exalted choosing: ");
			input1 = inputSource.nextInt();//users enters number 1
			input2 = inputSource.nextInt();//users enters number 2
			
			result = input1 + input2;
			System.out.println(result);
			
			inputSource.close();
			
	}

}

