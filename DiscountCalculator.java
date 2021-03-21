import java.util.*;
public class DiscountCalculator {
    public static void main(String[] args) {
        Student studobj = new Student();
        Senior senobj = new Senior();
        LoyalCustomer lcobj = new LoyalCustomer();
        Coupon100 coup1 = new Coupon100();
        Coupon300 coup3 = new Coupon300();
        System.out.print("Enter the price of the product: ");
        Scanner a = new Scanner(System.in);
        double price = a.nextDouble();
        System.out.print("Enter the kind of discount that will be given (student/loyal customer/senior/coupon100/coupon300): ");
        Scanner b = new Scanner(System.in);
        String disc = b.nextLine();
        if (disc.equalsIgnoreCase("student")){
            System.out.println("The discounted price is: " + studobj.stud(price));
        }else if(disc.equalsIgnoreCase("senior")){
            System.out.println("The discounted price is: " + senobj.senior(price));
        }else if(disc.equalsIgnoreCase("loyal customer")){
            System.out.println("The discounted price is: " + lcobj.loyalcust(price));
        }else if(disc.equalsIgnoreCase("coupon100")){
            System.out.println("The discounted price is: " + coup1.coup100(price));
        }else if(disc.equalsIgnoreCase("coupon300")){
            System.out.println("The discounted price is: " + coup3.coup300(price));
        }else{
            System.out.println("Please input a valid choice.");
        }
    }    
}

public class Student {
    public double stud(double price){
        double b = 0.10;
        double c = price*b;
        return price-c;
    }
}

public class LoyalCustomer {
    public double loyalcust (double price){
        double b = 0.15;
        double c = price*b;
        return price-c;
    }
}
