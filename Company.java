//Using of get and set method in Encapsulation

class Employee
{
    private int empid; //data hinding 
    public void setEmpid(int eid)
    {
        empid=eid;
    }
    public int getEmpid(){
        return empid;
    }
}
class Company{
    public static void main(String[]args){
        Employee e1 = new Employee();
        e1.setEmpid(101);
        System.out.println(e.getEmpid());
    }
}