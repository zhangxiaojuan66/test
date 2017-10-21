package first;

/**
 *
 * @author  
 */
 import java.util.Scanner;
 import java.util.Stack;
 public class Tools{
private static String toBinary(int num)
{
 String[] digits = new String[]{"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
String result = "";
Stack<Integer> Stack = new Stack<Integer>();
while(num > 0){
int flag = num % 2;
Stack.push(flag);
num = num/2;
}
while(!Stack.empty()){
result = result+digits[Stack.pop()];
}
return result;
}
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("请输入十进制:");
int a=scanner.nextInt();
System.out.print(toBinary(a));
}
}   
