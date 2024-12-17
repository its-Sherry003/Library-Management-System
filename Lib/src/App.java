import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
public class App extends JFrame{
    private static JLabel directions = new JLabel("Enter name: ");
    private static JLabel output = new JLabel();
    private static JTextField nameBox =  new JTextField(25);
    private static JButton nameButton = new JButton("Click here!!");
    public static void main(String[] args) throws Exception {
        App window = new App();
        window.setSize(500,500);
        window.setVisible(true);
        window.setTitle("Library Management System!!!");

        window.setLayout(new FlowLayout());
        window.getContentPane().add(directions);
        window.getContentPane().add(nameBox);
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

           String name = nameBox.getText();
           String outputMessage = "Hello "+name;
           output.setText(outputMessage);
        }
}  
