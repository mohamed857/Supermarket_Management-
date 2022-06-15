
package final_project;

public class Person {

    //Data Members
    private  int id;
    private static int counter=0;
    private String name;
    private String phone;
    private String gender;

    Person(){
        id=0;
        name="";
        phone="";
        gender="";
    }
    Person(String name, String phone, String gender){
        this.name=name;
        this.phone=phone;
        this.gender=gender;
        counter++;
        id=counter;
    }
    //Methods
    public void setId(){
        id=counter++;
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
    public void setPhone(String p){
        phone=p;
    }
    public String getPhone(){
        return phone;
    }
    public void setGender(String g){
        gender=g;
    }
    public String getGender(){
        return gender;
    }
    
    public void extra_info(){
        System.out.print("Id: "+id+" / Name: "+name+" / Phone: "+ phone +" / Gender:"+ gender);
    }
}
class Client extends Person{
    private String email;
    Client(){
        super();
        email="";
    }
    Client(String name, String phone, String gender, String email){
        super(name,phone,gender);
        this.email=email;
    }
    
    public void setEmail(String e){
        email=e;
    }
    public String getEmail(){
        return email;
    }
    
    @Override
    public void extra_info(){
        super.extra_info();
        System.out.println(" / Email: "+ email);
    }
}

// Class Employee
class Employee extends Person{
    private float salary;
    private String working_time;
    Employee(){
        super();
        salary=0.0f;
        working_time= "";
    }
    Employee(String name, String phone, String gender, float salary, String working_time){
        super(name,phone,gender);
        this.salary= salary;
        this.working_time= working_time;
    }
    public void setSalary(float s){
        salary= s;
    }
    public float getSalary(){
        return salary;
    }
    public void setWorking_time(String wt){
        working_time= wt;
    }
    public String getWorking_time(){
        return working_time;
    }
    
    @Override
    public void extra_info(){
        System.out.println("Id: "+super.getId()+" / Name: "+super.getName()+" / Phone: "+ super.getPhone() +
                " / Gender:"+ super.getGender()+ " / Salary: "+ salary+ " / Working_time: "+ working_time);
    }
}
