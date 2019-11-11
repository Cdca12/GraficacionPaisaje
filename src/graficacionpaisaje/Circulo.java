package graficacionpaisaje;

import java.awt.Graphics;

/**
 *
 * @author Carlos Contreras
 */
public class Circulo extends Figura {
    
    private int width;
    private int heigth;
    
    public Circulo() {
        
    }
    
    public Circulo(int width, int height) {
        this.width = width;
        this.heigth = height;
    }
    
    public void drawCircle(Graphics g) {
        g.setColor(color);
        g.fillOval(xpoints[0], ypoints[0], width, heigth);
        
    }
}
