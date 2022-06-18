package Personal;
import javax.swing.JOptionPane;

public class Addition {
    public static void main(String[] args) {
        int number1;
        int number2;
        int sum;

        // System.out.println(x);

            
        String name1 = JOptionPane.showInputDialog("Enter first number?");
        number1 = Integer.parseInt(name1);
        String name2 = JOptionPane.showInputDialog("Enter second number?");
        number2 = Integer.parseInt(name2);
        sum = number1 + number2;
        String message = String.format("Sum is, %s", sum);
        JOptionPane.showMessageDialog(null, message);
       JOptionPane.showMessageDialog(null, "Sum is " +sum );

       // JOptionPane.showMessageDialog( null, "Welcome\nto\nJava")
       // String message = String.format("Welcome %s", name);
       // JOptionPane.showMessageDialog( null, "Welcome\nto\nJava");  
      
    }
}
