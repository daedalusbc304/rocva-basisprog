
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class vb0301 extends JFrame
{
public static void main (String args [] )
{
    
 JFrame frame = new Vb0301();
 frame.setSize(400,200);
 frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
 frame.setTitle("Voorbeeld 0301");
 frame.setContentPane( new Paneel ());
 frame.setVisible(true);
 }

    private static class Vb0301 extends JFrame {

        public Vb0301() {
        }
    }
}

class Paneel extends JPanel {
    private int a;
    private int b;
    private int antwoord;
    
    public Paneel () {
        a = 174 ;
        b = 26 ;
        antwoord = a + b;
    }
    @Override
    public void paintComponent ( Graphics g ){
    super.paintComponent (g) ;
    g.drawString ("Overzicht van de berekening", 40, 20 ) ;
    g.drawString ("a = " + a, 40, 40 ) ;
    g.drawString ("b = " + b, 40, 60) ;
    g.drawString ("De som is:" + antwoord, 40, 80) ;
}
}