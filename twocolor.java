import java.awt.*;
import java.applet.*;
public class twocolor extends Applet
{
  public void paint(Graphics g)
  {
    g.drawRect(100, 100, 500, 500);
	g.drawLine(100,350,600,350);
    g.setColor(Color.red);
    g.fillRect(100, 100, 500, 250);
    g.setColor(Color.black);
    g.fillRect(100, 350, 500, 250);
    



     }
}