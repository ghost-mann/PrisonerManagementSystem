import javax.swing.*;
import java.awt.*;

public class AdminLogin {


    public static void main(String[] args){

            JFrame admframe = new JFrame("Login as Administrator");






            JPanel admpanel = new JPanel();




            JLabel admlabel = new JLabel("Enter your details:");


            JLabel username = new JLabel("Username");



        // textfield of 16 columns
            JTextField user = new JTextField(16);



            JLabel password = new JLabel("Password");



        JTextField pass = new JTextField(16);
            pass.setBounds(50, 100, 200, 30);


            JButton admLogin = new JButton("Login");
            JButton admCancel = new JButton("Cancel");


            admframe.setVisible(true);
            admframe.add(admpanel, BorderLayout.CENTER);
            admframe.setBounds(40, 80, 400, 400);

            admpanel.setVisible(true);
            admpanel.add(admlabel);
            admpanel.add(username);
            admpanel.add(user);
            admpanel.add(password);
            admpanel.add(pass);
            admpanel.add(admLogin);
            admpanel.add(admCancel);





    }
}