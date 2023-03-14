import javafx.scene.layout.Pane;

import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.awt.*;



public class AdminSignUp {
    public static void main(String[]args){

        JFrame frameUp = new JFrame();
        JPanel panelUp = new JPanel();










        panelUp.setBounds(40, 80, 400, 400);
        panelUp.setBackground(Color.white);
        panelUp.setVisible(true);

        JLabel labelUp = new JLabel("Sign Up As Administrator:");
        JLabel email = new JLabel("Email:");
        JTextField enterEmail = new JTextField(16);
        JLabel dob = new JLabel("Date of Birth:");
        JTextField enterDob = new JTextField(16);
        JLabel Username = new JLabel("Username:");
        JTextField enterUsername = new JTextField(16);
        JLabel password = new JLabel("Password:");
        JTextField enterPassword = new JTextField(16);

        JButton Create = new JButton("Create Admin user:");
        JButton Cancel = new JButton("Cancel:");



        panelUp.add(labelUp);
        panelUp.add(email);
        panelUp.add(enterEmail);
        panelUp.add(dob);
        panelUp.add(enterDob);
        panelUp.add(Username);
        panelUp.add(enterUsername);
        panelUp.add(password);
        panelUp.add(enterPassword);
        panelUp.add(Create);
        panelUp.add(Cancel);

        frameUp.setVisible(true);
        frameUp.pack();
        frameUp.add(panelUp, BorderLayout.CENTER);
        frameUp.setBounds(40,80,400,400);



    }


}
