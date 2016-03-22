import java.util.Scanner;
class vardemo
{
public static void main( String args[] )
{
byte b=50;
short s=1024;
int i=10000;
long d;
d=i*s+b;
System.out.println("distance d=" + d + "t");
float r1=2.14f;
Scanner sc=new Scanner (System.in);
float r2=sc.nextFloat ();
System.out.println("area"+(r1*r2));
boolean f=true;
if(f)
System.out.println("boolean value"+f);
}
}