/*I think the program can easliy be runned because the values are kind of hard
coded and unsure if the assignment was supposed to be like that.However,it 
should run without any issues.I think the assignment was a little easier 
compared to others becasue it was following instructions and using trial and 
error to display what is assigned. I also had help from internet like using 
LocalTime and instanceOf to help me complete the assignment.
*/
package su22hw4;

import java.time.LocalTime;

public class Su22Hw4 {

    public static void main(String[] args) {
        String s1 = "first";
        String s2 = "second";
        String s3 = "third";
        String s4 = "fourth";
        String s5 = "fifth";
        String s6 = "sixth";
        String s7 = "seventh";
        String s8 = "eighth";
        String s9 = "nineth";
        String s10 = "tenth";
        String placing[] = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};
        int length1 = 0, length2 = 0;
        int[][] values = new int[10][20];
        basicArray();
        printElements(placing);
        length1 = values.length;
        length2 = values[0].length;
        System.out.printf("number of rows=%d\n", length1);
        System.out.printf("numbers of columns=%d\n", length2);
        printElements2(values);
        LocalTime time1 = LocalTime.of(12, 23, 34);
        LocalTime time2 = LocalTime.of(11, 10, 20);
        LocalTime time3 = LocalTime.of(9, 30, 20);
        LocalTime[] time = {time1, time2, time3};
        printElements3(time);
    }
//basicArray prints out and array of numbmers that increase by 10 begins from
//nums[0]to nums[50]
    public static int[] basicArray() {
        int[] nums = new int[50];
        int counter = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (i * 10);
            System.out.printf("%d\n", nums[i]);
        }
        return nums;
    }
/*printsElements prints out the placing from first to tenth.The instanceOf was 
    taken online and helped me verify if the placing[i]was a string or  not.
    */
    public static void printElements(String placing[]) {
        for (int i = 0; i < placing.length; i++) {
            if (placing[i] instanceof String) {
                System.out.printf("%s\n", placing[i]);
            }

        }
    }
/*printsElements2 prints the 2d array in a matrix form. I was struggling
    printing it in the matrix form when I used println(values[i][j]
    because it was printing out in a single line. Making another variable
    x allowed me to print out in a formatted way
    */
    public static void printElements2(int[][] values) {
        int x = 0;

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {

                System.out.printf("%2d", x);
//System.out.println(values[i][j]);

            }
            System.out.print("\n");
        }
    }
/*printsElements3 prints out the time from the main method.I took instanceOf
    from the internet and it allows me to verify the type.I'm unsure 
    if using LocalTime is the way you wanted because it was supposed to be
    in string form.
    */
    public static void printElements3(LocalTime[] time) {
        for (int i = 0; i < time.length; i++) {
            if (time[i] instanceof LocalTime) {
                System.out.println(time[i] + " EST");
                System.out.printf("\n");
            }
        }
    }
}
