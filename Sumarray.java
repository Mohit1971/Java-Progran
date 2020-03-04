import java.util.*;


class Sumarray{

public static void main(String args[]){

Scanner s=new Scanner(System.in);

int []x= new int[10];


System.out.println("enter the number");

for(int i=0;i<x.length;i++)
{
	x[i]=s.nextInt();
}
	for(int i=0;i<x.length;i++)
	{
		System.out.println("number is" +x[i]);
}
}
}
