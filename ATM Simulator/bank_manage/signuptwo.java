package bank_manage;

//public class signuptwo {
//package bank_manage;

//import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class signuptwo extends JFrame implements ActionListener {
    JComboBox religion,category,income,accupations,educations;
    JTextField aadhars,pannumbers,citizens;
    JButton next;
    long random;
    String formno;
    JRadioButton yes,no,scitizen,ncitizen;

    signuptwo(String formno) {
        setLayout(null);

        this.formno=formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        Random num = new Random();
        random = Math.abs((num.nextLong() % 900L) + 1000L);
        JLabel additionaldetail = new JLabel("Page 2 : Additional details");
        additionaldetail.setFont(new Font("Raleway", Font.BOLD, 22));
        additionaldetail.setBounds(290, 80, 400, 30);
        add(additionaldetail);

        JLabel religions = new JLabel("Raligion:");
        religions.setFont(new Font("Raleway", Font.BOLD, 20));
        religions.setBounds(100, 140, 100, 30);
        add(religions);
        String valreligion[] = { "HINDU", "MUSLIM", "SIKH", "CHRISTEN", "OTHER" };
        religion = new JComboBox<>(valreligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel categorys = new JLabel("Category:");
        categorys.setFont(new Font("Raleway", Font.BOLD, 20));
        categorys.setBounds(100, 190, 200, 30);
        add(categorys);
        String valcategory[] = { "GENERAL", "OBC", "SC", "ST", "OTHER" };
         category=new JComboBox<>(valcategory);

        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);

        add(category);
        JLabel incomes = new JLabel("Income:");
        incomes.setFont(new Font("Raleway", Font.BOLD, 20));
        incomes.setBounds(100, 240, 200, 30);
        add(incomes);
        String incomecategory[] = { "null", "<50,000", "<1,50,000", "<2,50,000", "<5,00,000","Upto 10,00,000" };
         income=new JComboBox<>(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        JLabel education = new JLabel("Educational");
        education.setFont(new Font("Raleway", Font.BOLD, 20));
        education.setBounds(100, 290, 200, 30);
        add(education);
       
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);
        String eduval[] = { "None graduate", "Graduate", "Post-Graduate", "Doctrate", "Others" };
         educations=new JComboBox<>(eduval);
        educations.setBounds(300, 310, 400, 30);
        educations.setBackground(Color.WHITE);
        add(educations);
        

        JLabel accupation = new JLabel("Occupation:");
        accupation.setFont(new Font("Raleway", Font.BOLD, 20));
        accupation.setBounds(100, 390, 200, 30);
        add(accupation);
        String accupationval[] = { "Salaried", "Self-Employed", "Bussiness", "Student", "Retired","Other" };
         accupations=new JComboBox<>(accupationval);
        accupations.setBounds(300, 390, 400, 30);
        accupations.setBackground(Color.WHITE);
        add(accupations);
        
      
        JLabel pannumber = new JLabel("Pan Number:");
        pannumber.setFont(new Font("Raleway", Font.BOLD, 20));
        pannumber.setBounds(100, 440, 200, 30);
        add(pannumber);
        pannumbers = new JTextField();
        pannumbers.setFont(new Font("Raleway", Font.BOLD, 14));
        pannumbers.setBounds(300, 440, 400, 30);
        add(pannumbers);

        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 490, 200, 30);
        add(aadhar);
         aadhars = new JTextField();
        aadhars.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhars.setBounds(300, 490, 400, 30);
        add(aadhars);

        JLabel citizen = new JLabel("Senior Citizen:");
        citizen.setFont(new Font("Raleway", Font.BOLD, 20));
        citizen.setBounds(100, 540, 200, 30);
        add(citizen);
        scitizen=new JRadioButton("Yes");
        scitizen.setFont(new Font("Raleway",Font.BOLD,20));
        scitizen.setBounds(300,540,100,30);
       scitizen.setBackground(Color.WHITE);
        add(scitizen);
         ncitizen=new JRadioButton("No");
        ncitizen.setFont(new Font("Raleway",Font.BOLD,20));
        ncitizen.setBounds(550,540,100,30);
        ncitizen.setBackground(Color.WHITE);
        add(ncitizen);
        ButtonGroup scitizenGroup=new ButtonGroup();
        scitizenGroup.add(no);
        scitizenGroup.add(yes);

        
        JLabel existingaccount = new JLabel("Existing Account:");
        existingaccount.setFont(new Font("Raleway", Font.BOLD, 20));
        existingaccount.setBounds(100, 590, 200, 30);
        add(existingaccount);
       
         yes=new JRadioButton("Yes");
        yes.setFont(new Font("Raleway",Font.BOLD,20));
        yes.setBounds(300,590,100,30);
        yes.setBackground( Color.WHITE);
        add(yes);
         no=new JRadioButton("No");
        no.setFont(new Font("Raleway",Font.BOLD,20));
        no.setBounds(550,590,100,30);
        no.setBackground(Color.WHITE);
        add(no);
        ButtonGroup existingaccountgGroup=new ButtonGroup();
        existingaccountgGroup.add(no);
        existingaccountgGroup.add(yes);

        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Rayeway", Font.BOLD, 14));
        next.setBounds(620, 640, 80, 30);
        next.addActionListener(this);
        add(next);
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 800);

        setLocation(350, 10);
        setVisible(true);
    }

    public void actionperformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new signuptwo("");

    }

    
    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        String religions = (String) religion.getSelectedItem();
        String categorys = (String) category.getSelectedItem();
        String incomes =(String) income.getSelectedItem();
       String education=(String) educations.getSelectedItem();
       String accupation=(String) accupations.getSelectedItem();
        String citizens = null;
        if (scitizen.isSelected()) {
            citizens = "Yes";

        } else if (ncitizen.isSelected()) {
            citizens = "No";

        } 
        String existingaccount = null;
        if (yes.isSelected()) {
            existingaccount = "Yes";

        } else if (no.isSelected()) {
    existingaccount = "No";

        } 
        String pan=pannumbers.getText();
        String aadhar=aadhars.getText();

       
        try {
                connection c = new connection();

                String query = "insert into signuptwo values('" + formno + "','" + religions + "','" + categorys + "','" + incomes
                        +  "','" + pan+ "','" + aadhar+ "','" + education+ "','" + accupation+ "','" + citizens+ "','"
                        + existingaccount + "')";
                c.s.executeUpdate(query);
                setVisible(false);
                new signupthree(formno).setVisible(true);;
        }

        catch (Exception e) {
            System.out.println(e);
            //TODO: handle exception
        }

    }
}


