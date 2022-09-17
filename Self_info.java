 class person {
    private String name;
    private String n;
    public void setname(String newname){
        this.name=newname;
    }
    public void setN(String number){
        this.n=number;
    }
    public String getname(){
        return name;
    }
    public String getN()
    {
        return n;
    }

}
public class Self_info{
    public static void main(String[]args){
        person p1= new person();
        System.out.println("Info of a person");
        p1.setname("Asif");
        p1.setN("01642346095");
        System.out.println("Name is "+p1.getname());
        System.out.println("Number is "+p1.getN());
    }

}

