/*For the word count program, I believe it should work if theres a file 
wordcount.txt. I wasn't sure of "takes the name of text file(s) from the command line
arguments." was talking about. However, it should run and the example I used 
was copying the program instruction and see if they counted the words correctly.
The wordcount method was used in my previous CISC class and I just took it and 
added some things. For the program2 of basic calculator, I believe it was a lot 
simpler. For it to run, I think it should run easily when followed the instructions.
It required alot of if or switch statements.

*/
package su22hw8;
import java.util.Scanner;
import java.io.File;
public class Su22Hw8 {

    
    public static void main(String[] args)throws Exception {
       double number1;
        double number2;
        String operation;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        System.out.println("Enter a zero to stop");
        number1 = sc.nextDouble();
        
        while (number1 > 0) {
            System.out.println("Please enter operation(+,-,*,or /)");
            operation = sc.next();
            System.out.println("Please enter another whole number");
            number2 = sc.nextDouble();
            if (operation.equals("+")) {
                System.out.println("Answer is " + (number1 + number2));
            } else if (operation.equals("-")) {
                System.out.println("Answer is " + (number1 - number2));
            } else if (operation.equals("/")) {
                System.out.println("Answer is " + (number1 / number2));
            } else if (operation.equals("*")) {
                System.out.println("Answer is " + (number1 * number2));
            }
            System.out.println("Please enter  a whole number");
            System.out.println("Enter a zero to stop");
            number1 = sc.nextInt();

        }
            if (number1 == 0) {
                System.out.println("Program has ended");

        }
      }
}

