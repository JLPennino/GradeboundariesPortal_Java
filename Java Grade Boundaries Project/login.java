import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class login extends JFrame implements ActionListener {
   JPanel panel;
   JLabel user_label, password_label, message;
   JTextField userName_text;
   JPasswordField password_text;
   JButton submit, cancel;
   login() {
      // Username Label
      user_label = new JLabel();
      user_label.setText("User Name :");
      userName_text = new JTextField();
      // Password Label
      password_label = new JLabel();
      password_label.setText("Password :");
      password_text = new JPasswordField();
      // Submit
      submit = new JButton("SUBMIT");
      panel = new JPanel(new GridLayout(3, 1));
      panel.add(user_label);
      panel.add(userName_text);
      panel.add(password_label);
      panel.add(password_text);
      message = new JLabel();
      panel.add(message);
      panel.add(submit);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Frame construction
      submit.addActionListener(this);
      add(panel, BorderLayout.CENTER);
      setTitle("Student Portal Login");
      setSize(400,350);
      setVisible(true);
      setResizable(false);
      setLayout(null);
   }
   public static void main(String[] args) {
      new login();
   }
   @Override
   public void actionPerformed(ActionEvent ae) {
      String userName = userName_text.getText();
      String password = password_text.getText();
      if (userName.trim().equals("Dave_Winkleberry") && password.trim().equals("DaveIsTheBest")) {
         message.setText(" Hello " + userName + "");
         gradeBoundaries.get();
      } else {
         message.setText(" Invalid user.. ");
      }
   }
}