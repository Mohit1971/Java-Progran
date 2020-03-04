import java.util.*;

class Worker
{
  void get()
 {
 }
 
}

class Daily_worker extends Worker
{
void ComPay()
{
Scanner s= new Scanner(System.in);
		
System.out.println("Name");
String name;
name=s.next();


System.out.println("Salary-rate");
int salary_Rate;
salary_Rate=s.nextInt();


System.out.println("Days");
int days;
days=s.nextInt();

int salary;
salary=salary_Rate*days;


System.out.println("Salary of Salaried Worker ");
System.out.println(salary);
}
}

class Salried_worker extends Worker  
{
void ComPay()
{
Scanner s= new Scanner(System.in);


System.out.println("Name");
String name;
name=s.next();

System.out.println("Salary-rate");
int salary_Rate;
salary_Rate=s.nextInt();



System.out.println("Hours");
int hours;
hours=s.nextInt();

int h;
  if(hours >= 40)
  {

   h=hours;
  }
    else
  {
	 h=0;
 }

int salary;
salary=salary_Rate*h;


System.out.println("Salary of Daily worker");
System.out.println(salary);
}

public static void main(String args[])
{

Daily_worker d = new Daily_worker();
d.ComPay();


Salried_worker e = new Salried_worker();
e.ComPay();



}

}


