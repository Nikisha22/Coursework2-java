


/**
 * This is DebitCard class which stores the details of Debitcard.
 *
 * @author (Nikisha parajuli)
 * ID: **NP05CP4A220078** 
 */
public class DebitCard extends BankCard
{
    //Declaaring four instance variables having private access modifier.
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    // opening constructor method of DebitCard with six parameters.
    public DebitCard(int balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber)
    {
        super( cardId, issuerBank, bankAccount, balanceAmount); //calling the constructor method ofsuper class BankCard.
        super.setClientName(clientName); //calling setter method of super class BankCard clientName
        this.pinNumber = pinNumber; //updating pinNumber with its local variable.
        hasWithdrawn= false;
    }
    //closing constructor method of class BankCard.
    //Getter method of pinNumber
    public int getPinNumber()
    {
        return pinNumber; // It returns values to its attribute cardId.
    }
    //Getter method of withdrawalAmount
    public int getWithdrawalAmount()
    {
        return withdrawalAmount; // It returns values to its attribute withdrawalAmount.
    }
    //Getter method of dateOfWithdrawal
    public String getDateOfWithdrawal()
    {
        return dateOfWithdrawal; // It returns values to its attribute dateOfWithdrawal.
    }
    //Modifier method of haswithdrawn 
    public boolean getHasWithdrawn()
    {
        return hasWithdrawn; // It returns values to its attribute hasWithdrawn.
    }
    //setter method of withdrawalAmount
    public void setWithdrawalAmount( int withdrawalAmount)
    {
        this. withdrawalAmount =  withdrawalAmount; //It updates instance variable withdrawalAmount with local variable.
    }
    //This method mainly calculate balance after transaction and updates accordingly.
    public void withdraw(int withdrawalAmount,String dateOfWithdrawal, int pinNumber)
    {
        if(this.pinNumber== pinNumber){ //It checks if entered pinNumber is valid.
            if(withdrawalAmount<super.getBalanceAmount()){ //It checks if entered withdrawalAmount is less than balanceAmount.
               int currentBalance = super.getBalanceAmount() - withdrawalAmount;//Calculating current balance in acount after withdrawing.
               hasWithdrawn = true;
               this.setWithdrawalAmount(withdrawalAmount); //updating new withdrawal amount.
               super.setBalanceAmount(currentBalance);//updating new balance amount.
               this.dateOfWithdrawal = dateOfWithdrawal;
               System.out.println("Withdrawn successful1!!");
               System.out.println("Your current balance is now \t"+ super.getBalanceAmount());
            }
            else{
                System.out.println("you don't have enough money to withdraw");
            }
            //End of second if else loop.
        }
        else{
            System.out.println("please enter the valid pinNumber");
        }
        //End of first if else loop.
    }
    // This methoddisplays all the attributes values is requirement is true.
    public void display()
    {
        super.display(); //It calls the display method ofsuper class BankCard.
        if(hasWithdrawn == true){ //It checks if hasWithdrawn is true.
            System.out.println("Account pin number is\t"+pinNumber);
            System.out.println("Your withdrawal amount is\t" +withdrawalAmount);
            System.out.println("you have withdrawn in\t" +dateOfWithdrawal);
        }
        else{
            System.out.println(" your current balance amount is\t" +super.getBalanceAmount());
            System.out.println(" you have not transact any of the amount yet!!");
        }
        //End of if else loop.
    }
}
//End of DebitCard class.