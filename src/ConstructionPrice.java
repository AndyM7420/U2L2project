import java.util.Scanner;

public class ConstructionPrice {
    public static void main(String[] args) {
         int amountLumber;
         int needWindows;
         ConstructionPricer priceAmount;
         double taxRate;
        Scanner s = new Scanner(System.in);
        System.out.println("How many pieces of lumber do you need for the home you are building?");
        amountLumber  = s.nextInt();
        System.out.println("How many windows do you need?");
        needWindows = s.nextInt();
        System.out.println("What is the tax rate for your area?");
        taxRate = s.nextDouble();
        priceAmount =  new ConstructionPricer(11.50,25.75,taxRate);
        double a =  priceAmount.totalWithTax(amountLumber,needWindows);
        double f = priceAmount.costTotal(amountLumber,needWindows);
        System.out.println(f);
        System.out.println(a);


    }}
