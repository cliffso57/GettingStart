package Personal;
import javax.swing.JOptionPane; // import class JOoptionPane

public class Dialog1 {
    public static void main(String[] args) 
     {
        
         String name = JOptionPane.showInputDialog("what is your name?");
         String message = String.format("Welcome, %s, to Java Programming", name);
         JOptionPane.showMessageDialog(null, message);
        // JOptionPane.showMessageDialog( null, "Welcome\nto\nJava")
        // String message = String.format("Welcome %s", name);
        JOptionPane.showMessageDialog( null, "Welcome\nto\nJava");  
        }
}
