import java.util.*;

class User_acc
{
    int temp, acc_balance = 74654;
    Scanner sc = new Scanner(System.in);

    void withdraw()
    {
        System.out.print("Enter amount : ");  
         
        temp = sc.nextInt();  
        
        if(acc_balance >= temp)  
        {  
            acc_balance = acc_balance - temp;  
            System.out.println("Withdrawal successful");  
        }  
        else  
        {    
            System.out.println("Insufficient Balance");  
        }  
    }

    void deposit()
    {
        System.out.print("Enter amount : ");  
         
        temp = sc.nextInt();  
                      
        acc_balance = acc_balance + temp;  
        System.out.println("Money deposited successfully"); 
    }

    void check_balance()
    {
        System.out.println("Account Balance : "+ acc_balance);
    }
}

public class ATM
{   
    public static void main(String args[] )  
    { 
        Scanner sc1 = new Scanner(System.in); 
        int choice = 0; 
          
        System.out.println("     WELCOME TO ABC ATM");
        while(choice != 4)
        {
            System.out.println();
            System.out.println("PLEASE ENTER YOUR CHOICE");
            System.out.println();
            System.out.println("ENTER 1 TO WITHDRAW MONEY");  
            System.out.println("ENTER 2 TO DEPOSIT THE CASH");  
            System.out.println("ENTER 3 TO CHECK YOUR BALANCE");  
            System.out.println("ENTER 4 TO EXIT"); 
            System.out.println();
            
            User_acc A = new User_acc();

            choice = sc1.nextInt();  
            switch(choice)  
            {  
                case 1: A.withdraw();
                        break;
                case 2: A.deposit();
                        break;
                case 3: A.check_balance();
                        break;  

                case 4: break;
                
                default : System.out.println("Invalid choice");
                            break;
            }
        }
        
        sc1.close();
         
    } 
}
