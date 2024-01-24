public class Main {
   public static void main(string[] args){
      int operator, n1, n2;
      System.out.printIn ("1 - Add\n 2 - Subtract \n 3 - Multiply \ n 4 - Divide");
      System.out.print("Choose Operator: ")
      Scanner sc = new scanner(System.in);
      operator = sc.nextInt();
      System.out.print("Enter first number : ");
      n1 = sc.nextInt();
      System.out.print("Enter second number : ");
      n2 = sc.nextInt();

      int result = 0;
      switch(operator) {
         case 1: 
            result = n1 + n2;
            break;

         case 2:
            result = n1 - n2;
            break;

         case 3:
            result = n1 * n2;
            break;

         case 4:
            result = n1 / n2;
            break;

            default:
               System.out.printIn("Entered Operator is not valid");
      }

      System.out.printIn("Result is : " + result);
   }
}
  
0







