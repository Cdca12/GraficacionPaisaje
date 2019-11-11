package graficacionpaisaje;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Carlos Contreras
 */
public class Figura {

    protected int[] xpoints;
    protected int[] ypoints;
    protected int sides;
    protected Color color;

    public Figura() {
    }

    public void setXpoints(int... xpoints) {
        this.xpoints = xpoints;
        this.sides = xpoints.length;
    }

    public void setYpoints(int... ypoints) {
        this.ypoints = ypoints;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
