


    Scanner input = new Scanner (System.in);


   int x =0;
   double num1;                            // Computing a simple calculator
   double num2;

   do
   {
      System.out.println("Enter the two numbers");
         num1 = input.nextDouble();
         num2 = input.nextDouble();

      System.out.println("Enter your choice to get the operation you want\n");
      
      System.out.println("1. To add the two numbers");
      System.out.println("2. To subtracrt the two numbers");
      System.out.println("3. To multiple the two numbers");
      System.out.println("4. To divide the two numbers");
      System.out.println("5. To get remainder if the two numbers");
      System.out.println("6. To get the square root of FIRST number");
      System.out.println("7. To get the square root of the SECONED number");
      System.out.println("0. To exit the computing system");

     x = input.nextInt();

         switch(x)
         {
            case 1:
               System.out.println("The sum of two numbers is = " + (num1 + num2));
            break;
            
            case 2:
               System.out.println("The subtraction of two numbers is = " + (num1 - num2));
               break;
               
            case 3:
               System.out.println("The multiplication of two nubers is = " + (num1 * num2));
               break;
            
            case 4:
               System.out.println("The division of the two numbers is = " + (num1 / num2));
               break;
            case 5:
               System.out.println("The remainder of the two numbers is = " + (num1 % num2));
               break;
            case 6:
               System.out.println("The square root of the FIRST number is = " + (Math.sqrt(num1)));
               break;
            case 7:
               System.out.println("The square root of the ECONED  number i = " + (Math.sqrt(num2)));
            case 0:
               break;

            default :
               System.out.println("Invalied Input");
               
               
         }                                                                      // Computing a simple calculator
   } 
   while ( x != 0);
   System.out.println("Ok now you exit our system");

///////////////////////////////////////////////////////////////////////////////////////





try (Scanner input = new Scanner(System.in)) 
 
 {

 double num1 ;
 double num2 ;
 int option ;
   
 do 
    {     
    System.out.println("Enter the two numbers ");
    num1 = input.nextDouble();
    num2 = input.nextDouble();

    System.out.println("Enter your option that you need for operation of two numbers\n");
    
    System.out.println("1. To add two numbers");
    System.out.println("2. To subtract two numbers");
    System.out.println("3. To mulipile two numbers");
    System.out.println("4. To divide two numbers");
    System.out.println("5. To get the Square root of first number");
    System.out.println("6. To get the Square root of seconed number");
    System.out.println("0. To exit our System");



     option = input.nextInt();

    switch (option)
                  {
            case 1 :
            System.out.println("The sum of two numbers is = "+ (num1 + num2)+"\n");
                break;
            case 2:
            System.out.println("The subtraction of two numbers is = "+(num1 - num2 )+"\n");
                break;
            case 3 :
            System.out.println("The muliplication of two numbers is ="+(num1 * num2)+"\n");
                break;
            case 4:
            System.out.println("The division of two numbers is = "+(num1 / num2)+"\n");
                break;
            case 5:
            System.out.println("The Square root of first number is = "+(Math.sqrt(num1))+"\n");
            case 6:
             System.out.println("The Square root of seconed number is = "+(Math.sqrt(num2))+"\n");
            case 0:
                 break;

            default :
          System.out.println("Invalied Input");


                    }

     }
       while(option !=0);
 
   System.out.println("Ok you now exit our System.");

 }