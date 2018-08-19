import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class circles extends Applet {
   
    public void paint(Graphics g) {
       //uppersemicircle
        g.setColor(Color.red);
        g.fillArc(20, 150, 100, 100, 360, 180);
        g.drawArc(20, 300, 100, 100, 360, 180);
		g.drawLine(120,350,20,350);

        
        //lowersemicircle
        g.setColor(Color.red);
        g.fillArc(150, 150, 100, 100, 180, 180);
        g.drawArc(150, 300, 100, 100, 180, 180);
        g.drawLine(150,350,250,350);
        
        //circle
        g.setColor(Color.red);
		g.drawOval(120,10,100,100);
		g.fillOval(10,10,100,100);
       
    }
}