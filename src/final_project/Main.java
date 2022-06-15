
package final_project;

import java.util.Scanner;


public class Main {
    
    static boolean ordering=true;
    public static void menu(){
                System.out.println("********** Welcome To Our Managment System ******************"
                +"\n1. Add Product "
                +"\n2. Add Person"
                +"\n3. Add Order"
                +"\n4. Remove Product"
                +"\n5. Remove Person"
                +"\n6. Remove Order"
                +"\n7. Print_Person_Info"
                +"\n8. Print_Product_Details"
                +"\n9. Print_Order_Details"
                +"\n10. Print_Person_Orders"
                +"\n11. Exit ");
    }
        public static void main(String[] args) {
        
        Company comp = new Company(); 
        
        Scanner sc = new Scanner(System.in);
        menu();
        System.out.println("Enter your choice");
        do{
            
            int choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Add Product ");
                    comp.add_product();
                    break;
                case 2:
                    System.out.println("Add Person ");
                    comp.add_person();
                    break;
                case 3:
                    System.out.println("Add Order ");
                    comp.add_order();
                    break;
                case 4:
                    System.out.println("Remove Product ");
                    comp.remove_product();
                    break;
                case 5:
                    System.out.println("Remove Person ");
                    comp.remove_person();
                    break;
                case 6:
                    System.out.println("Remove Order ");
                    comp.remove_order();
                    break;
                case 7:
                    System.out.println("Print_Persons_Details ");
                    comp.print_persons_details();
                    break;
                case 8:
                    System.out.println("Print_Products_Details ");
                    comp.print_products_details();
                    break;
                case 9:
                    System.out.println("Print_Order_Details ");
                    comp.print_order_details();
                    break;
                case 10:
                    System.out.println("Print_Person_Orders ");
                    comp.print_person_orders();
                    break;
                case 11:
                    System.out.println("Thank you for using application! ");
                    System.exit(0);
                default:
                    System.out.println("Please enter a valid choice");
            }
            System.out.println("Enter Another choice");
        }while(ordering); 
        
        
    }

}
