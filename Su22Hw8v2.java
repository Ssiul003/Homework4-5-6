/*For the word count program, I believe it should work if theres a file 
wordcount.txt. I wasn't sure of "takes the name of text file(s) from the command line
arguments." was talking about. However, it should run and the example I used 
was copying the program instruction and see if they counted the words correctly.
The wordcount method was used in my previous CISC class and I just took it and 
added some things. For the program2 of basic calculator, I believe it was a lot 
simpler. For it to run, I think it should run easily when followed the instructions.
It required alot of if or switch statements.

*/
package su22hw8v2;
import java.util.Scanner;
import java.io.File;
public class Su22Hw8v2 {

    
    public static void main(String[] args)throws Exception {
     Scanner sc=new Scanner(new File("wordcount.txt"));
      String line;
      int count=0;
      while(sc.hasNextLine()){
          line=sc.nextLine();
           
           count+=wordCount(line);
      }
      System.out.printf("Word Count=%d\n",count);
      
      
    }
    public static int wordCount(String line) {
        int count = 0, i = 0;
        while (i < line.length()) {
            while (i < line.length() && Character.isWhitespace(line.charAt(i))) {
                i++;
            }
            if (i < line.length()) {
                count++;
                while (i < line.length() && !Character.isWhitespace(line.charAt(i))) {
                    i++;
                }
            }
        }
        return count;
    }
    }
}
