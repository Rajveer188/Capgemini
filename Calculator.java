import java.util.Scanner;
class Calculator{
   public static void main(String[] arg){
      Scanner scan = new Scanner(System.in);
      System.out.println("enter first number");
      int num1 = scan.nextInt();
      System.out.println("enter second number");
      int num2 = scan.nextInt();
      int result;
      System.out.println("enter operation");
      String operation = scan.next();
      switch(operation){
         case "+":
            result = num1+num2;
            break;
         
         case "*":
            result = num1*num2;
            break;
         
         case "-":
            result = num1-num2;
            break;
         
         case "/":
            result = num1/num2;
            break;
         default:
            System.out.println("no such operation");
            return;
       }
        System.out.println(result);
      }
}