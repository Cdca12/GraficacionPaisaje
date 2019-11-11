package graficacionpaisaje;

import java.awt.*;

/**
 *
 * @author Carlos Contreras
 */
public class Poligono extends Figura {
    
    public void drawPolygon(Graphics g) {
        g.setColor(color);
        g.fillPolygon(xpoints, ypoints, sides);
    }
    
    public void contorno(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawPolygon(xpoints, ypoints, sides);
    }
}
