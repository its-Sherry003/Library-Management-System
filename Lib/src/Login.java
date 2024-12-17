import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
public class Login extends JFrame{
    //private static JLabel log = new JLabel("LOGIN");
    private static JLabel output = new JLabel();
    private static JLabel name = new JLabel("NAME");
    private static JTextField nameBox =  new JTextField(25);
    private static JLabel password = new JLabel("PASSWORD");
    private static JPasswordField passwordBox = new JPasswordField(10);
    private static JButton nameButton = new JButton("LOGIN");
    public static void main(String[] args) throws Exception {
        Login window = new Login();
        window.setSize(500,500);
        window.setVisible(true);
        window.setTitle("Library Management System Login");

        window.setLayout(new FlowLayout());
        //window.getContentPane().add(log);
        window.getContentPane().add(output);
        window.getContentPane().add(name);
        window.getContentPane().add(nameBox);
        window.getContentPane().add(output);
        window.getContentPane().add(password);
        window.getContentPane().add(passwordBox); 
        window.getContentPane().add(output);       
        window.getContentPane().add(nameButton);
        window.getContentPane().add(output);

        //Action Listener
        nameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                buttonClick(e);
            }
        });

        //Swing objects here

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//end of main}
        public static void buttonClick(ActionEvent e){
            //Code to respond to clicking the button
           // JOptionPane.showMessageDialog(null, "Button Works", "Hello!",JOptionPane.INFORMATION_MESSAGE );
           //Retrieving data from the screen

           String ScreenName = nameBox.getText();
           String outputMessage = "Hello "+ScreenName +", your password has been saved successfully";
           output.setText(outputMessage);
        }
}  

