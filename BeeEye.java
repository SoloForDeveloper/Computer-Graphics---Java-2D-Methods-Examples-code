import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BeeEye extends JFrame implements MouseListener{
    Graphics g;
    BeeEye(){
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Bee Eye");
        setLocationRelativeTo(null);
        addMouseListener(this);
        g=getGraphics();//initialize graphics object
    }
    int x1,y1,x2,y2;

    public void mouseEntered(MouseEvent m){}
    public void mousePressed(MouseEvent m){}
    public void mouseClicked(MouseEvent m){
        System.out.println("Clicked");
        x1= m.getX();
        y1 = m.getY();
        System.out.println("x = "+x1);
        System.out.println("y = "+y1);
    }
    public void mouseReleased(MouseEvent m){}
    public void mouseExited(MouseEvent m){}

    

    public static void main(String[] args){
        new BeeEye();
    }
}