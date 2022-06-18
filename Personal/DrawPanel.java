package Personal;
import javax.swing.JPanel;
import java.awt.*;

public class DrawPanel extends JPanel {
    public void paintComponent( Graphics g){ 
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        double n = 1;
        double m = 0;
        // Cal line number
        double number=15;
        double delta= 1/number;

        while (n > 0) {
            
            g.drawLine(0, (int) (height * m), (int) (width * m), height);
            g.drawLine((int) (width * m), height, width, (int) (height * n));
            g.drawLine(width, (int) (height * n), (int) (width * n), 0);
            g.drawLine((int) (width * n),0, 0, (int) (height * m));
            n = n - delta;
            m = m + delta;
        }
/* 
while (n > 0) {
    // g.drawLine(0, 0, (int) (width * n), (int) (height * m));
    g.drawLine ((int) 0, (int) (height * m),(int) (width * m), height);
    // g.drawLine(width, height, (int) (width * n), (int) (height * m));

    // g.drawLine(0, height, (int) (width * m), (int) (height * (1 - n)));
    // g.drawLine(width, 0, (int) (width * m), (int) (height * (1 - n)));
    n = n - 0.06;
    m = m + 0.06;
}

 */
       
/* Debugged code
        while (n > 0) {
            g.drawLine(0, 0, (int) (width * n), (int) (height * m));
            g.drawLine(width, height, (int) (width * n), (int) (height * m));
            // g.drawLine(0, height, (int) (width*n), 0);
            g.drawLine(0, height, (int) (width * m), (int) (height * (1 - n)));
            g.drawLine(width, 0, (int) (width * m), (int) (height * (1 - n)));
            n = n - 0.06;
            m = m + 0.06;
        }
        
*/

        System.out.println("1st drawing");
   /*     n = 1;
   m = 0;
   
   
   while (n > 0) {
       g.drawLine(0, 0, (int) (width * n), (int) (height * m));
       g.drawLine(width, height, (int) (width * n), (int) (height * m));
       g.drawLine(0, height, (int) (width*m), (int) (height * n));
       g.drawLine((int) (width*m), height, 0, (int) (width*m));
       n = n - 0.06;
       m = m + 0.06;
       
   }
           
   System.out.println("2nd drawing");
   */      
    }
    
 

}
