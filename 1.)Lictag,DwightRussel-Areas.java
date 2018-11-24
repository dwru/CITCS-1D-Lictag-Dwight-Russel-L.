import java.util.Scanner;
class allarea{
public static void main(String []args){
String circle,square,rectangle,rhombus,choose,up,on,yes,no;
Scanner in =new Scanner (System.in);
System.out.print("\ncircle,square,rectangle,rhombus");
System.out.print("\nchoose between the four ");
choose=in.nextLine();
switch(choose){
	case("circle"):
	double pie=3.14,rad,area;
	System.out.print(" enter radius ");
	rad=in.nextDouble();
	area=pie*(rad*rad);
	System.out.print(" the area is "+area);
	break;
	case("rectangle"):
	double l,w,are;
	System.out.print("enter lenght ");
	l=in.nextDouble();
	System.out.print("enter width ");
	w=in.nextDouble();
	are=l*w;
	System.out.print("the area is "+are);
	break;
	case("triangle"):
	double b,h,ar;
	System.out.print("enter the base ");
	b=in.nextDouble();
System.out.print("enter height ");
h=in.nextDouble();
ar=(b*h)/2;
System.out.print("the area is "+ar);
break;
case("square"):
double s,a;
System.out.print("enter side ");
s=in.nextDouble();
a=s*s;
System.out.print("the area is "+a);
break;
}
Scanner out =new Scanner (System.in);
System.out.print("\nwould you want to do it again");
System.out.print("\n yes or no ");
up=out.nextLine();
if(up=="yes"){
	Scanner p =new Scanner (System.in);
System.out.print("\ncircle,square,rectangle,rhombus");
System.out.print("\nchoose between the four ");
choose=p.nextLine();
switch(choose){
	case("circle"):
	double pie=3.14,rad,area;
	System.out.print(" enter radius ");
	rad=in.nextDouble();
	area=pie*(rad*rad);
	System.out.print(" the area is "+area);
	break;
	case("rectangle"):
	double l,w,are;
	System.out.print("enter lenght ");
	l=in.nextDouble();
	System.out.print("enter width ");
	w=in.nextDouble();
	are=l*w;
	System.out.print("the area is "+are);
	break;
	case("triangle"):
	double b,h,ar;
	System.out.print("enter the base ");
	b=in.nextDouble();
System.out.print("enter height ");
h=in.nextDouble();
ar=(b*h)/2;
System.out.print("the area is "+ar);
break;
case("square"):
double s,a;
System.out.print("enter side ");
s=in.nextDouble();
a=s*s;
System.out.print("the area is "+a);
break;
}
}
else if(up=="no"){
	System.out.print("fuck this shit im out!!!!!!!");
}
else{
}
}
}