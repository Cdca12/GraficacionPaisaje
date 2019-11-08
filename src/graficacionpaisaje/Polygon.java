/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficacionpaisaje;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author cdca1
 */
public class Polygon {

    private java.awt.Polygon polygon;
    private Color color;
    private static Graphics g;
    
    public Polygon() {
        
    }

    public Polygon(Color color, Point... points) {
        this.color = color;
        polygon = new java.awt.Polygon();
        for (int i = 0; i < points.length; polygon.addPoint(points[i].x, points[i].y), i++);
    }
    
    public void setGraphics(Graphics g) {
        this.g = g;
    }

    public void drawPolygon() {
        g.setColor(color); // Crear color
        g.drawPolygon(polygon); // Dibujar contorno polígono
        g.fillPolygon(polygon); // Rellenar área polígono
    }

}
