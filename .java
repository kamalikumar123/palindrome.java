public class main{
public static void main(String[]args){
int num=3553,reversed num=0,remainder;
int originalnum=num;
while(num!=0){
remainder=num%10;
reversednum=reversednum*10+rremainder;
num/=10;
}
if(originalnum==reversednum){
System.out.println(originalnum+"is palindrome");
}
else{
System.out.println(originalnum+"is not a palindrome");
}
}
