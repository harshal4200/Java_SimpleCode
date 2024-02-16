public class Area{
public static void main(String args[]){
int shape=3;
double area=0;
double base=4;
double height=5;
double radius=6;
double side=4;
System.out.println("Area of Circle or Square or Triangle");
switch(shape){
case 1:

area=3.14*radius*radius;
System.out.println("Circle: "+area);
break;

case 2:

area=side*side;
System.out.println("Square: "+area);
break;

case 3:

area=0.5*base*height;
System.out.println("Triangle: "+area);
break;

default:System.out.println("Invalid area");
}}}