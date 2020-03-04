class Parent{
private int x=100;
}

class Child extends Parent 
{

int y=80;
public static void main(String args[])
{

Child s =new Child();
System.out.println(s.x);
System.out.println(s.y);


}
}
