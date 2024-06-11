import javax.swing.*;
import java.awt.*;

public class House extends JFrame{
    House(){
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("House Shape");
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawLine(60,120, 200,40);
        g.drawLine(340,120,200,40);

        g.setColor(Color.blue);
        g.fillRect(100,100,200,100);

        g.setColor(Color.green);
        g.fillRect(150,150, 40,45);

        g.setColor(Color.red);
        g.fillRect(200,110,30,10);
        g.fillRect(240,110,30,10);
    }

    public static void main(String[] args){
        new House();
    }
}