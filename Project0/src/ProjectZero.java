import java.util.Scanner;
/**
 * ProjectZero is a programs that asks the user for two numbers. 
 * And the program compute the sum of that two number. 
 * @author KURULE  The owner of this project.
 *
 */
public class ProjectZero {
/**
 * This main method asks the user for two numbers 
 * and returns a sum whose data type is based on the user's inputs
 * 
 * @param args
 */

	public static void main(String[] args) {
		
			  /*Write a code that ask the User to enter two numbers
			     *Then the program finds the sum of that two number based on the data type entered by the user.
			     *Data type-could be a double or an integer 
			     */
			
				Scanner inputSource = new Scanner(System.in);
				System.out.println("Please enter two numbers of your exalted choosing: ");
				
				try{
					//this while loop takes care of int-int and int-double sum
					while(inputSource.hasNextInt()){
						int input1= inputSource.nextInt();
						if(inputSource.hasNextInt()){
							int input2= inputSource.nextInt();
							int sum= input1+input2;
							System.out.println( "Your sum is:"+ sum);
						}
						else if(inputSource.hasNextDouble()){
						double input2= inputSource.nextDouble();
						double sum= input1+input2;
					
						System.out.println( "Your sum is:"+ sum);
					}
						
						}
					
					
				//this while loop takes care of double-int and double-double sum
				while(inputSource.hasNextDouble()){
					double input1= inputSource.nextDouble();
					 if(inputSource.hasNextInt()){
						int input2= inputSource.nextInt();
						double sum= input1+input2;
						System.out.println( "Your sum is:"+ sum );
						
					}
					else if(inputSource.hasNextDouble()){
					double input2= inputSource.nextDouble();
					double sum= input1+input2;
					System.out.println( "Your sum is:"+ sum);
				}
					
				}
				
				}
				catch (Exception e){
					System.out.println("Please enter a valid number or input");
				}
				
				int x=2;
				double p=3.4;
				double sum1=x+p;
				System.out.println("Your sum1 is:"+sum1);
				
				
				
				
				
				
	/*			double input1, input2, result; My version of code
		try 
		{
				System.out.print("Please enter two numbers of your exalted choosing: ");
				input1 = inputSource.nextDouble();//users enters number 1
				int in1= (int) input1; // for integer value of the user's first input
				input2 = inputSource.nextDouble();//users enters number 2
				int in2= (int) input2; // for integer value of the user's second input
				
				//the following if-statement executes if the users enters one or both number as decimal
				//Therefore computes the sum as a double--- variable name result
				if(((input1-in1)>0)||((input2-in2)>0)) 
				{result = input1 + input2;// double sum
				System.out.println(result);
				}
				//when the else statement executes, sum is compute as a integer--- variable name sum
				else
				{
					result= input1+input2;
					int res = (int) result;//integer sum
				System.out.println(res);
				}
		}
		//The following lines have Exception case(message)
		catch(Exception e) {
			System.out.println("Please enter a valid number or input");
		} */
		inputSource.close();
	}

}

