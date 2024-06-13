




/**
 * This is BankCard class which stores the details of bankcard.
 *
 * @author (Nikisha parajuli)
 * ID; ***NP05CP4A220078***
 */
public class BankCard
{
    //Declaaring five instance variables having private access modifier.
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;
    // opening constructor method of BankCard with four parameters.
 public BankCard(int cardId,String issuerBank,String bankAccount, int balanceAmount)
 {
   this.cardId=cardId; //updating cardId with its local variable.
   this.issuerBank= issuerBank; //updating issuerBank with its local variable.
   this.bankAccount= bankAccount; //updating bankAccount with its local variable.
   this.balanceAmount= balanceAmount; //updating balanceAmount with its local variable.
   clientName="";//Initializing client name to an empty string.
 }
 //closing constructor method of class BankCard.
 // creating getter method of all private instance attributes.
 //Getter method of cardId
 public int getCardId()
 {
    return cardId; // It returns values to its attribute cardId.
 }
 //Getter method of issuerBank
 public String getIssuerBank()
 {
     return issuerBank; // It returns values to its attribute issuerBank.
 }
 //Getter method of bankAccount
 public String getBankAccount()
 {
     return bankAccount; // It returns values to its attribute bankAccount.
 }
 //Getter method of balanceAmount
 public int getBalanceAmount()
 {
     return balanceAmount; // It returns values to its attribute balanceAmount.
 }
 //Getter method of clientName
 public String getClientName()
 {
     return clientName; // It returns values to its attribute clientName.
 }
 //Making setter method of clientName attribute.
 public void setClientName(String clientName)
 {
     this.clientName= clientName;//updating instance variable with local variable.
 }
 //Making mutator method of BalanceAmount attribute.
 public void setBalanceAmount(int balanceAmount)
 {
     this.balanceAmount= balanceAmount; //updating instance variable balanceAmount with its local variable.
 }
 //This method dicplays all values of attributes if user has input client name.
 public void display()
 {
     if(clientName.equals("")){ //It checks if string is equal.
          System.out.println("Invalid!! you first need to enter values in client name");
     }
     else{
         System.out.println("Client name is\t"+ clientName);
         System.out.println("Balance amount is\t"+ balanceAmount);
         System.out.println("Card id is\t"+ cardId);
         System.out.println("Issuer bank is\t"+ issuerBank);
         System.out.println("Bank Account is\t"+ bankAccount);
     }
     //End of if else loop.
 }
}
//End of BankCard class.