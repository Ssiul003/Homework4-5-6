/*I believe the assignment should run when putting outputs from the keyboard.
However, I'm unsure if the math is correct because reading the instructions
I wasn't sure of what the current mileage was talkng about. Most of the assignments
required required following instructions and I believe I struggled in interpretting
what it wants and the math of the program. I also believe that there is no point
for vehicleModel/make and yearModel because it only holds the value.
*/
package su22hw7;

import java.util.Scanner;

public class Su22Hw7 {

    public static void main(String[] args) throws Exception {
        Printout();
    }
    
    public static void Printout() {
        String vehicleModel;
        int yearModel, speed, gallons=0,miles;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a vehicle model");
        vehicleModel = sc.next();
        System.out.println("Please enter the yearmodel of the car");
        yearModel = sc.nextInt();
        System.out.println("Please enter the speed of the car");
        speed = sc.nextInt();
        
        Car car = new Car(yearModel, vehicleModel, speed);
        FuelGauge fuelgauge = new FuelGauge(gallons);
        Odometer odometer = new Odometer(speed, fuelgauge);
        for (int x=0;x<FuelGauge.MAXIMUMGALLONS;x++) {
            fuelgauge.addGallons();
        }
        while (fuelgauge.getGallons() >= 0) {
            car.accelerate();
            odometer.addMile();
            odometer.subtractMile();
            car.brake();
            double mile=odometer.addMile()+odometer.subtractMile();
            System.out.printf("Miles: %2f\n",mile);
                if(fuelgauge.getGallons()>0){
                    System.out.printf("Fuel : %.2f gallons\n",fuelgauge.getGallons());
                    System.out.println("------------------------------");
                }else{
                     System.out.println("NO MORE FUEL");
                    }           
        }
    }
    
    public static class Car {
        private int yearModel;
        private String make;
        private int speed=0;
        public Car(int yearModel, String make, int speed) {
            this.yearModel = yearModel;
            this.make = make;
            this.speed = speed;
        }
        public int getYearModel() {
            return yearModel;
        }
        public String getMake() {
            return make;
        }
        public int getSpeed() {
            return speed;
        }
        public void accelerate() {
            speed = 5 + speed;
            
        }
        public void brake() {
            speed = speed - 5;
        }
    }
    
    public static class FuelGauge {
        final static int MAXIMUMGALLONS = 15;
        private double gallons;
        public FuelGauge() {
            gallons = 0;
        }
        public FuelGauge(int gallons) {
            if (gallons < MAXIMUMGALLONS) {
                this.gallons = gallons;
            } else {
                gallons = MAXIMUMGALLONS;
            }
        }
        public double getGallons() {
            return gallons;
        }
        public void addGallons() {
            if (gallons < MAXIMUMGALLONS) {
                gallons++;
            }
        }
        public double burnFuel() {
            if (gallons > 0) {
                gallons=gallons-1+Math.random();
            }
            return gallons;
        }
    }
    
    public static class Odometer {
        public final int MAXIMUMMILEAGE = 999999;
        public final int mpg=24;
        private int mile;
        private FuelGauge fuelGauge;
        
        public Odometer(int mile, FuelGauge fuelGauge) {
            this.mile = mile;
            this.fuelGauge = fuelGauge;
        }
        public int getMile() {
            return mile;
        }
        public int addMile() {
            if (mile < MAXIMUMMILEAGE) {
                mile= mile+5;
            }else{
                mile = 0;
            }
            return mile;
        }
        public double subtractMile(){
            if (mile%mpg==0){
                fuelGauge.burnFuel();
            }
            return fuelGauge.burnFuel();
        }
    }

}
