package graficacionpaisaje;

import java.awt.*;

/**
 *
 * @author Carlos Contreras
 */
public class Patrones {

    public static void drawSun(Graphics g, Color[] colores, int x, int y, int inicialWidth, int inicialHeigth) {
        Circulo circulo;
        int maxWidth = inicialWidth + ((colores.length + 1) * 20) ;
        int maxHeigth = inicialHeigth + ((colores.length + 1) * 20);
        for (int i = 1; i < colores.length; i++) {
            circulo = new Circulo(maxWidth - (i * 20), maxHeigth - (i * 20));
            circulo.setColor(colores[-1 + i]);
            circulo.setXpoints(x + (10 * i));
            circulo.setYpoints(y + (10 * i));
            circulo.drawCircle(g);
        }
        circulo = new Circulo(inicialWidth, inicialHeigth);
        circulo.setColor(colores[colores.length - 1]);
        circulo.setXpoints(x + 40);
        circulo.setYpoints(y + 40);
        circulo.drawCircle(g);
    }

    public static void drawPineTree(Graphics g, Color color, int xBase, int yBase, int width, int height, int niveles) {
        if (niveles == 0) {
            return;
        }
        int incrementoAncho = width / 2;
        int incrementoAltura = height / 2;
        Poligono poligono = new Poligono();
        poligono.setXpoints(xBase, xBase + incrementoAncho, xBase + width);
        poligono.setYpoints(yBase, yBase - height - 3, yBase);
        poligono.setColor(color);
        poligono.drawPolygon(g);
        drawPineTree(g, color, xBase + 5, yBase - 20, width - 10, height - 5, niveles - 1);
    }
}
