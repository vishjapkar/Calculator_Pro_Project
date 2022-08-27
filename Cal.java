import java.util.Scanner;
class Cal 
{
    public static void main(String[] args)
     {
    
        
	    
	    Double result;
         Scanner n=new Scanner(System.in);
        
	   
     
        int condition =  1;
         do
          {
	   
             System.out.println("Choose an operator: +, -, *, or /");
         char s = n.next().charAt(0);  
	   
         System.out.println("enter the first number "); 
	   
         Double number1=n.nextDouble();
	  
         
         System.out.println("enter the second number");
	   
         Double number2 =n.nextDouble();
        
         
         switch (s) {

         // performs addition between numbers
         case '+':
           result = number1 + number2;
           System.out.println(number1 + " + " + number2 + " = " + result);
           break;

         // performs subtraction between numbers
         case '-':
           result = number1 - number2;
           System.out.println(number1 + " - " + number2 + " = " + result);
           break;

         // performs multiplication between numbers
         case '*':
           result = number1 * number2;
           System.out.println(number1 + " * " + number2 + " = " + result);
           break;

         // performs division between numbers
         case '/':
           result = number1 / number2;
           System.out.println(number1 + " / " + number2 + " = " + result);
           break;

         default:
           System.out.println("Invalid operator!");
           break;
           
       }
         System.out.println("do you want to contine another operation enter 1 to continue");
         condition=n.nextInt();
         
         }
         while(condition==1) ;
         
         	System.out.println("off");
       n.close();

    }
}