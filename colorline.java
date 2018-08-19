import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
 
 
public class colorline extends Applet{
 
	public void paint(Graphics g){
		 
		g.drawLine(100,100,500,500);
		g.setColor(Color.blue);
		g.drawLine(100,500,100,1000);
		g.setColor(Color.blue);
		g.drawLine(100,100,500,100);
		g.setColor(Color.blue);
	}
}