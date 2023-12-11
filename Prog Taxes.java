try   (Scanner input = new Scanner(System.in))
  {  
   
    // Computing taxes by using If  
    // By Youssef Essa



    System.out.println("1. For Single");
    System.out.println("2. For Married filimg jointly");
    System.out.println("3. For Married Filing Separately");
    System.out.println("4. For Head of Household");
 
    System.out.println("Enter your chocie:");
    double choice = input.nextDouble();
 
    //   The Taxes for Married Single
 
    if (choice ==1)
    {
        
     System.out.println("Enter your income");
     double income = input.nextDouble();
      if (income>0 && income<8350 )
     { 
       double operation = (income * 0.10);
       System.out.println("The tax is = "+operation);
     }
     else if (income >8351 && income<33950 )
     { 
       double operation2 = (income * 0.15);
       System.out.println("The tax is = "+operation2);
     }
      else if (income >33951 && income<82250)
     { 
       double operation3 = (income * 0.25);
       System.out.println("The tax is = "+operation3);
     }
     else if ( income >82251 && income < 171550)
      {
       double operation3 = (income * 0.28);
       System.out.println("The tax is = "+operation3);
 
      }
      else if (income >171551 && income <372950)
      {
       double opertaion4= (income * 0.33);
       System.out.println("The tax is = "+opertaion4);
      }
      else if (income >= 372951)
      {
       double operation5 = (income * 0.35);
       System.out.println("The tax is = "+ operation5);
      }
    }  
 
    
   //  The Taxes for Married Filing Jointly
 
  if (choice ==2)
   { 
 
      System.out.println("Enter the income :");
      double income1 = input.nextDouble();
      
      if (income1>0 && income1 <16700)
      {
       double operation6 = (income1 * 0.10);
       System.out.println("The total taxe  is = "+operation6);
      }
 
      else if (income1 > 16701 && income1 <67900)
      {
       double operation7 = (income1 * 0.15);
       System.out.println("The total tax is = "+operation7);
      }
 
      else if  (income1 > 67901 &&  income1 <137050)
      {
       double operation8 = (income1 * 0.25);
       System.out.println("The total tax is  "+ operation8);
      }
 
      else if (income1 > 137051 && income1 < 208850 )
      {
      double operation9 = (income1 * 0.28);
      System.out.println("The total tax is = "+operation9);
      }
 
      else if (income1 > 208851  && income1 < 372950)
      {
     double operation10 = (income1 * 0.33);
     System.out.println("The total  tax is = "+operation10);
      }
 
      else if (income1 >= 372951)
      {
       double operation11 = (income1 * 0.35);
       System.out.println("The total tax is = "+operation11);
      }
 
 
       //The Total Taxes for Married Filing Separately
 
       }
 
       if (choice == 3)
       {
         System.out.println("Enter the income ");
         double income3 = input.nextDouble();
 
         if (income3 > 0 && income3 < 8350)
         {
           double operation13 = (income3 * 0.10);
           System.out.println("The total tax is = "+operation13);
         }
         else if (income3 > 8351 && income3 < 33950)
         {
          double operation14 = (income3 * 0.15);
          System.out.println("The total tax is = "+operation14);
         }
         else if (income3 >33951 && income3 < 68525 );
         {
          double operation15 = (income3 * 0*25);
          System.out.println("The total tax is = "+operation15);
         }
         
         {
          double operation16 = ( income3 * 0.28);
          System.out.println("The total tax is = "+operation16);
         }
        
         {
          double operation17 = (income3 * 0.33);
          System.out.println("The total tax is = "+operation17);
         }
         
         {
           double operation18 = (income3 * 0.35);
           System.out.println("The total tax is = "+operation18);
         }
          
        }  
        
        
        
        //The Total Taxes for Head of Household
 
       
  
        if (choice == 4)
       { 
          System.out.println("Enter the income");
          double income4 = input.nextDouble();
 
          if (income4 > 0 && income4 < 11950 )
          {
           double operation19 =(income4 * 0.10);
           System.out.println("The total tax is = "+operation19);
          } 
           else if ( income4 > 11951 && income4 < 45500);
           {
            double operation20 = (income4 * 0.15);
           System.out.println("The total tax is = "+operation20);
           }
         
           {
            double operation21 = (income4 * 0.25 );
            System.out.println(" The total tax is = "+ operation21);
           }
        
           {
            double operation22 = (income4 * 0.28);
            System.out.println("The total tax is = "+ operation22);
           }
    
           {
            double operation23 = (income4 * 0.33);
            System.out.println("The total tax is = "+operation23);
           }
 
            {
            double operation24 = (income4 * 0.35);
            System.out.println("The total tax is = "+operation24); 
            }
  
    }         
   }
  }
}