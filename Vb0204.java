import javax.swing.*;
import java.awt.event.*;

public class Vb0204 extends JFrame 
{
    public static void main (String args [])
    {
        JFrame frame = new Vb0204 ();
        frame.setSize (400, 200);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Voorbeeld 0204");
        JPanel paneel = new Paneel ();
        frame.setContentPane (paneel);
        frame.setVisible (true);
    }

    private static class Paneel extends JPanel {

        public Paneel() {
        }
    }
}
class paneel extends JPanel
{
    private JButton knop, herstelknop;
    private JTextField tekstvak;

    public paneel ()
    {
        knop = new JButton ("Klik");
        knop.addActionListener (new KnopHandler());
        
        herstelknop = new JButton ("Veeg uit");
        herstelknop.addActionListener (new HerstelknopHandler ());
        tekstvak = new JTextField (10);
        add (knop);
        add (tekstvak);
        add (herstelknop);
        
    }
    class KnopHandler implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            tekstvak.setText ("Je hebt gelijk!");
        }
    }
    class HerstelknopHandler implements ActionListener {
        public void ActionPerformed (ActionEvent e){
            tekstvak.setText ("");
        }
    }
}