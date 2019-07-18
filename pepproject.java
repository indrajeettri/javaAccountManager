import java.util.*;

abstract class Acount{
    double interestrate;
    double amount;
    abstract double calculateInterest(double interestrate,double amount);
}
class FdAccount extends Acount{
    
     double calculateInterest(double interestrate,double amount)
     {
         double interest=(interestrate*amount)/100;
         System.out.println("interest gain is"+interest);
         return 0;
     }
    public void getvalue()
    {
            Scanner sc1=new Scanner(System.in);
             System.out.println("Enter fd amount");
             int amount1=sc1.nextInt();
             System.out.println("Enter the number of days");
             int days=sc1.nextInt();
             System.out.println("Enter your age");
             int age=sc1.nextInt();
        if(age>=60 & amount1<10000000)
        {
          if(days>=7 & days<=14)
              calculateInterest(5.00,amount1);
          else if(days>=13 & days<=29)    
              calculateInterest(5.75,amount1);
          else if(days>=30 & days<=43)    
              calculateInterest(6.50,amount1);
          else if(days>=44 & days<=59)    
              calculateInterest(7.50,amount1);
          else if(days>=60& days<=184)    
              calculateInterest(8.00,amount1);
          else if(days>=185& days<=365)    
              calculateInterest(8.50,amount1); 
          else
          {
              System.out.println("Enter valid no of day");
          }
        }
      else if(age<=60 & amount1<10000000)
        {
          if(days>=7 & days<=14)
              calculateInterest(4.50,amount1);
          else if(days>=15 & days<=29)    
              calculateInterest(4.75,amount1);
          else if(days>=30& days<=44)    
              calculateInterest(5.50,amount1);
          else if(days>=45 & days<=59)    
              calculateInterest(7.00,amount1);
          else if(days>=60 & days<=184)    
              calculateInterest(7.50,amount1);
          else if(days>=185 & days<=365)    
              calculateInterest(8.00,amount1);
          else
          {
              System.out.println("Enter valid no of day");
          }
        }
        else if(amount1>=10000000)
        {
          if(days>=7 & days<=14)
              calculateInterest(6.50,amount1);
          else if(days>=15 & days<=29)    
              calculateInterest(6.75,amount1);
          else if(days>=30 & days<=44)    
              calculateInterest(6.50,amount1);
          else if(days>=45 & days<=59)    
              calculateInterest(8.00,amount1);
          else if(days>=60 & days<=184)    
              calculateInterest(8.50,amount1);
          else if(days>=185 & days<=365)    
              calculateInterest(10.00,amount1);
          else
          {
              System.out.println("Enter valid no of day");
          }    
        }
             
        
    }
}


class RDinterest extends Acount{
    double calculateInterest(double interestrate,double amount)
     {
         double interest=(interestrate*amount)/100;
         System.out.println("interest gain is"+interest);
         return 0;
     }
    

    public void getvalue(){
            Scanner sc1=new Scanner(System.in);
             System.out.println("Enter fd amount");
             int amount1=sc1.nextInt();
             System.out.println("Enter the number of Months");
             int months=sc1.nextInt();
             System.out.println("Enter your age");
             int age=sc1.nextInt();
            if(age<=60 & amount1<10000000)
        {
          if(months>=6 & months<9)
              calculateInterest(7.50,amount1);
          else if(months>=9 & months<12)    
              calculateInterest(7.75,amount1);
          else if(months>=12 & months<15)    
              calculateInterest(8.00,amount1);
          else if(months>=15 & months<18)    
              calculateInterest(8.25,amount1);
          else if(months>=18 & months<21)    
              calculateInterest(8.50,amount1);
          else if(months>=21)    
              calculateInterest(8.75,amount1); 
          else
          {
              System.out.println("Enter valid no of months");
          }
            }
       else if(age<=60 & amount1<10000000)
        {
          if(months>=6 & months<9)
              calculateInterest(8.00,amount1);
          else if(months>=9 & months<12)    
              calculateInterest(8.25,amount1);
          else if(months>=12 & months<15)    
              calculateInterest(8.50,amount1);
          else if(months>=15 & months<18)    
              calculateInterest(8.75,amount1);
          else if(months>=18 & months<21)    
              calculateInterest(9.00,amount1);
          else if(months>=21)    
              calculateInterest(9.25,amount1); 
          else
          {
              System.out.println("Enter valid no of months");
          }
            }
       
    }
}
class SBAcount extends Acount{
    double calculateInterest(double interestrate,double amount)
     {
         double interest=(interestrate*amount)/100;
         System.out.println("interest gain is"+interest);
         return 0;
     }
     public void getvalue(){
             Scanner sc1=new Scanner(System.in);
             System.out.println("Enter sd amount");
             int amount1=sc1.nextInt();
             System.out.println("Type of Account");
             System.out.println("1. for normal Account");
             System.out.println("2. for NRI Account");
             int i1=sc1.nextInt();
         switch(i1)
         {
             case 1:
                 calculateInterest(4.00,amount1);
                 break;
             case 2:
                  calculateInterest(6.00,amount1);
                 break;
             default:
                 System.out.println("Enter the valide data");
}
     }
}

class Test1{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Select the option \n");
     System.out.println("1. Interest Calculator –FD \n");
     System.out.println("2. Interest Calculator –RD\n");
     System.out.println("2. Interest Calculator –SB \n");
     System.out.println("Exit \n");
     int a=sc.nextInt();
     switch(a)
     {
         case 1:
             FdAccount fd=new FdAccount();
             fd.getvalue();
             break;
         case 2:
             RDinterest fd1=new RDinterest();
             fd1.getvalue();
             break; 
          case 3:
             SBAcount  fd2=new SBAcount ();
             fd2.getvalue();
             break;      
         default:   
            System.out.println("Consonant"); 
             
     }
    }                               
}