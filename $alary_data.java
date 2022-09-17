class Employee{
    private String name;
    private int id;
    private String salary;
    public void setname(String newname){
        this.name=newname;
    }
    public void setid(int newid){
        this.id=newid;
    }
    public void setsalary(String newsalary){
        this.salary=newsalary;
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
    public String getsalary()
    {
        return salary;
    }
}
public class $alary_data{
    public static void main(String[]args){
        Employee E1= new Employee();
        System.out.println("Info of a Employee: ");
        E1.setname("Asif Dewan");
        E1.setid(213-15-4548);
        E1.setsalary("150000");
        System.out.println("Name is "+E1.getname());
        System.out.println("Id is "+E1.getid());
        System.out.println("Salary is "+E1.getsalary());


    }
}
