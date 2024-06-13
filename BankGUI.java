

import javax.swing.*;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;

/**
 * Write a description of class BankGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankGUI {
    private JFrame f1, f2, f3, f4, f5;
    private JPanel p1, p2, p3, p4, p5, p6;
    private JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, tcardId,
            tclientName, tissuerBank, tbankAccount, tbalanceAmount;
    private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;
    private JComboBox<String> Year, Month, Day, Cyear, Cmonth, Cday;
    private final static int invalid = -1;
    private String[] item1 = { "Year", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999",
            "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012",
            "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", };
    private String[] item2 = { "Month", "January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December", };
    private String[] item3 = { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
    ArrayList<BankCard> list = new ArrayList<BankCard>();

    public BankGUI() {
        // frame for Bank card
        f1 = new JFrame(); // Creating object of JFrame
        f1.setLayout(null); // It chooses no layout
        f1.setSize(900, 750); // It gives width and height
        f1.setResizable(false); // It doesn't allow to maximize
        f1.setLocationRelativeTo(null); // It moves frame towards the center
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // It actually closes frame when we click on x

        // panel of Bank card
        p1 = new JPanel(); // creating object of JPanel
        p1.setSize(700, 550); // It gives width and height
        p1.setLocation(80, 60); // It sets distance from x-axis and y-axis
        p1.setBackground(new Color(204, 204, 204)); // It gives background color
        p1.setLayout(null); // it chooses no layout

        Font titleFont = new Font(Font.SERIF, Font.ITALIC, 18); // creating object of Font
        Border lineBorder = BorderFactory.createLineBorder(Color.black); // creating object of BorderFactory and calling
                                                                         // createLineBorder method
        Border titledBorder = BorderFactory.createTitledBorder(lineBorder, "BANK CARD",
                TitledBorder.CENTER, TitledBorder.TOP, titleFont, Color.black); // creating object of TitledBorder and
                                                                                // calling createLineBorder method
        p1.setBorder(titledBorder); // adding object titledBorder to the p1 panel
        f1.add(p1); // adding p1 to the frame

        // Jlabel,text field for cardId in bank card
        l1 = new JLabel("Card id"); // creating object of JLabel
        l1.setFont(new Font("Arial", Font.BOLD, 18));
        l1.setBounds(20, 50, 100, 30); // it indicates x-axis, y-axis, width and height
        p1.add(l1); // it adds l1 to panel p1
        tcardId = new JTextField(); // creating objet of JTextField
        tcardId.setBounds(170, 50, 150, 40);
        p1.add(tcardId);

        // Jlabel,text field for client name in bank card
        l2 = new JLabel("Client name"); // creating object of JLabel
        l2.setFont(new Font("Arial", Font.BOLD, 18));
        l2.setBounds(390, 50, 170, 30); // it indicates x-axis, y-axis, width and height
        p1.add(l2);
        tclientName = new JTextField();
        tclientName.setBounds(520, 50, 150, 40);
        p1.add(tclientName);

        // Jlabel,text field for issuer bank in bank card
        l3 = new JLabel("Issuer bank"); // creating object of JLabel
        l3.setFont(new Font("Arial", Font.BOLD, 18));
        l3.setBounds(20, 160, 170, 30); // it indicates x-axis, y-axis, width and height
        p1.add(l3);
        tissuerBank = new JTextField();
        tissuerBank.setBounds(170, 160, 150, 40); // it indicates x-axis, y-axis, width and height
        p1.add(tissuerBank);

        // Jlabel,text field for bank account in bank card
        l4 = new JLabel("Bank account"); // creating object of JLabel
        l4.setFont(new Font("Arial", Font.BOLD, 18));
        l4.setBounds(390, 160, 170, 30); // it indicates x-axis, y-axis, width and height
        p1.add(l4);
        tbankAccount = new JTextField();
        tbankAccount.setBounds(520, 160, 150, 40); // it indicates x-axis, y-axis, width and height
        p1.add(tbankAccount);

        // Jlabel,text field for balance amount in bank card
        l5 = new JLabel("BalanceAmount"); // creating object of JLabel
        l5.setFont(new Font("Arial", Font.BOLD, 18));
        l5.setBounds(20, 270, 170, 30); // it indicates x-axis, y-axis, width and height
        p1.add(l5);
        tbalanceAmount = new JTextField();
        tbalanceAmount.setBounds(170, 270, 150, 40);// it indicates x-axis, y-axis, width and height
        p1.add(tbalanceAmount);

        // button field for going to credit frame from bank card
        b1 = new JButton("GoToCredit");
        b1.setBounds(70, 390, 140, 30);// it indicates x-axis, y-axis, width and height
        p1.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                f1.dispose(); // It closes frame f1
                f3.setVisible(true); // It opens frame f3
                callCredit(); // It calls this method

            }
        });

        // button field for clearing data in bank card
        b2 = new JButton("Clear");
        b2.setBounds(470, 390, 90, 30);// it indicates x-axis, y-axis, width and height
        p1.add(b2);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent cle) {
                clear();

            }
        });

        // button field for going to differnt frame i.e. debit card
        b3 = new JButton("GoToDebitCard");
        b3.setBounds(240, 490, 140, 30);// it indicates x-axis, y-axis, width and height
        b3.setFocusPainted(false);
        p1.add(b3);
        b3.addActionListener(new ActionListener() { //creating anonymous class
            public void actionPerformed(ActionEvent debit) {
                f1.dispose(); //it closes f1 frame
                f2.setVisible(true);
                t1.setText(tcardId.getText());
                t1.setEditable(false); //It doesn't allow to edit value in textfield
                t2.setText(tclientName.getText());
                t2.setEditable(false);
                t3.setText(tissuerBank.getText());
                t3.setEditable(false);
                t4.setText(tbankAccount.getText());
                t4.setEditable(false);
                t5.setText(tbalanceAmount.getText());
                t5.setEditable(false);
            }
        });

        // frame for Debit card
        f2 = new JFrame();
        f2.setLayout(null);
        f2.setSize(900, 750);
        f2.setResizable(false);
        f2.setLocationRelativeTo(null);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // panel of Debit card
        p2 = new JPanel();
        p2.setSize(700, 550);
        p2.setLocation(80, 60);
        p2.setBackground(new Color(204, 204, 204));
        p2.setLayout(null);

        Border titledBorder1 = BorderFactory.createTitledBorder(lineBorder, "DEBIT CARD",
                TitledBorder.CENTER, TitledBorder.TOP, titleFont, Color.black);
        p2.setBorder(titledBorder1);
        f2.add(p2);

        // Jlabel,text field for cardId in debit card
        l1 = new JLabel("Card id"); // creating object of JLabel
        l1.setFont(new Font("Arial", Font.BOLD, 18));
        l1.setBounds(20, 50, 100, 30);
        p2.add(l1);
        t1 = new JTextField();
        t1.setBounds(170, 50, 150, 40);
        p2.add(t1);

        // Jlabel,text field for client name in debit card
        l2 = new JLabel("Client name"); // creating object of JLabel
        l2.setFont(new Font("Arial", Font.BOLD, 18));
        l2.setBounds(390, 50, 170, 30); // it indicates x-axis, y-axis, width and height
        p2.add(l2);
        t2 = new JTextField();
        t2.setBounds(520, 50, 150, 40);
        p2.add(t2);

        // Jlabel,text field for issuer bank in debit card
        l3 = new JLabel("Issuer bank"); // creating object of JLabel
        l3.setFont(new Font("Arial", Font.BOLD, 18));
        l3.setBounds(20, 160, 170, 30); // it indicates x-axis, y-axis, width and height
        p2.add(l3);
        t3 = new JTextField();
        t3.setBounds(170, 160, 150, 40);
        p2.add(t3);

        // Jlabel,text field for bank account in debit card
        l4 = new JLabel("Bank account"); // creating object of JLabel
        l4.setFont(new Font("Arial", Font.BOLD, 18));
        l4.setBounds(390, 160, 170, 30); // it indicates x-axis, y-axis, width and height
        p2.add(l4);
        t4 = new JTextField();
        t4.setBounds(520, 160, 150, 40);
        p2.add(t4);

        // Jlabel,text field for balance amount in debit card
        l5 = new JLabel("BalanceAmount"); // creating object of JLabel
        l5.setFont(new Font("Arial", Font.BOLD, 18));
        l5.setBounds(20, 270, 170, 30); // it indicates x-axis, y-axis, width and height
        p2.add(l5);
        t5 = new JTextField();
        t5.setBounds(170, 270, 150, 40);
        p2.add(t5);

        // Jlabel,text field for PinNumber in debit card
        l6 = new JLabel("PinNumber"); // creating object of JLabel
        l6.setFont(new Font("Arial", Font.BOLD, 18));
        l6.setBounds(390, 270, 100, 30);
        p2.add(l6);
        t6 = new JTextField();
        t6.setBounds(520, 270, 150, 40);
        p2.add(t6);

        // frame for withdraw frame in debit card
        f4 = new JFrame();
        f4.setLayout(null);
        f4.setSize(580, 480);
        f4.setResizable(false);
        f4.setLocationRelativeTo(null);

        // panel of withdraw frame in debit card
        p4 = new JPanel();
        p4.setSize(470, 350);
        p4.setLocation(40, 35);
        p4.setBackground(new Color(204, 204, 204));
        p4.setLayout(null);
        p4.setBorder(BorderFactory.createTitledBorder("Withdrawal"));
        f4.add(p4);

        // JLabel, textfield for pinNumber in withdraw frame
        l13 = new JLabel("PinNumber"); // creating object of JLabel
        l13.setBounds(20, 20, 200, 30);
        p4.add(l13);
        t12 = new JTextField();
        t12.setBounds(140, 20, 100, 30);
        p4.add(t12);

        // Jlabel,text field for WithdrawalAmount in withdraw frame
        l7 = new JLabel("WithdrawalAmount"); // creating object of JLabel
        l7.setBounds(20, 80, 200, 30);
        p4.add(l7);
        t7 = new JTextField();
        t7.setBounds(140, 80, 100, 30);
        p4.add(t7);

        // JLabel,textfield for cardid in withdraw frame
        l14 = new JLabel("Card id"); // creating object of JLabel
        l14.setBounds(20, 140, 100, 30);
        p4.add(l14);
        t13 = new JTextField();
        t13.setBounds(140, 140, 150, 40);
        p4.add(t13);

        // JLabel for date of withdrawal in withdraw frame
        l12 = new JLabel("DateOfWithdrawal"); // creating object of JLabel
        l12.setBounds(20, 210, 230, 50);
        p4.add(l12);

        // JCombobox for year in withdraw frame in withdraw frame
        Year = new JComboBox<>(item1);
        Year.setBounds(140, 220, 70, 30);
        p4.add(Year);

        // JCombobox for month in withdraw frame
        Month = new JComboBox<>(item2);
        Month.setBounds(240, 220, 80, 30);
        p4.add(Month);

        // JCombobox for day in withdraw frame
        Day = new JComboBox<>(item3);
        Day.setBounds(390, 220, 80, 30);
        p4.add(Day);

        // JButton for withdraw in withdraw frame
        b10 = new JButton("Withdraw");
        b10.setBounds(100, 290, 90, 30);
        p4.add(b10);
        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent draw) {
                checkWithdrawDetails();
            }
        });

        // JButton for Adding a debit card in debit card frame
        b4 = new JButton("AddDebitcard");
        b4.setBounds(380, 650, 120, 30);
        f2.add(b4);
        b4.addActionListener(new ActionListener() { //creating anonymous class
            public void actionPerformed(ActionEvent add) {
                checkDetailsDebit();
            }
        });

        // JButton for withdraw from debit card
        b5 = new JButton("Withdrawal");
        b5.setBounds(300, 390, 120, 30);
        p2.add(b5);
        b5.addActionListener(new ActionListener() { //creating anonymous class
            public void actionPerformed(ActionEvent draw) {
                f4.setVisible(true); // it opens frame f4
                t12.setText(t6.getText());
                t12.setEditable(false);
            }
        });

        // JButton for Display in debit card
        b6 = new JButton("Display");
        b6.setBounds(70, 500, 90, 30);
        p2.add(b6);
        b6.addActionListener(new ActionListener() { //creating anonymous class
            public void actionPerformed(ActionEvent display) {
                Display();
            }
        });

        // JButton for clear in debit card
        b7 = new JButton("Clear");
        b7.setBounds(540, 500, 90, 30);
        p2.add(b7);
        b7.addActionListener(new ActionListener() { //creating anonymous class
            public void actionPerformed(ActionEvent clr) {
                t6.setText(""); // it assign t6 text field to empty
            }
        });

        // JButton for back to bank card from debit card frame
        b8 = new JButton("Back");
        b8.setBounds(40, 650, 90, 30);
        f2.add(b8);
        b8.addActionListener(new ActionListener() { //creating anonymous class
            public void actionPerformed(ActionEvent back) {
                f1.setVisible(true); // it opens frame f1
                f2.dispose(); // it close frame f2
            }
        });

        // JButton for going to credit card
        b9 = new JButton("GoToCredit");
        b9.setBounds(720, 650, 110, 30);
        f2.add(b9);
        b9.addActionListener(new ActionListener() { //creating anonymous class
            public void actionPerformed(ActionEvent back) {

                f3.setVisible(true);
                f2.dispose();
                callCredit();
            }
        });

        // frame for Credit card
        f3 = new JFrame();
        f3.setLayout(null);
        f3.setSize(900, 750);
        f3.setResizable(false);
        f3.setLocationRelativeTo(null);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // panel of Credit card
        p3 = new JPanel();
        p3.setSize(700, 550);
        p3.setLocation(80, 60);
        p3.setBackground(new Color(204, 204, 204));
        p3.setLayout(null);

        Border titledBorder2 = BorderFactory.createTitledBorder(lineBorder, "CREDIT CARD",
                TitledBorder.CENTER, TitledBorder.TOP, titleFont, Color.black);
        p3.setBorder(titledBorder2);
        f3.add(p3);

        // Jlabel,text field for cardId
        l1 = new JLabel("Card id"); // creating object of JLabel
        l1.setFont(new Font("Arial", Font.BOLD, 18));
        l1.setBounds(20, 50, 100, 30);
        p3.add(l1);
        t8 = new JTextField();
        t8.setBounds(170, 50, 150, 40);
        p3.add(t8);

        // Jlabel,text field for client name
        l2 = new JLabel("Client name"); // creating object of JLabel
        l2.setFont(new Font("Arial", Font.BOLD, 18));
        l2.setBounds(390, 50, 170, 30); // it indicates x-axis, y-axis, width and height
        p3.add(l2);
        t9 = new JTextField();
        t9.setBounds(520, 50, 150, 40);
        p3.add(t9);

        // Jlabel,text field for issuer bank
        l3 = new JLabel("Issuer bank"); // creating object of JLabel
        l3.setFont(new Font("Arial", Font.BOLD, 18));
        l3.setBounds(20, 160, 170, 30); // it indicates x-axis, y-axis, width and height
        p3.add(l3);
        t10 = new JTextField();
        t10.setBounds(170, 160, 150, 40);
        p3.add(t10);

        // Jlabel,text field for bank account
        l4 = new JLabel("Bank account"); // creating object of JLabel
        l4.setFont(new Font("Arial", Font.BOLD, 18));
        l4.setBounds(390, 160, 170, 30); // it indicates x-axis, y-axis, width and height
        p3.add(l4);
        t11 = new JTextField();
        t11.setBounds(520, 160, 150, 40);
        p3.add(t11);

        // Jlabel,text field for balance amount
        l5 = new JLabel("BalanceAmount"); // creating object of JLabel
        l5.setFont(new Font("Arial", Font.BOLD, 18));
        l5.setBounds(20, 270, 170, 30); // it indicates x-axis, y-axis, width and height
        p3.add(l5);
        t14 = new JTextField();
        t14.setBounds(170, 270, 150, 40);
        p3.add(t14);

        // Jlabel,text field for CVC number
        l8 = new JLabel("CVC Number");
        l8.setFont(new Font("Arial", Font.BOLD, 18));
        l8.setBounds(390, 270, 120, 30);
        p3.add(l8);
        t15 = new JTextField();
        t15.setBounds(520, 270, 150, 40);
        p3.add(t15);

        // Jlabel,text field for Interest rate
        l9 = new JLabel("InterestRate"); // creating object of JLabel
        l9.setFont(new Font("Arial", Font.BOLD, 18));
        l9.setBounds(20, 360, 120, 30);
        p3.add(l9);
        t16 = new JTextField();
        t16.setBounds(170, 360, 150, 40);
        p3.add(t16);

        // Jlabel,text field for issuer bank
        l10 = new JLabel("ExpirationDate"); // creating object of JLabel
        l10.setFont(new Font("Arial", Font.BOLD, 18));
        l10.setBounds(20, 450, 170, 30);
        p3.add(l10);

        // JCombobox for year
        Cyear = new JComboBox<>(item1);
        Cyear.setBounds(200, 450, 70, 30);
        p3.add(Cyear);

        // JCombobox for month
        Cmonth = new JComboBox<>(item2);
        Cmonth.setBounds(310, 450, 80, 30);
        p3.add(Cmonth);

        // JCombobox for day
        Cday = new JComboBox<>(item3);
        Cday.setBounds(420, 450, 80, 30);
        p3.add(Cday);

        // JButton for adding credit card
        b11 = new JButton("AddCreditCard");
        b11.setBounds(440, 360, 130, 40);
        p3.add(b11);
        b11.addActionListener(new ActionListener() { //creating anonymous class
            public void actionPerformed(ActionEvent back) {
                addCreditDetails();
            }
        });

        // JButton for Going back to debit
        b12 = new JButton("BackBank");
        b12.setBounds(40, 650, 120, 30);
        f3.add(b12);
        b12.addActionListener(new ActionListener() { //creating anonymous class
            public void actionPerformed(ActionEvent back) {

                f1.setVisible(true);
                f3.dispose();
            }
        });

        // JButton for display of credit card
        b13 = new JButton("DisplayCredit");
        b13.setBounds(440, 500, 120, 40);
        p3.add(b13);
        b13.addActionListener(new ActionListener() { //creating anonymous class
            public void actionPerformed(ActionEvent back) {
                Display();
            }
        });

        // JButton for Setting credit limit
        b14 = new JButton("SetCredit");
        b14.setBounds(280, 650, 120, 40);
        f3.add(b14);
        b14.addActionListener(new ActionListener() { //creating anonymous class
            public void actionPerformed(ActionEvent back) {
                f5.setVisible(true);
            }
        });

        // JButton for clear button in credit card
        b15 = new JButton("Clear");
        b15.setBounds(720, 650, 110, 30);
        f3.add(b15);
        b15.addActionListener(new ActionListener() { //creating anonymous class
            public void actionPerformed(ActionEvent clr) {
                t15.setText("");
                t16.setText("");
                Cyear.setSelectedIndex(0);
                Cmonth.setSelectedIndex(0);
                Cday.setSelectedIndex(0);
            }
        });

        // JButton for cancel credit card
        b16 = new JButton("CancelCredit");
        b16.setBounds(480, 650, 120, 40);
        f3.add(b16);
        b16.addActionListener(new ActionListener() { //creating anonymous class
            public void actionPerformed(ActionEvent back) {
                f5.setVisible(true);
            }
        });

        // frame for cancel credit card
        f5 = new JFrame();
        f5.setLayout(null);
        f5.setSize(500, 600);
        f5.setResizable(false);
        f5.setLocationRelativeTo(null);

        // panel of cancel credit card
        p5 = new JPanel();
        p5.setSize(450, 200);
        p5.setLocation(10, 15);
        p5.setBackground(new Color(204, 204, 204));
        p5.setLayout(null);
        p5.setBorder(BorderFactory.createTitledBorder("CancelCreditCard"));
        f5.add(p5);

        // panel for setting credit limit
        p6 = new JPanel();
        p6.setSize(450, 300);
        p6.setLocation(10, 235);
        p6.setBackground(new Color(204, 204, 204));
        p6.setLayout(null);
        p6.setBorder(BorderFactory.createTitledBorder("SetCreditLimit"));
        f5.add(p6);

        // JLabel,textfield for cardid
        l15 = new JLabel("Card id"); // creating object of JLabel
        l15.setFont(new Font("Arial", Font.BOLD, 18));
        l15.setBounds(20, 40, 100, 30);
        p5.add(l15);
        t17 = new JTextField();
        t17.setBounds(150, 40, 150, 40);
        p5.add(t17);

        // JButton for cancel credit in f5 frame
        b17 = new JButton("CancelCredit");
        b17.setBounds(100, 120, 120, 40);
        p5.add(b17);
        b17.addActionListener(new ActionListener() { //creating anonymous class
            public void actionPerformed(ActionEvent back) {
                cancelCredit();
            }
        });

        // Jlabel,text field for creditLimit
        l16 = new JLabel("CreditLimit"); // creating object of JLabel
        l16.setFont(new Font("Arial", Font.BOLD, 18));
        l16.setBounds(20, 40, 100, 30);
        p6.add(l16);
        t18 = new JTextField();
        t18.setBounds(150, 40, 150, 40);
        p6.add(t18);

        b18 = new JButton("SetCredit");
        b18.setBounds(100, 210, 120, 40);
        p6.add(b18);
        b18.addActionListener(new ActionListener() { //creating anonymous class
            public void actionPerformed(ActionEvent back) {
                setCreditCardLimit();
            }
        });

        // Jlabel,text field for GracePeriod
        l11 = new JLabel("GracePeriod"); // creating object of JLabel
        l11.setFont(new Font("Arial", Font.BOLD, 18));
        l11.setBounds(20, 120, 100, 30);
        p6.add(l11);
        t19 = new JTextField();
        t19.setBounds(150, 100, 150, 40);
        p6.add(t19);

        f1.setVisible(true);
    }
    //MAin method of BankGUI CLASS
    public static void main(String[] args) {
        BankGUI obj = new BankGUI();
    }

    //Getter method of JTextField tcardId
    public int getCardId() {
        if (tcardId.getText().trim().isEmpty()) {
            return 0;
        } else {
            int id = invalid;
            try {
                id = Integer.parseInt(tcardId.getText().trim()); //Converting string into Integer through wrapper class
                if (id <= 0) {
                    id = invalid;
                }
            } catch (Exception cid) {
                System.out.println("Invalid cardId. \n CardId cannot be converted to string!!");
            }
            return id;
        }
    }

    //Getter method of JTextField tissuerBank
    public String getIssuerBank() {
        return tissuerBank.getText().trim();
    }
    //Getter method of JTextField tclientName
    public String getClientName() {
        return tclientName.getText().trim();
    }
    //Getter method of JTextField tbankAccount
    public String getBankAccount() {
        return tbankAccount.getText().trim();
    }
    //Getter method of JTextField tbalanceAmount
    public Integer getBalanceAmount() {
        if (tbalanceAmount.getText().trim().isEmpty()) {
            return -2;
        } else {
            int amt = invalid;
            try {
                amt = Integer.parseInt(tbalanceAmount.getText().trim());  //Converting string into Integer through wrapper class
                if (amt < 0) {
                    amt = invalid;
                }
            } catch (Exception e) {
                System.out.println("Invalid Balance amount.\n Balance amount cannot be converted to string!!");
            }
            return amt;
        }
    }
    //Getter method of JComboBox Year
    public String getYear() {
        return Year.getSelectedItem().toString();
    }
    //Getter method of JComboBox Month
    public String getMonth() {
        return Month.getSelectedItem().toString();
    }
    //Getter method of JComboBox Day
    public String getDay() {
        return Day.getSelectedItem().toString();
    }
    //Getter method of JComboBox Cyear
    public String getCreditYear() {
        return Cyear.getSelectedItem().toString();
    }
    //Getter method of JComboBox Cmonth
    public String getCreditMonth() {
        return Cmonth.getSelectedItem().toString();
    }
    //Getter method of JComboBox Cday
    public String getCreditDay() {
        return Cday.getSelectedItem().toString();
    }
    //Getter method of JTextField t6
    public int getPinNumber() {
        if (t6.getText().trim().isEmpty()) {
            return 0;
        } else {
            int pnumber = invalid;
            try {
                pnumber = Integer.parseInt(t6.getText().trim());  //Converting string into Integer through wrapper class
                if (pnumber <= 0) {
                    pnumber = invalid;
                }
            } catch (Exception cid) {
                System.out.println("Invalid pin number. \n Pin number cannot be converted to string!!");
            }
            return pnumber;
        }
    }
     //Getter method of JTextField t7
    public int getWithdrawalAmount() {
        if (t7.getText().trim().isEmpty()) {
            return 0;
        } else {
            int withdrawamt = invalid;
            try {
                withdrawamt = Integer.parseInt(t7.getText().trim());  //Converting string into Integer through wrapper class
                if (withdrawamt <= 0) {
                    withdrawamt = invalid;
                }
            } catch (Exception wamt) {
                System.out.println("Invalid withdraw amount. \n Amount cannot be converted to string!!");
            }
            return withdrawamt;
        }
    }

    public String getDate() {
        String date = "";
        String year = getYear();
        String month = getMonth();
        String day = getDay();
        if (year.equals("Year") || month.equals("Month") || day.equals("Day")) {
            date = "nothing";
        } else {
            date = (year + "-" + month + "-" + day);
        }
        return date;
    }
     //Getter method of JTextField t13
    public int getWithdrawCardId() {
        if (t13.getText().trim().isEmpty()) {
            return 0;
        } else {
            int wid = invalid;
            try {
                wid = Integer.parseInt(t13.getText().trim());  //Converting string into Integer through wrapper class
                if (wid <= 0) {
                    wid = invalid;
                }
            } catch (Exception cid) {
                System.out.println("Invalid withdraw card id. \n CardId cannot be converted to string!!");
            }
            return wid;
        }
    }
     //Getter method of JTextField t15
    public int getCVCNumber() {
        if (t15.getText().trim().isEmpty()) {
            return 0;
        } else {
            int CVCnum = invalid;
            try {
                CVCnum = Integer.parseInt(t15.getText().trim());  //Converting string into Integer through wrapper class
                if (CVCnum <= 0) {
                    CVCnum = invalid;
                }
            } catch (Exception cnum) {
                System.out.println("Invalid CVC number. \n CVC number cannot be converted to string!!");
            }
            return CVCnum;
        }
    }
     //Getter method of JTextField t16
    public double getInterestRate() {
        if (t16.getText().trim().isEmpty()) {
            return 0;
        } else {
            double Irate = invalid;
            try {
                Irate = Double.parseDouble(t16.getText().trim());  //Converting string into Integer through wrapper class
                if (Irate <= 0) {
                    Irate = invalid;
                }
            } catch (Exception rate) {
                System.out.println("Invalid Intereat rate. \n Interest rate cannot be converted to string!!");
            }
            return Irate;
        }
    }
    
    public String getCreditDate() {
        String date = "";
        String year = getCreditYear();
        String month = getCreditMonth();
        String day = getCreditDay();
        if (year.equals("Year") || month.equals("Month") || day.equals("Day")) {
            date = "nothing";
        } else {
            date = (year + "-" + month + "-" + day);
        }
        return date;
    }
     //Getter method of JTextField t17
    public int getCancelCreditCardId() {
        if (t17.getText().trim().isEmpty()) {
            return 0;
        } else {
            int id = invalid;
            try {
                id = Integer.parseInt(t17.getText().trim());  //Converting string into Integer through wrapper class
                if (id <= 0) {
                    id = invalid;
                }
            } catch (Exception cid) {
                System.out.println("Invalid cardId. \n CardId cannot be converted to string!!");
            }
            return id;
        }
    }
     //Getter method of JTextField t18
    public double getCreditLimit() {
        if (t18.getText().trim().isEmpty()) {
            return 0;
        } else {
            double cLimit = invalid;
            try {
                cLimit = Double.parseDouble(t18.getText().trim());  //Converting string into Double through wrapper class
                if (cLimit <= 0) {
                    cLimit = invalid;
                }
            } catch (Exception limit) {
                System.out.println("Invalid Intereat rate. \n Interest rate cannot be converted to string!!");
            }
            return cLimit;
        }
    }
     //Getter method of JTextField t19
    public int getGracePeriod() {
        if (t19.getText().trim().isEmpty()) {
            return 0;
        } else {
            int grace = invalid;
            try {
                grace = Integer.parseInt(t19.getText().trim());  //Converting string into Integer through wrapper class
                if (grace <= 0) {
                    grace = invalid;
                }
            } catch (Exception gPeriod) {
                System.out.println("Invalid cardId. \n CardId cannot be converted to string!!");
            }
            return grace;
        }
    }

    // This is the method for addind a debit card
    public void checkDetailsDebit() {
        int id = getCardId(); // checks cardId field in debit card
        if (id == 0) {
            JOptionPane.showMessageDialog(p2, "Empty field of card id is not accepted!!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else if (id == invalid) {
            JOptionPane.showMessageDialog(p2, "Card id can only be positive !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        String client = getClientName(); // checks lient name field in debit card
        if (client.isEmpty()) {
            JOptionPane.showMessageDialog(p2, "Client name should be entered.", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        String issuer = getIssuerBank(); // checks issuer bank field in debit card
        if (issuer.isEmpty()) {
            JOptionPane.showMessageDialog(p2, "Details of Issuer bank should be entered.", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        String baccount = getBankAccount(); // checks bank account field in debit card
        if (baccount.isEmpty()) {
            JOptionPane.showMessageDialog(p2, "Details of bank account should be entered.", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        int balanceamt = getBalanceAmount(); // checks balance amount field in debit card
        if (balanceamt == -2) {
            JOptionPane.showMessageDialog(p2, "Balance amount should be entered.", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else if (balanceamt == invalid) {
            JOptionPane.showMessageDialog(p2, "Balance amount can only be positive !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        int pinnumber = getPinNumber(); // checks pin number field in debit card
        if (pinnumber == 0) {
            JOptionPane.showMessageDialog(p2, "Empty field of pin number is not accepted!!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else if (pinnumber == invalid) {
            JOptionPane.showMessageDialog(p2, "Pin number can only be positive !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean found = checkcardIdUnique(id); // It checks and add if new card id is unique or not in debit card
        if (found == false) {
            DebitCard d = new DebitCard(balanceamt, id, baccount, issuer, client, pinnumber);
            list.add(d);
            JOptionPane.showMessageDialog(p2, "Your object of Debit card is successfully added", "#Success",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(p2, "Card id must be unique!!", "Acknowledge!", JOptionPane.ERROR_MESSAGE);
        }
    }
    //this method is called while adding credit card object
    public void addCreditDetails() {
        int id = getCardId();
        if (id == 0) {
            JOptionPane.showMessageDialog(p3, "Empty field of card id is not accepted!!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else if (id == invalid) {
            JOptionPane.showMessageDialog(p3, "Card id can only be positive !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        String client = getClientName();
        if (client.isEmpty()) {
            JOptionPane.showMessageDialog(p3, "Client name should be entered.", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        String issuer = getIssuerBank();
        if (issuer.isEmpty()) {
            JOptionPane.showMessageDialog(p3, "Details of Issuer bank should be entered.", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        String baccount = getBankAccount();
        if (baccount.isEmpty()) {
            JOptionPane.showMessageDialog(p3, "Details of bank account should be entered.", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        int balanceamt = getBalanceAmount();
        if (balanceamt == -2) {
            JOptionPane.showMessageDialog(p3, "Balance amount should be entered.", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else if (balanceamt == invalid) {
            JOptionPane.showMessageDialog(p3, "Balance amount can only be positive !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        int cvc = getCVCNumber();
        if (cvc == 0) {
            JOptionPane.showMessageDialog(p3, "Empty field of CVC number is not accepted!!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else if (cvc == invalid) {
            JOptionPane.showMessageDialog(p3, "CVC number can only be positive !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        double rate = getInterestRate();
        if (rate == 0) {
            JOptionPane.showMessageDialog(p3, "Empty field of Interest rate is not accepted!!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else if (rate == invalid) {
            JOptionPane.showMessageDialog(p3, "Interest rate can only be positive !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        String date = getCreditDate();
        if (date.equals("nothing")) {
            JOptionPane.showMessageDialog(p3, "Date field is not complete !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean found = checkCreditcardIdUnique(id);
        if (found == false) {
            CreditCard c = new CreditCard(id, client, issuer, baccount, balanceamt, cvc, rate, date);
            list.add(c);
            JOptionPane.showMessageDialog(p3, "Your object is successfully added", "#Success",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(p3, "Card id must be unique!!", "Acknowledge!", JOptionPane.ERROR_MESSAGE);
        }
    }
    //this method is called when display button is clicked
    public void Display() {
        // it assign value of list in obj variable
        for (BankCard obj : list) { // assigning list details to obj of the type BankCard
            if (obj instanceof DebitCard) { // checks if obj is instance of debit card class
                DebitCard d = (DebitCard) obj; // this is downcasting for debit card class
                d.display(); // this method is in debit card java file
            } else {
                CreditCard c = (CreditCard) obj; // this is downcasting for credit card class
                c.display(); // this method is in credit card java file
            }
        }
    }

    public boolean checkcardIdUnique(int cardId) {
        boolean found = false;
        for (BankCard obj : list) { // assigning list details to obj of the type BankCard
            if (obj instanceof DebitCard) { // checks if obj is instance of debit card class
                DebitCard d = (DebitCard) obj;// this is downcasting for debit card class
                if (d.getCardId() == cardId) {
                    found = true;
                }
            }
        }
        return found;
    }

    public boolean checkCreditcardIdUnique(int id) {
        boolean found = false;
        for (BankCard obj : list) { // assigning list details to obj of the type BankCard
            if (obj instanceof CreditCard) {
                CreditCard c = (CreditCard) obj;
                if (c.getCardId() == id) {
                    found = true;
                }
            }
        }
        return found;
    }
    //this method is clears textfield of bank card frame
    public void clear() {
        tcardId.setText(""); // it assign tcardId text field to empty
        tclientName.setText(""); // it assign tclienyName text field to empty
        tissuerBank.setText(""); // it assign tissuerBank text field to empty
        tbankAccount.setText(""); // it assign tbankAccount text field to empty
        tbalanceAmount.setText(""); // it assign tbaanceAmount text field to empty
    }
    //this method is called while withdrawing from debit card 
    public void checkWithdrawDetails() {
        int pin = getPinNumber();
        if (pin == 0) {
            JOptionPane.showMessageDialog(p4, "Empty field of pin number is not accepted!!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else if (pin == invalid) {
            JOptionPane.showMessageDialog(p4, "pin number can only be positive !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        int withdrawAmount = getWithdrawalAmount();
        if (withdrawAmount == 0) {
            JOptionPane.showMessageDialog(p4, "Empty field of withdraw amount is not accepted!!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else if (withdrawAmount == invalid) {
            JOptionPane.showMessageDialog(p4, "Withdraw amount can only be positive !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        int wid = getWithdrawCardId();
        if (wid == 0) {
            JOptionPane.showMessageDialog(p4, "Empty field of card id during withdraw is not accepted!!",
                    "Acknowledge!", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else if (wid == invalid) {
            JOptionPane.showMessageDialog(p4, "Card id can only be positive !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        String date = getDate();
        if (date.equals("nothing")) {
            JOptionPane.showMessageDialog(p4, "Date field is not complete !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean found = checkcardIdUnique(wid);
        if (found == true) {
            for (BankCard obj : list) {
                if (obj instanceof DebitCard) {
                    DebitCard d = (DebitCard) obj; // Downcasting of debit card class
                    d.withdraw(withdrawAmount, date, pin); // calling withdraw
                }
            }
        } else {
            JOptionPane.showMessageDialog(p2, "Card id doesn't match with existing card id !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
//this method is called while canelling credit card object
    public void cancelCredit() {
        int id = getCancelCreditCardId();
        if (id == 0) {
            JOptionPane.showMessageDialog(p2, "Empty field of card id during cancelling credit is not accepted!!",
                    "Acknowledge!", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else if (id == invalid) {
            JOptionPane.showMessageDialog(p2, "Card id in cancelling credit can only be positive !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean found = checkCreditcardIdUnique(id);
        if (found == true) {
            for (BankCard obj : list) {
                if (obj instanceof CreditCard) {
                    CreditCard c = (CreditCard) obj;
                    c.cancelCreditCard();
                    JOptionPane.showMessageDialog(p2, "Successfully cancelled credit card!!", "#SUCCESS!",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(p2, "Card id doesn't match with existing card id !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
    //This method is used while switching frame from BANK CARD TO CREDIT CARD
    public void callCredit() {
        t8.setText(tcardId.getText());
        t8.setEditable(false);
        t9.setText(tclientName.getText());
        t9.setEditable(false);
        t10.setText(tissuerBank.getText());
        t10.setEditable(false);
        t11.setText(tbankAccount.getText());
        t11.setEditable(false);
        t14.setText(tbalanceAmount.getText());
        t14.setEditable(false);
    }

    //this method is called while setting credit card limit
    public void setCreditCardLimit() {
        int id = getCancelCreditCardId();
        if (id == 0) {
            JOptionPane.showMessageDialog(p2, "Empty field of card id during setting credit limit is not accepted!!",
                    "Acknowledge!", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else if (id == invalid) {
            JOptionPane.showMessageDialog(p2, "Card id in setting credit limit can only be positive !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        double rate = getCreditLimit();
        if (rate == 0) {
            JOptionPane.showMessageDialog(p2, "Empty field of Credit limit is not accepted!!", "Acknowledge!",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        } else if (rate == invalid) {
            JOptionPane.showMessageDialog(p2, "Credit limit can only be positive !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        int grace = getGracePeriod();
        if (grace == 0) {
            JOptionPane.showMessageDialog(p2,
                    "Empty field of Grace period during setting credit limit is not accepted!!", "Acknowledge!",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        } else if (grace == invalid) {
            JOptionPane.showMessageDialog(p2, "Grace period can only be positive !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean found = checkCreditcardIdUnique(id);
        if (found == true) {
            for (BankCard obj : list) {
                if (obj instanceof CreditCard) {
                    CreditCard c = (CreditCard) obj;
                    c.setCreditLlimit(rate, grace);
                }
            }
        } else {
            JOptionPane.showMessageDialog(p2, "Card id doesn't match with existing card id !!", "Acknowledge!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
}
