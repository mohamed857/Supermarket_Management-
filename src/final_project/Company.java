
package final_project;

import java.util.ArrayList;
import java.util.Scanner;


public class Company {
    
    ArrayList<Product> product1= new ArrayList<Product>();
    ArrayList<Product> product2= new ArrayList<Product>();
    int pr[]=new int[5];
    ArrayList<Person> person1= new ArrayList<Person>();
    ArrayList<Order> order1 = new ArrayList<Order>();
    Scanner sc = new Scanner(System.in);
  
    public Company(){
        product1.add(new Product("Chicken",90));
        product1.add(new Product("Meat",170));
        product1.add(new Product("Mango",50));
        product1.add(new Product("Apple",30));
        
        person1.add(new Client("Ebrahim",	"01210000004", "Male","ibrahim@gmail.com"));
        person1.add(new Client("Fatma",		"01000000994", "Female","fatma@gmail.com"));
        person1.add(new Employee("Mostafa", "01110184669", "Male",3000,"PM"));
        person1.add(new Employee("Mona", 	"01566000089", "Female",2000,"AM"));
    }
    
    public void add_product(){
        System.out.println("Enter product name:");
        String name = sc.nextLine();
        System.out.println("Enter product price:");
        float price = sc.nextFloat();
        
        product1.add(new Product(name,price));
        print_products_details();
        }
    public void add_person(){
          
        System.out.println("For Employee :1 /n For Client :2 ");
        int s= sc.nextInt();
        String name="";
        String phone="";
        String gender="";
        float salary=0.0f;
        String wt="";
        String gmail="";
        switch(s){
            case 1:
                System.out.println("Enter Employee name:");
                name = sc.next();
                System.out.println("Enter Employee phone:");
                phone = sc.next();
                System.out.println("Enter Employee gender:");
                gender = sc.next();
                System.out.println("Enter Employee Salary:");
                salary = sc.nextFloat();
                System.out.println("Enter Employee Working_Time:");
                wt= sc.next();
        
                person1.add(new Employee(name,phone,gender,salary,wt));
                System.out.println("Adding Done!!");
                break;
            
            case 2:
                System.out.println("Enter client name:");
                name = sc.next();
                System.out.println("Enter your phone:");
                phone = sc.next();
                System.out.println("Enter client gender:");
                gender = sc.next();
                System.out.println("Enter client gmail:");
                gmail = sc.next();

                person1.add(new Client(name,phone,gender,gmail));
                System.out.println("Adding Done!!");
                break;
            default:
                    System.out.println("Unvalid Choice");     
        }
        print_persons_details(); 
    }
    public void add_order(){
        int d=0;
        product2.clear();
        
        System.out.println("Enter your id:");
        d = sc.nextInt();
           print_products_details();
            int j=0;
            int c=0;
           System.out.print("enter your product No");
             j=sc.nextInt();
            while(j!=0){
                product2.add(product1.get(j-1));
                c++;
         
                System.out.print("enter your product No OR 0 to Done");
                j=sc.nextInt();
            }
            
            order1.add(new Order(person1.get(d-1),product2,"23/10/1999",true));
            
            order1.get(order1.size()-1).Display_Order();
            
//            order1.add(new Order(order.person , order.products ,"23/10/2022", true));
//            order1.add(new Order(order.person , order.products ,"7/6/2022", true));
//            order1.add(new Order(order.person , order.products ,"15/3/2022", false));
//            order1.add(new Order(order.person , order.products ,"14/9/2022", true));

        }
    public void remove_product(){
        int id = 0;
        System.out.println("Enter product Id");
        id = sc.nextInt();
            
            if(product1.isEmpty()){
                System.out.println("There is no product!");
            }
            else{
                for(Product p:product1){
                    if(p.getId()==id){
                         product1.remove(p);
                        System.out.println("Done remove");
                        print_products_details();
                        return;
                    }
                }
            }
            
            
        }
    public void remove_person(){
        int id = 0;
        System.out.println("Enter Person Id");
        id = sc.nextInt();
            
            if(person1.isEmpty()){
                    System.out.println("There is no person!");
            }
            else{
                for(Person p:person1){
                    if(p.getId()==id){
                         person1.remove(p);
                         System.out.println("Done remove");
                         print_persons_details();
                        return;
                    }
                }
                    
            }
            
        }
    public void remove_order(){
        int id = 0;
        System.out.println("Enter Order Id");
        id = sc.nextInt();
            
            if(order1.isEmpty()){
                    System.out.println("There is no order!");
            }
            else{
                for(Order p:order1){
                    if(p.getId()==id){
                         order1.remove(p);
                         return;
                    }
                }
               
            }   
        }
    
    public void print_person_info(){
        int id=0;
        System.out.println("Enter id");
        id=sc.nextInt();
            if(person1.isEmpty())
                System.out.println("There is no person!");
            else
                person1.get(id).extra_info();
    }
    public void print_persons_details(){
        for(Person p:person1){
                p.extra_info();
                System.out.println("---------------------------------------------");
            }
    }

    public void print_products_details(){
        for(Product p:product1){
                p.extra_info();
                System.out.println("---------------------------------------------");
            }
    }
    public void print_product_details(){
        int id=0;
        System.out.println("Enter id");
        id=sc.nextInt();
            if(product1.isEmpty())
                System.out.println("There is no product!");
            else
                product1.get(id).extra_info();
    }
    public void print_order_details(){
        int id=0;
        System.out.println("Enter id");
        id=sc.nextInt();
            if(order1.isEmpty())
                System.out.println("There is no order!");
            else
                order1.get(id).Display_Order(); 
    }
    public void print_person_orders(){
        int id=0;
        System.out.println("Enter person id ");
        id=sc.nextInt();
           for(Order o : order1){
               if(o.person.getId()==id)
                    o.Display_Order();
           }
                   
    }
}
