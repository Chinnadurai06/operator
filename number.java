import java.util.Scanner;
public class number{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the secound number :");
        int num2=sc.nextInt();
        System.out.println("Enter the operator(+,-,*,/):");
        char operator=sc.next().charAt(0);
        int result =0;
        switch(operator){
            case '+':
             result =num1+num2;
             break;
            case '-':
             result=num1-num2;
             break;
            case '*':
             result=num1*num2;
             break;
            case '/':
             if(num2!=0){
             result=num1/num2;
             }
             else{
                System.out.println("can't divide by zero!");
             }  
             break;
            default:
             System.out.println("invalid operator");
            }
            System.out.println("result:"+result);
    }
}