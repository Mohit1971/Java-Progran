import java.util.*;

class Employee
{
static String name;
static int empid;
static int salary;

Employee(String n , int e,int y)
{
 n=name;
 e=empid;
 y=salary;
}

void increasesalary()
{
int t;
t=salary*4;
System.out.println(t);
}


}

class Manager extends Employee
{

void ret()
{
System.out.println(name +""+ empid +""+ salary);
}

Manager()
{
super( name,  empid,  salary);
}


public static void main(String args[])
{

name = "mohit";
empid = 231 ;
salary = 23000 ;

Manager e = new Manager();


e.ret();
e.increasesalary();
}

}





