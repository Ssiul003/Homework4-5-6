/*The program should run if there is a file being scanned called data.txt
with the data formatted like vehicle miles hours without commas or the title.
It should also include several output streams to print out to for the data.
I had trouble ignoring the line with the line for title vehicle speed hours like using
.startsWith.For example, when I tried to use it, it would skip the line 
I wanted but also skip the nextline for a reason and doesn't read the data.The code
I would have would be something like line=sc.nextLine; if(line.startsWith("vehicle"){
}else{ rest of code. It would ignore the title but it was also skip the second line
with data car 30 4. The static PrintStream is something I learned from other CISC
1115 class and I believe it provides a  larger scope when using ps in multiple
method
 */
package su22hw5;

import java.io.File;
import java.util.Scanner;
import java.io.PrintStream;

public class Su22Hw5 {

    static PrintStream ps;
    static PrintStream ps2;
    static PrintStream ps3;
    static PrintStream ps4;
    static PrintStream ps5;
    static PrintStream ps6;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("data.txt"));
        ps = new PrintStream("car.txt");
        ps2 = new PrintStream("train.txt");
        ps3 = new PrintStream("bike.txt");
        ps4 = new PrintStream("motorcyle.txt");
        ps5 = new PrintStream("airplane.txt");
        ps6 = new PrintStream("othervehicles.txt");
        String vehicle, train = "Train", car = "Car", bike = "Bike", 
                airplane = "Airplane", motorcyle = "Motorcyle";
        int miles, hours, mph;
        ps.printf("Hours\t Distance Traveled\n");
        ps.printf("------------------------\n");
        ps2.printf("Hours\t Distance Traveled\n");
        ps2.printf("------------------------\n");
        ps3.printf("Hours\t Distance Traveled\n");
        ps3.printf("------------------------\n");
        ps4.printf("Hours\t Distance Traveled\n");
        ps4.printf("------------------------\n");
        ps5.printf("Hours\t Distance Traveled\n");
        ps5.printf("------------------------\n");
        ps6.printf("Hours\t Distance Traveled\n");
        ps6.printf("------------------------\n");
//the while loop was used to continue reading until it has nothing to read
        while (sc.hasNext()) {

            vehicle = sc.next();
            miles = sc.nextInt();
            hours = sc.nextInt();
            if (miles > 1 && hours > 1) {
//for loop was used because it allowed a formatted output for miles and hours
                for (int i = 1; i <= hours; i++) {
                    saveasFile(vehicle, hours, miles, i, train, car, bike,
                            motorcyle, airplane);

                    mph = distance(miles, hours);
                }

            }
        }

    }

    /*method distance finds the mph of the vehicle.However, I am unsure 
    if I did it the right way because it returns the total mph and the assignment
    wants a seperate format.*/
    public static int distance(int miles, int hours) {
        int mph = 0;
        for (int i = 1; i <= hours; i++) {
            mph = miles * i;

        }
        return mph;

    }

    /*saveasFile prints to the txt file according to the vehicles
    
     */
    public static void saveasFile(String vehicle, int hours, int miles, int i, 
            String train, String car, String bike, String motorcyle
            , String airplane) {
        if (vehicle.equalsIgnoreCase(car)) {
            ps.printf("%d\t\t%d\n", i, miles * i);
        } else if (vehicle.equalsIgnoreCase(train)) {
            ps2.printf("%d\t\t%d\n", i, miles * i);

        } else if (vehicle.equalsIgnoreCase(bike)) {
            ps3.printf("%d\t\t%d\n", i, miles * i);
        } else if (vehicle.equalsIgnoreCase(motorcyle)) {
            ps4.printf("%d\t\t%d\n", i, miles * i);
        } else if (vehicle.equalsIgnoreCase(airplane)) {
            ps5.printf("%d\t\t%d\n", i, miles * i);

        } else {
            ps6.printf("%d\t\t%d\n", i, miles * i);
        }

    }
}
