import java.applet.*;
import java.awt.*;
public class applet extends Applet
{
    public void paint(Graphics g)
    {
	g.setColor(Color.red);
        g.drawString("Welcome to Applet",100,100);
    }
}
/*<applet code="applet.class" height="500" width="500">
</applet>
*/