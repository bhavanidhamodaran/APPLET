import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
 
 
public class colorline extends Applet{
 
	public void paint(Graphics g){
		g.setColor(Color.blue); 
		g.drawLine(100,100,500,100);
		
		
	}
}