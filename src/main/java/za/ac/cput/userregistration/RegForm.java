/*

 */
package za.ac.cput.userregistration;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.*;
import org.apache.commons.validator.routines.EmailValidator;


/**
 *
 * 
 */
public class RegForm extends JFrame implements ActionListener {


    private JLabel lblFirstName;
    private JTextField txtFirstName;
    private JLabel lblErrorFirstName;

    private JLabel lblLastName;
    private JTextField txtLastName;
    private JLabel lblErrorLastName;

           

    private JLabel lblOptinal;


    private JLabel lblGender;
    private JPanel panelGender;
    private JRadioButton radMale;
    private JRadioButton radFemale;
    private JLabel lblErrorGender;
    private ButtonGroup genderButtonGroup;

    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel lblErrorEmail;

    ///added this 
    private JLabel lblPassword;
    private JPasswordField txtPassword;
    private JLabel lblErrorPassword;


    private JButton btnPrev;
    private JButton btnNext;
    private JButton btnExit;

    private Font fnt;

    //contructer
    public RegForm() {
        super("User Registration Form");


      


        lblFirstName = new JLabel("First Name: ");
        txtFirstName = new JTextField(20);
        lblErrorFirstName = new JLabel("*required* please fill in");
     //   lblErrorFirstName.setForeground(Color.DARK_GRAY);
        lblErrorFirstName.setVisible(false);

        lblLastName = new JLabel("Last Name: ");
        txtLastName = new JTextField(20);
        lblErrorLastName = new JLabel("*required* please fill in");
        //lblErrorLastName.setForeground(Color.DARK_GRAY);
        lblErrorLastName.setVisible(false);


        lblOptinal = new JLabel("Opitional");
        lblOptinal.setVisible(false);

        lblGender = new JLabel("Gender: ");
        panelGender = new JPanel();
        radFemale = new JRadioButton("Female");
        radMale = new JRadioButton("Male");
        genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(radFemale);
        genderButtonGroup.add(radMale);
        panelGender.setLayout(new GridLayout(1, 2));
        radMale.setSelected(true);
        panelGender.add(radMale);
        panelGender.add(radFemale);
        lblErrorGender = new JLabel("*required* please fill in");
       // lblErrorGender.setForeground(Color.DARK_GRAY);
        lblErrorGender.setVisible(false);

        lblEmail = new JLabel("Email: ");
        txtEmail = new JTextField(15);
        lblErrorEmail = new JLabel("*Please enter valid email");
        lblErrorEmail.setForeground(Color.yellow);
        lblErrorEmail.setVisible(false);


        lblPassword = new JLabel("Password: ");
        txtPassword = new JPasswordField();
        lblErrorPassword = new JLabel("*required* please fill in");
        lblErrorPassword.setForeground(Color.DARK_GRAY);
        lblErrorPassword.setVisible(false);


        btnPrev = new JButton("Previous");
        btnNext = new JButton("save");
        btnExit = new JButton("Exit");

     

    }

    public void setGUI() {

        this.setLayout(new GridLayout(8, 3));
      
        this.add(lblFirstName);
        this.add(txtFirstName);
        this.add(lblErrorFirstName);
        lblFirstName.setFont(fnt);

        this.add(lblLastName);
        this.add(txtLastName);
        this.add(lblErrorLastName);
        lblLastName.setFont(fnt);

        this.add(lblGender);
        this.add(panelGender);
        this.add(lblErrorGender);
        lblGender.setFont(fnt);

        this.add(lblEmail);
        this.add(txtEmail);
        this.add(lblErrorEmail);
        lblEmail.setFont(fnt);


        this.add(lblPassword);
        this.add(txtPassword);
        this.add(lblErrorPassword);
        lblPassword.setFont(fnt);


        this.add(btnPrev);
        this.add(btnExit);
        this.add(btnNext);
        btnNext.setForeground(Color.green);
        btnPrev.setForeground(Color.green);
        btnExit.setForeground(Color.green);

        btnNext.setBackground(Color.DARK_GRAY);
        btnPrev.setBackground(Color.DARK_GRAY);
        btnExit.setBackground(Color.red);

        btnNext.addActionListener(this);
        btnPrev.addActionListener(this);
        btnExit.addActionListener(this);
       // chkTerms.addActionListener(this);

        this.setTitle("Registration");

        this.setLocationRelativeTo(null);
        this.setPreferredSize(new Dimension(600, 350));
     //   this.getContentPane().setBackground(Color.CYAN);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public boolean IsValidInput() {
        boolean infoValid = true;

        if (txtFirstName.getText().equals("")) {
            infoValid = false;
            lblErrorFirstName.setVisible(true);
        } else {
            lblErrorFirstName.setVisible(false);
        }

        if (txtLastName.getText().equals("")) {
            infoValid = false;
            lblErrorLastName.setVisible(true);
        } else {
            lblErrorLastName.setVisible(false);
        }

   
        if (txtPassword.getPassword().length < 8) {
            infoValid = false;
            lblErrorPassword.setVisible(true);
        } else {
            lblErrorPassword.setVisible(false);
        }

        if (!EmailValidator.getInstance().isValid(txtEmail.getText())) {
            infoValid = false;
            lblErrorEmail.setVisible(true);
        } else {
            lblErrorEmail.setVisible(false);
        }

        return infoValid;
    }


    public static void main(String[] args) {
        new RegForm().setGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
