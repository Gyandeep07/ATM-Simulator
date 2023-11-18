package bank_manage;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class signupthree extends JFrame  implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancal;
    String formno;
    signupthree(String formno){
        this.formno=formno;
        setLayout(null);
        JLabel i1=new JLabel("Page 3 : ACCOUNT DETAILS");
        i1.setFont(new Font("Raleway",Font.BOLD,22));
        i1.setBounds(280,40,400,40);
        add(i1);
        JLabel type=new JLabel("Account type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,200,20);
        add(r1);
        r2=new JRadioButton("Current Account");
        r2.setFont(new Font("raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,200,20);
        add(r2);
         r3=new JRadioButton("Fixed Deposit Account");
        r3.setFont(new Font("raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,200,20);
        add(r3); 
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);
        ButtonGroup groupaccount=new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        JLabel card=new JLabel("Card Number:");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,270,200,30);
        add(card);
        JLabel number=new JLabel("XXXX.XXXX.XXXX.4447");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,270,300,30);
        add(number);
        JLabel carddetail=new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(100,300,300,20);
        add(carddetail);
        JLabel pin=new JLabel("Pin:");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,350,200,30);
        add(pin);
        JLabel pnumber=new JLabel("XXXX.");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,350,300,30);
        add(pnumber);
        JLabel pindetail=new JLabel("Your 4 Digit Pin Number");
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(100,370,300,20);
        add(pindetail);
        JLabel services=new JLabel("Services Required:");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,420,200,30);
        add(services);
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
       c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,470,200,30);
        add(c1);
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
       c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,470,200,30);
        add(c2);
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
       c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,520,200,30);
        add(c3);
        c4=new JCheckBox("Email & SMS Alert");
        c4.setBackground(Color.WHITE);
       c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,520,200,30);
        add(c4);
        c5=new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
       c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,570,200,30);
        add(c5);
        c6=new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
       c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,570,200,30);
        add(c6);
        c7=new JCheckBox("I hereby declares that the above entered details are carrect in the best of knowledge");
        c7.setBackground(Color.WHITE);
       c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,610,600,30);
        add(c7);
        submit=new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(350,650,100,30);
        submit.addActionListener(this);
        add(submit);
        cancal=new JButton("Cancal");
        cancal.setBackground(Color.black);
        cancal.setForeground(Color.WHITE);
        cancal.setFont(new Font("Raleway",Font.BOLD,14));
        cancal.setBounds(500,650,100,30);
        cancal.addActionListener(this);
        add(cancal);
        getContentPane().setBackground(Color.WHITE);



        setSize(750,850);
        setLocation(350,0);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
if(ae.getSource()==submit){
    String accounttype=null;
    if(r1.isSelected()){
        accounttype="Saving Account";
    }else if(r2.isSelected()){
        accounttype="Current Account";
    }else if(r3.isSelected()){
        accounttype="Fixed Deposit Account";
    }else if(r4.isSelected()){
        accounttype="Reccuring Deposit Account";
    }
    Random random=new Random();

    String cardnumber=""+Math.abs((random.nextLong()%90000000L))+63947381L;
    String pinnumber=""+Math.abs((random.nextLong()%900L))+00L;
    String facility="";
    if(c1.isSelected()){
        facility=facility+" ATM CARD";
    }else if(c2.isSelected()){
        facility=facility+" Internet Banking";
    }else if(c3.isSelected()){
        facility =facility+" Mobile Banking";

    }else if(c4.isSelected()){
        facility=facility+" Email & SMS Alert";
    }else if(c5.isSelected()){
        facility=facility+" Cheque Book";

    }else if(c6.isSelected()){
        facility=facility+" E-Statement";
    }
    try {
        if(accounttype.equals("")){
            JOptionPane.showMessageDialog(null,"Account Type is Required");

        }else{
            connection c=new connection();
         
         
            String query="insert into signupthree values('" + formno + "','" + accounttype + "','" + cardnumber + "','" + pinnumber + "','" + facility + "')";
            String query1="insert into login values('" + formno + "','" + cardnumber + "','" + pinnumber + "')";
            c.s.executeUpdate(query);
            c.s.executeUpdate(query1);
       JOptionPane.showMessageDialog(null,"Card Number: "+cardnumber+"\n Pin: "+pinnumber);
        }

        
    } catch (Exception e) {
        System.out.println(e);
        // TODO: handle exception
    }
}else if(ae.getSource()==cancal){
setVisible(false);
new login();
    }
    }
    
    public static void main(String[] args) {
        new signupthree("");
        
    }
}
