public class Calculator{
public static void main(String args[]){
char Operator='+';
int a=3,b=5,result=0;
System.out.println("Enter the symbol +,-,*,/");
switch(Operator){
case '+':
result=a+b;
System.out.println(result);
break;
case '-':
result=a-b;
System.out.println(result);
break;
case '*':
result=a*b;
System.out.println(result);
break;
case '/':
result=a/b;
System.out.println(result);
break;
default:System.out.println("Invalid oppertor.");
}}}