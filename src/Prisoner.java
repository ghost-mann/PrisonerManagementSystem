import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;
class Prisoner{

    public static void main(String[] args){

            JFrame Frame = new JFrame("Welcome to the Prison Management System");
            JPanel Panel = new JPanel();
            Panel.setBounds(40, 80, 400, 400);
            Panel.setBackground(Color.white);
            Panel.setVisible(true);
            JLabel Label1 = new JLabel("Would you like to Login or SignUp?");
            Label1.setBounds(40, 80, 200, 200);
            JRadioButton rb1 = new JRadioButton("Administrator");
            JRadioButton rb2 = new JRadioButton("Jailer");
            JButton Button1 = new JButton("Login");
            JButton Button2 = new JButton("Sign up");
            Panel.add(Label1);
            Panel.add(rb1);
            Panel.add(rb2);
            Panel.add(Button1);
            Panel.add(Button2);

            Frame.add(Panel ,BorderLayout.CENTER);
            Frame.setBounds(40,80,400,400);

            Frame.setVisible(true);





    }
}
