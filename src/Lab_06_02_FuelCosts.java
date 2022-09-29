import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab_06_02_FuelCosts {
    public static void main(String[] args) {
        String trash = "";
        double tankSize = 0;
        double fuelEff = 0;
        double gasPrice = 0;
        double fuelRang = 0;
        double tripCost = 0;
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner in = new Scanner(System.in);
        System.out.println("What is your vehicle's fuel efficiency [mpg]? ");
        if (in.hasNextDouble()){
            fuelEff = in.nextDouble();
            in.nextLine();
        }
        else{
            trash.equals(in.nextLine());
            System.out.println("Invalid Entry. lease Try again.");
            System.exit(0);
        }
        System.out.println("What is your vehicle's fuel capacity [gallons]? ");
        if (in.hasNextDouble()){
            tankSize = in.nextDouble();
            in.nextLine();
        }
        else{
            trash.equals(in.nextLine());
            System.out.println("Invalid Entry. Please Try again.");
            System.exit(0);
        }
        System.out.println("What is the price of a gallon of gas? ");
        if (in.hasNextDouble()){
            gasPrice = in.nextDouble();
            in.nextLine();
        }
        else{
            trash.equals(in.nextLine());
            System.out.println("Invalid Entry. Please try again");
            System.exit(0);
        }
        fuelRang = tankSize * fuelEff;
        tripCost = (gasPrice / fuelEff) * 100;
            System.out.println("Your vehicle can drive for " + df.format(fuelRang) + " miles on a full tank.");
            System.out.println("The cost of driving for vehicle is $" + df.format(tripCost) + " per 100 miles.");
    }
}
