import java.awt.*;
import java.applet.*;
public class tricolor extends Applet
{
  public void paint(Graphics g)
  {
    g.drawRect(100, 100, 500, 300);
	g.drawLine(100,200,600,200);
	g.drawLine(100,300,600,300);
	g.setColor(Color.red);
	g.fillRect(100, 100, 500, 100);
	g.setColor(Color.yellow);
	g.fillRect(100, 200, 500, 100);
	g.setColor(Color.green);
	g.fillRect(100, 300, 500, 100);


     }
}