import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
public class Dashboard extends JFrame{
    private static JButton books = new JButton("BOOKS AVAILABLE");
    private static JButton addBooks = new JButton("Add Books");
    private static JButton removeBooks = new JButton("REMOVE BOOKS");
    private static JButton staffDetails = new JButton("STAFF DETAILS");
    private static JButton addStaff = new JButton("ADD STAFF");
    private static JButton removeStaff = new JButton("REMOVE STAFF");
    private static JButton editAdmin = new JButton("EDIT ADMIN");
    public static void main(String[] args) {
        Dashboard window2 = new Dashboard();
        window2.setSize(500,500);
        window2.setVisible(true);
        window2.setTitle("Library Management System Dahboard");

        window2.setLayout(new GridLayout(4,2));
        window2.getContentPane().add(books);
        window2.getContentPane().add(new JLabel());
        window2.getContentPane().add(addBooks);
        window2.getContentPane().add(new JLabel());
        window2.getContentPane().add(removeBooks);
        window2.getContentPane().add(new JLabel());
        window2.getContentPane().add(staffDetails);
        window2.getContentPane().add(new JLabel());
        window2.getContentPane().add(addStaff);
        window2.getContentPane().add(new JLabel());
        window2.getContentPane().add(removeStaff);
        window2.getContentPane().add(new JLabel());
        window2.getContentPane().add(editAdmin);
    }
}
