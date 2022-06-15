
package final_project;

public class Product {
    
//Data Members
    private  int id;
    private String name;
    private float price;
    private static int counter=0;

    public Product() {
        name="";
        price=0.0f;
        id=0;
    }
    public Product(String name, float price){
        this.name= name;
        this.price= price;
        counter++;
        id=counter;
    }
    
    public void setId(){
        id=counter;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setPrice(float p){
        price= p;
    }
    public float getPrice(){
        return price;
    }
    public void extra_info(){
        System.out.println("Product_Id: "+id+" / Product_Name: "+name+ " / Product_Price:"+ price);
    } 
    
}
