package Personal;
import javax.swing.JOptionPane; // import class JOoptionPane

public class Helloworld {
    int[] intArray1 = {9,9,9};
    String lable;
    boolean yesOrNo;

    public void helloWorld() {
        //* System.out.println("intArray1[0] is " + intArray1[0]);
        // System.out.println("intArray1[1] is " + intArray1[1]);
        // System.out.println("intArray1[2] is " + intArray1[2]);
        for (int x = 0; x < 3; x = x + 1) {
            System.out.println("intArray1[" + x + "]" + " is " + intArray1[x]);
        }
        System.out.println("Lable is " + lable);
        System.out.println("Boolean default " + yesOrNo);
        System.out.println("Hello World!");
        System.out.printf("%s,,,,%s\n", "Welcome to ", "Java Programming!");
    }

    public void uil()
         {
            
             String name = JOptionPane.showInputDialog("what is your name?");
             String message = String.format("Welcome, %s, to Java Programming", name);
             JOptionPane.showMessageDialog(null, message);
            // JOptionPane.showMessageDialog( null, "Welcome\nto\nJava")
            // String message = String.format("Welcome %s", name);
            JOptionPane.showMessageDialog( null, "Welcome\nto\nJava");  
            }
    }


