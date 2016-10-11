package Hoofdstuke3;

// Dit is een opdracht voor het vaak basis programirring
//Dit is samengemaakt met Anthony en Ismail 
import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//PCJFRAME
public class Hoofdstuke3 extends JFrame
        
        
{
    public static void main( String args[] )
    {
        JFrame frame = new Hoofdstuke3 ();
        frame.setSize( 550, 350);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setTitle( "Opdracht voor cijfer" );
        JPanel paneel = new Paneel();
        frame.setContentPane( paneel );
        frame.setVisible( true ); 
    }

  }
///BELANGRIJK 
class Paneel extends JPanel {
    private int x;
    private int y;
    private int antwoord1;
    private JTextField invoervak1, invoervak2, resultaatVak;
    private JButton plusKnop;
    private float antwoord2;
    private JButton schakel;
    private int diameter;
    //public panel
    public Paneel () {
        x = 3;
        y = 8;
        antwoord1 = x + y;
        antwoord2 = (float)x / y;
       
        invoervak1 = new JTextField( 10 );
        invoervak2 = new JTextField( 10 );
        resultaatVak = new JTextField( 10 );
        plusKnop = new JButton( "+" );
        plusKnop.addActionListener( new PlusKnopHandler () );
        
        add( invoervak1 );
        add( invoervak2 );
        add( plusKnop );
        add( resultaatVak );
        
        setBackground( Color.WHITE );
        diameter = 10;
        schakel = new JButton( "Groter");
        schakel.addActionListener( new KnopHandler2() );
        add( schakel );
    }
    //inwnedige klasse
    
    
    class PlusKnopHandler implements ActionListener {
    public void actionPerformed(ActionEvent e ) {
        
        String invoerstring1 = invoervak1.getText();
        int getal1 = Integer.parseInt( invoerstring1 );
        
        String invoerstring2 = invoervak2.getText();
        int getal2 = Integer.parseInt( invoerstring2 );
         
        int resultaat = getal1 + getal2;
        
        resultaatVak.setText( "" + resultaat );
        
         }
    }
    
    class KnopHandler2 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            diameter++;
            repaint(); 
        }
    }
        public void paintComponent( Graphics g ) {
        super.paintComponent( g );
        
        g.drawString( "Overzicht van de berekening", 40, 200);
        g.drawString( "x = " + x, 40, 240 );
        g.drawString( "y = " + y, 40, 260 );
        g.drawString( "De som is: " + antwoord1, 40, 280);
        g.drawString( "De deling in decimaal: " + antwoord2, 40, 300);
        g.setColor( Color.BLUE );
        g.fillOval( 150, 100, diameter, diameter );
     
    }
}