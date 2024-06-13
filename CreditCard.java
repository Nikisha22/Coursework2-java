


/*Write a description of class CreditCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard
{
    //Declaaring six instance variables having private access modifier.
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    //creating constructor method of Credit card class with eight parameters.
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, int balanceAmount, int cvcNumber, double interestRate, String expirationDate)
    {
        super( cardId,issuerBank,bankAccount,balanceAmount); //calling the constructor method ofsuper class BankCard.
        super.setClientName(clientName); //calling setter method of super class of BankCard clientName
        super.setBalanceAmount(balanceAmount); //calling setter method of super class of BankCard balanceAmount
        this.cvcNumber= cvcNumber; //updating cvcNumber with its local variable.
        this.interestRate= interestRate; //updating interstRate with its local variable.
        this.expirationDate= expirationDate; //updating expirationdate with its local variable.
        isGranted = false; //setting isGranted status to false.
    }
    //Getter method of cvcNumber attribute
    public int getCvcNumber()
    {
        return cvcNumber;
    }
    //Getter method of creditLimit attribute
    public double getCreditLimit()
    {
        return creditLimit;
    }
    //Getter method of interesrRate attribute
    public double getInterestRate()
    {
        return interestRate;
    }
    //Getter method of expirationDate attribute
    public String getExpirationDate()
    {
        return expirationDate;
    }
    //Getter method of gracePeriod attribute
    public int getGracePeriod()
    {
        return gracePeriod;
    }
    //Getter method of isGranted attribute
    public boolean getIsGranted()
    {
        return isGranted;
    }
    //Mutator method of creditLimit attribute with two parameters.
    public void setCreditLlimit(double creditLimit, int gracePeriod)
    {
        if( creditLimit <= 2.5* super.getBalanceAmount()){ //It checks if creditLimit is lessthan or equals to 2.5 times balance amount.
            this.creditLimit= creditLimit; //updating creditLimit
            this.gracePeriod= gracePeriod; //updating gracePeriod.
            isGranted= true; //setting isGranted status to true.
            System.out.println("your credit is granted");
        }
        else{
            System.out.println("You do not nave enough balance to be issued /t");
        }
    }
    //This method returns cvcNumber, creditLimit, gracePeriod and isGranted to its default value.
    public void cancelCreditCard()
    {
        cvcNumber=0;
        creditLimit=0;
        gracePeriod=0;
        isGranted=false;
    }
    public void display()
    {
        System.out.println("Your interest rate is\t"+interestRate);
        System.out.println("Your card expiration date is\t"+expirationDate);
        if(isGranted== true){ //It checks if isGranted attribute is true.
            super .display();//This calls display method from super class BankCard. 
            System.out.println("Your CVC number is\t"+cvcNumber);
            System.out.println("Your credit limit is\t"+creditLimit);
            System.out.println("Your grace period is\t"+gracePeriod );
        }
        else{
            System.out.println("sorry!!, required request doesn't support. Transaction unsuccessful!!");
        }
        //End of if else loop.
    }
}
//End of CreditCard class.