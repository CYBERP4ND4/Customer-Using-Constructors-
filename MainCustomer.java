
import java.util.Scanner;

public class MainCustomer {
   static Scanner input = new Scanner(System.in);
   public static void main(String[] args) {
        customer cus1 = new customer(); //create object
        //input customer details
        System.out.print("Enter Customer No : "); int no = input.nextInt();  input.nextLine();
        System.out.print("Enter Customer Name : "); String name = input.nextLine();
        System.out.print("Enter Customer Address : "); String addr = input.nextLine();
        System.out.print("Enter Item Description : "); String itemdes = input.nextLine();
        System.out.print("Enter price : Php "); double price = input.nextDouble();
        System.out.print("Enter quantity :  "); double quantity = input.nextDouble();
        System.out.print("Mode of Payment");
        System.out.println("\t[1]\tCash\tless 5%");
        System.out.println("\t[2]\t2 installment\tplus 5%");
        System.out.println("\t[3]\t3 installment\tplus 10%");
        System.out.print("Enter choice : "); int modePay = input.nextInt();
         
        customer cus2 = new customer(no, name, addr, itemdes, price, quantity, modePay);
        System.out.println("*************");
        cus1.display();
        System.out.println("*************");
        cus2.display();
        
        // cus1.setCNO(1111);
        // cus1.setCNAME("Angel Bato");
        // cus1.setADD("Porac, Pampanga");
        // cus1.setIDES("Acer mouse");
        // cus1.setPRICE(250.00);
        // cus1.setQUAN(10);
        // cus1.setMODEPAY(1);
        // System.out.println("*************");
        // cus1.display();

    
   } 
}
