import java.applet.Applet;
import java.awt.Graphics;
 
 
public class line extends Applet{
 
	public void paint(Graphics g){
		 
		g.drawLine(100,100,500,500);
		
		g.drawLine(100,500,100,1000);
		
		g.drawLine(100,100,500,100);
	}
}