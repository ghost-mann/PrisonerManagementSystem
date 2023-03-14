import javax.swing.*;
import java.awt.*;



public class UserLogin {


    public static void main(String[] args){





        JFrame userFrame = new JFrame("User Login:");






        JPanel userPanel = new JPanel();




        JLabel userLabel = new JLabel("Enter your details");


        JLabel user_Name = new JLabel("Username");



        // textfield of 16 columns
        JTextField userText = new JTextField(16);



        JLabel pass_Word = new JLabel("Password");



        JTextField loginPass = new JTextField(16);
        loginPass.setBounds(50, 100, 200, 30);


        JButton userBtnLog = new JButton("Login");
        JButton cancelBtn = new JButton("Cancel");


        userFrame.setVisible(true);
        userFrame.add(userPanel, BorderLayout.CENTER);
        userPanel.setBounds(40, 80, 400, 400);

        userPanel.setVisible(true);
        userPanel.add(userLabel);
        userPanel.add(user_Name);
        userPanel.add(userText);
        userPanel.add(pass_Word);
        userPanel.add(loginPass);
        userPanel.add(userBtnLog);
        userPanel.add(cancelBtn);





    }

}
