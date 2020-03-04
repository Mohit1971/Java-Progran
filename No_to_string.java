import java.util.*;


class No_to_string{

public static void main(String args[]){

Scanner s= new Scanner(System.in);

int n;
n=s.nextInt();

int rev=0,r;

// reversing the no.

while(n>0)   
{
r=n%10;
n=n/10;
rev=rev*10+r;
}
//getting one  by one number to print it .....
int m;
while(rev>0)
{
	m=rev%10;
	rev=rev/10;


switch(m)
{
	case 0:
	System.out.print("zero ");
	break;
	case 1:
	System.out.print("one ");
	break;
	case 2:
	System.out.print("two ");
	break;
	case 3:
	System.out.print("three ");
	break;
	case 4:
	System.out.print("four ");
	break;
	case 5:
	System.out.print("five ");
	break;
	case 6:
	System.out.print("six ");
	break;
	case 7:
	System.out.print("seven ");
	break;
	case 8:
	System.out.print("eight ");
	break;
	case 9:
	System.out.print("nine ");
}	
}
}
}