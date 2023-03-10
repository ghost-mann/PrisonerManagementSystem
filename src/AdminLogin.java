import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;

public class AdminLogin {

    JButton LoginUser, Cancel;
    JTextField tfUsername;
    JPasswordField pfPassword;
    JLabel lblUsername, lblPassword;
    GridBagLayout gbl;
    GridBagConstraints gbc;

    public AdminLogin() {
        tfUsername = new JTextField(20);
        pfPassword = new JPasswordField(20);


        lblUsername = new JLabel("Username");
        lblPassword = new JLabel("Password");

        gbl = new GridBagLayout();
        gbc = new GridBagConstraints();

        JFrame frame = new JFrame();
        frame.setLayout(gbl);

        LoginUser = new JButton("Login");
        Cancel = new JButton("Cancel");


        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        frame.add(lblUsername, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 5;
        gbc.weightx=1;
        frame.add(tfUsername, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        frame.add(lblPassword, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 5;
        frame.add(pfPassword, gbc);

        frame.add(LoginUser);

        frame.add(Cancel);

        frame.pack();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.TRAILING));
        frame.setVisible(true);




    }


    public static void main(String[] args){

        AdminLogin login = new AdminLogin();
    }

}
