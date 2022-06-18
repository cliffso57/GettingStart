package Personal;
// import java.util.Scanner; // program uses class scanner
// import javax.swing.JOptionPane; // import class JOoptionPane

public class DOGTest {
    public static void main(String[] args) {

        int x;
        int number1 = 1;
        x = 2;
        // Scanner terMinal = new Scanner(System.in);
        int yy = x + x;
        DOG d = new DOG();
        System.out.println("DOG!!!!!! " + d.su);
        System.out.println("DOG!!!!!! " + d.name);
        System.out.println("x= " + yy + "");
        // susu to fido
        d.name = "fido";
        System.out.println("new dog name is " + d.name);

        if (yy != 0) {
            d.bark();
            System.out.println("DOG bark " + yy + " time");
            --yy;
        } else {
            System.out.println("DOG barks no more ");
        }
        // add more
        yy++;

        while (yy < 10) {
            d.bark();
            System.out.println("DOG barks " + yy + " time");
            yy = yy + 1;
        }
        // finally say hello to world
        Helloworld sayHello = new Helloworld();

        sayHello.helloWorld();
       // sayHello.helloWorld();
       

        // input from terminal
        System.out.println("Enter 1 or 2 from the terminal");
        System.out.println("Number before entered from the terminal: " + number1);
        // number1 = terMinal.nextInt();
        // String stringInx;
        // System.out.println("Line before entered from the terminal: + stringInx");
        // String stringInx = terMinal.nextLine();
        // System.out.println("Nnumber entered from the terminal: " + number1);
        // System.out.println("Line entered from the terminal: " + stringInx);
        sayHello.uil();

        
    }
        


        }

        
    
 
    

