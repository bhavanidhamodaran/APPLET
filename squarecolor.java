import java.awt.*;
import java.applet.*;
public class squarecolor extends Applet
{
  public void paint(Graphics g)
  {
    g.setColor(Color.blue);
    g.drawRect(100, 100, 100, 100);
    g.setColor(Color.blue);
    g.fillRect(50, 50, 50, 50);
     }
}