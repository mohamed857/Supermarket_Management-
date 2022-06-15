
package final_project;

import java.util.ArrayList;

public class Order {
    
    private  int id;
    private String date;
    private boolean is_paid;
    Person person;
    ArrayList<Product> product2 = new ArrayList<Product>();
    
    private static int counter=0;
    
    public Order(){
        date="";
        is_paid=false;
        id=0;
    }
    public Order(Person person, ArrayList<Product> products,String date, boolean is_paid){
        id = counter++;
        this.date = date;
        this.is_paid = is_paid;
        this.person=person;
        for(Product p: products){
            product2.add(p);
        }
    }
    
    //Methods
    public void setId(){
        id=counter++;
    }
    public int getId(){
        return id;
    }
    public void setDate(String d){
        date=d;
    }
    public String getDate(){
        return date;
    }
    public void setIs_Paid(boolean ip){
        is_paid= ip;
    }
    public boolean getIs_paid(){
        return is_paid;
    }
    public void Display_Order(){
        System.out.println("-------------------------------------------------");
        System.out.println("--------------------INFO OF ORDER-----------------------------");
        person.extra_info();
        
        System.out.println(" Order_id:"+id+ " /date: "+ date+ " /Is_paid: "+ is_paid);
        
        for(Product p: product2){
            p.extra_info();
            System.out.println("-------------------------------------------------");
        }
        
    }
}
