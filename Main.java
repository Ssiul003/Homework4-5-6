import java.util.Scanner;
public class Main{
	 public static void main(String[] args) throws Exception{
         
        int month, year, monthdays, days, numDays = 0;
         Month mnumber=new Month();
         
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a month (1-12):");

        month = sc.nextInt();
        
        while (month > 0) {
            System.out.println("Please enter a year");
            year = sc.nextInt();
            Month number = new Month();
            int name = number.Month(month);
            String name2 = number.toString();
            
            MonthDays day = new MonthDays(month, year);
            int monthNumber=mnumber.Month(month);
            days = day.getNumberOfDays(monthNumber, year, numDays);
            int num = day.getNumberOfDays(monthNumber, year, numDays);

            System.out.printf("%s  %d has %d days\n", name2, year, days);

            System.out.println("Please enter a month (1-12)or enter (0) to stop:");

            month = sc.nextInt();

        }
    }

     private static class Month {
    static int monthNumber;
        private Month() {
            monthNumber=1;
        }

        private int Month(int monthnumber2) {
            if (monthnumber2 < 1 || monthnumber2 > 12) {
                monthNumber = 1;
            } else {
                monthNumber = monthnumber2;
                return monthNumber;

            }
            return monthNumber;
        }

        private int Month(String monthname) {

            if (monthname.equalsIgnoreCase("January")) {
                monthNumber = 1;
            } else if (monthname.equalsIgnoreCase("February")) {
                monthNumber = 2;
            } else if (monthname.equalsIgnoreCase("March")) {
                monthNumber = 3;
            } else if (monthname.equalsIgnoreCase("April")) {
                monthNumber = 4;
            } else if (monthname.equalsIgnoreCase("May")) {
                monthNumber = 5;
            } else if (monthname.equalsIgnoreCase("June")) {
                monthNumber = 6;
            } else if (monthname.equalsIgnoreCase("July")) {
                monthNumber = 7;
            } else if (monthname.equalsIgnoreCase("August")) {
                monthNumber = 8;
            } else if (monthname.equalsIgnoreCase("September")) {
                monthNumber = 9;
            } else if (monthname.equalsIgnoreCase("October")) {
                monthNumber = 10;
            } else if (monthname.equalsIgnoreCase("November")) {
                monthNumber = 11;
            } else if (monthname.equalsIgnoreCase("December")) {
                monthNumber = 12;
            }
            return monthNumber;

        }
    private void setMonthNumber(int x){
      if (x< 1 || x > 12)
         monthNumber = 1;
      else
         monthNumber = x;
   }

        private int getMonthNumber() {
            return monthNumber;
        }

        private String getMonthName() {

            switch (monthNumber) {
                case 1: {
                    return "January";
                }
                case 2: {
                    return "February";
                }
                case 3: {
                    return "March";
                }
                case 4: {
                    return "April";
                }
                case 5: {
                    return "May";
                }
                case 6: {
                    return "June";
                }
                case 7: {
                    return "July";
                }
                case 8: {
                    return "August";
                }
                case 9: {
                    return "September";
                }
                case 10: {
                    return "October";
                }
                case 11: {
                    return "November";
                }
                case 12: {
                    return "December";
                }
                default: {
                    break;
                }
            }

            return "January";

        }

        public String toString() {
            return getMonthName();
        }

        private boolean equals(Month x) {
            if (x.getMonthNumber() == this.getMonthNumber()) {
                return true;
            } else {
                return false;
            }
        }
    }

    private static class MonthDays {

        

        public MonthDays(int monthNumber, int yearNumber) {
           int month = monthNumber;
            int year = yearNumber;

        }

        public static int getNumberOfDays(int monthNumber, int year, int numDays) {
            if (monthNumber==2) {
                if ((year%100==0)&&(year%400==0)||(year%4==0)
                        &&!(year%100==0)) {
                    numDays = 29;
                } else {
                    numDays=28;
                }
            } else if (monthNumber==1||monthNumber==3||monthNumber==5
                    ||monthNumber==7||monthNumber==8||monthNumber==10
                    ||monthNumber==12) {
                numDays=31;
            } else {
                numDays=30;
            }
            return numDays;
        }
    }

}
