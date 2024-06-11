import javax.swing.*;
import java.awt.*;

public class Bus extends JFrame{
    Bus(){
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("House Shape");
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.fillRoundRect(100,100,200,100,40,40);

        g.setColor(Color.yellow);
        g.fillRect(130,120,30,12);
        g.fillRect(165,120,30,12);
        g.fillRect(200,120,30,12);
        g.fillRect(235,120,30,12);

        g.setColor(Color.pink);
        g.fillRect(130,150,30,50);
        g.fillRect(235,150,30,50);

        g.setColor(Color.black);
        g.fillArc(120,185,30,30,0,-180);
        g.fillArc(150, 185,30,30,0,-180);

        g.fillArc(214,185,30,30,0,-180);
        g.fillArc(245,185,30,30,0,-180);

        g.setColor(Color.white);
        g.drawString("Solo Developer", 150,112);
    }

    public static void main(String[] args){
        new Bus();
    }
}