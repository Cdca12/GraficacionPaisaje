package graficacionpaisaje;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Carlos Contreras
 */
public class Paisaje extends JFrame {

    private ArrayList<Polygon> polygons;

    public Paisaje() {
        super("Paisaje Natural");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        polygons = new ArrayList<>();
        new Polygon().setGraphics(g);
//        polygons.add(new Polygon(new Color(0, 0, 0), new Point(0, 0), new Point(1280, 720))); // Color inicial fondo blanco
        // Crear polígonos
        
        polygons.add(new Polygon(new Color(23, 43, 23), new Point(80, 406),  new Point(203, 356),  new Point(304, 402))); // Color inicial fondo blanco
//        polygons.get(0).setGraphics(g);
        

        // Dibujar poligonos
        for (int i = 0; i < polygons.size(); polygons.get(i).drawPolygon(), i++);

    }

}
