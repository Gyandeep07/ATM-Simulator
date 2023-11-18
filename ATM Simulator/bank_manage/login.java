package bank_manage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener{
    JButton login,clear,signup;
    JTextField carTextField;
    JPasswordField pinTextField;

    login(){
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("bank_manage/img.jpeg"));
        Image i2=i1.getImage().getScaledInstance(100,100 , Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        JLabel text=new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osword",Font.BOLD,30));
       text. setBounds(270, 40, 400, 40);
        add(text);
        JLabel cardno=new JLabel("CARD NO.");
        cardno.setFont(new Font("Osword",Font.BOLD,25));
       cardno. setBounds(120, 150, 150, 40);
        add(cardno);
         carTextField=new JTextField();
        carTextField.setBounds(300,150,230,30);
        carTextField.setFont(new Font("Arial",Font.BOLD,15));
        add(carTextField);
         JLabel pin=new JLabel("PIN:");
         pin.setFont(new Font("Raleway",Font.BOLD,25));
         pin. setBounds(120, 220, 230, 30);
        add(pin);
         pinTextField=new JPasswordField ();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,15));

        add(pinTextField);
         login=new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
         clear=new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);

        add(clear);
        signup=new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);

        add(signup);
        getContentPane().setBackground(Color.WHITE);

        setSize(800,450);
        setVisible(true);
        setLocation(350,150);

    }
    //private void cleardActionListener(login login) {
    //}
    public void actionperformed(ActionEvent ae) {

        
    }
    public static void main(String[] args) {
        new login();
        
    }
    //@Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==clear){
carTextField.setText("");
pinTextField.setText("");


        }
        else if(ae.getSource()==login){
connection c=new connection();
String cardnumber=carTextField.getText();
String pinnumber=pinTextField.getText();
String query="select * from login where cardnumber='"+cardnumber+"' and pin = '"+pinnumber+"'";
try {
    ResultSet rs= c.s.executeQuery(query);
    if(rs.next()){
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
    }else{
        JOptionPane.showMessageDialog(null,"Incorrect cord number or pin");
    }
} catch (Exception e) {
    System.out.println(e);
    // TODO: handle exception
}

        }
        else if(ae.getSource()==signup){
          setVisible(false);
         new Signup().setVisible(true);
        }
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
