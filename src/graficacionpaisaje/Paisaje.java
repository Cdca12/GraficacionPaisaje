package graficacionpaisaje;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Carlos Contreras
 */
public class Paisaje extends JFrame {

    public JLabel l1;

    public Paisaje() {
        super("Paisaje Natural");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        // TODO: Borrar
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(21, 127 , 227));
        l1 = new JLabel("Coordenadas del raton");
        l1.setBounds(0, 695, 200, 45);
        p1.add(l1);
        addEventos();
        add(p1);

        setVisible(true);
    }

    // TODO: Borrar
    public void addEventos() {
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent evento) {
                l1.setText(String.format("Sus coordenadas son [%d, %d]", evento.getX(), evento.getY()));
            }
        });

    }

    
    public class Poligonos {
        public int[] xpoints;
        public int[] ypoints;
        public int sides;
        public Color color;
        
        public Poligonos() {
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
    
    
        // TODO: Acomodar colores
    Color BlancoB = new Color(228, 240, 238);
    Color BlancoV = new Color(204, 225, 218);
    Color GrisM = new Color(187, 204, 198);
    Color VerdeMB = new Color(126, 201, 171);
    

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        Graphics2D g = (Graphics2D) graphics;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        ArrayList<Poligonos> poligonos = new ArrayList<>();
        Poligonos poligono;

        
        // Generar poligonos

        Color Azul1A = new Color(14, 58, 87);
        Color Azul1B = new Color(10, 40, 61);
        Color Azul1C = new Color(18, 74, 109);
        Color Azul1D = new Color(15, 63, 91);
        Color A3 = new Color(10, 19, 28);
        
              // Área 3
        poligono = new Poligonos(); // A3
        poligono.setColor(A3);
        poligono.setXpoints(0, 159, 384, 435, 500, 644, 677, 799, 950, 1280, 1280, 0);  
        poligono.setYpoints(571, 564, 624, 650, 625, 593, 594, 644, 565, 544, 720, 720); 
        poligonos.add(poligono);
        
        // Área 1
        poligono = new Poligonos(); // 1
        poligono.setColor(Azul1A);
        poligono.setXpoints(0, 35, 0); 
        poligono.setYpoints(389, 401, 450); 
        poligonos.add(poligono);
        
        poligono = new Poligonos(); // 2
        poligono.setColor(Azul1B);
        poligono.setXpoints(0, 35, 94, 0); 
        poligono.setYpoints(450, 401, 471, 511); 
        poligonos.add(poligono);
        
        poligono = new Poligonos(); // 3
        poligono.setColor(Azul1B);
        poligono.setXpoints(82, 111, 193); 
        poligono.setYpoints(403, 490, 404); 
        poligonos.add(poligono);
        
        poligono = new Poligonos(); // 4
        poligono.setColor(Azul1A);
        poligono.setXpoints(111, 193, 215); 
        poligono.setYpoints(490, 404, 447); 
        poligonos.add(poligono);
        
        poligono = new Poligonos(); // 5
        poligono.setColor(Azul1A);
        poligono.setXpoints(306, 82, 205); 
        poligono.setYpoints(404, 403, 356); 
        poligonos.add(poligono);
        
        poligono = new Poligonos(); // 6
        poligono.setColor(Azul1B);
        poligono.setXpoints(193, 215, 306);  
        poligono.setYpoints(404, 447, 404); 
        poligonos.add(poligono);
        
        poligono = new Poligonos(); // 7
        poligono.setColor(Azul1A);
        poligono.setXpoints(215, 286, 323);  
        poligono.setYpoints(447, 494, 397); 
        poligonos.add(poligono);
        
        poligono = new Poligonos(); // 8
        poligono.setColor(Azul1B);
        poligono.setXpoints(323, 286, 382);  
        poligono.setYpoints(397, 494, 421); 
        poligonos.add(poligono);
        
        poligono = new Poligonos(); // 9
        poligono.setColor(Azul1A);
        poligono.setXpoints(382, 286, 332, 407);  
        poligono.setYpoints(421, 494, 524, 501); 
        poligonos.add(poligono);
        
        poligono = new Poligonos(); // 10
        poligono.setColor(Azul1B);
        poligono.setXpoints(407, 528, 382);  
        poligono.setYpoints(501, 482, 421); 
        poligonos.add(poligono);
        
        poligono = new Poligonos(); // 11
        poligono.setColor(Azul1A);
        poligono.setXpoints(35, 111, 82, 52);  
        poligono.setYpoints(401, 490, 403, 395); 
        poligonos.add(poligono);
        
        poligono = new Poligonos(); // 26
        poligono.setColor(Azul1A);
        poligono.setXpoints(528, 557, 587);  
        poligono.setYpoints(482, 468, 498); 
        poligonos.add(poligono);
        
        
        // Área 2
        poligono = new Poligonos(); // 12
        poligono.setColor(Azul1C);
        poligono.setXpoints(0, 0, 35);  
        poligono.setYpoints(329, 389, 401); 
        poligonos.add(poligono);
  
        poligono = new Poligonos(); // 13
        poligono.setColor(Azul1D);
        poligono.setXpoints(0, 35, 115);  
        poligono.setYpoints(329, 401, 371); 
        poligonos.add(poligono);
  
        poligono = new Poligonos(); // 14
        poligono.setColor(Azul1C);
        poligono.setXpoints(35, 115, 142, 82);  
        poligono.setYpoints(401, 370, 380, 403); 
        poligonos.add(poligono);
  
        poligono = new Poligonos(); // 15
        poligono.setColor(Azul1D);
        poligono.setXpoints(107, 142, 159);  
        poligono.setYpoints(368, 380, 341); 
        poligonos.add(poligono);
  
        poligono = new Poligonos(); // 16
        poligono.setColor(Azul1C);
        poligono.setXpoints(142, 159, 205);  
        poligono.setYpoints(380, 341, 356); 
        poligonos.add(poligono);
  
        poligono = new Poligonos(); // 17
        poligono.setColor(Azul1C);
        poligono.setXpoints(251, 327, 323, 306);  
        poligono.setYpoints(379, 348, 397, 404); 
        poligonos.add(poligono);
  
        poligono = new Poligonos(); // 18
        poligono.setColor(Azul1D);
        poligono.setXpoints(323, 327, 402, 413);  
        poligono.setYpoints(397, 348, 378, 435); 
        poligonos.add(poligono);
  
        poligono = new Poligonos(); // 19
        poligono.setColor(Azul1C);
        poligono.setXpoints(402, 413, 479, 419);  
        poligono.setYpoints(378, 435, 397, 371); 
        poligonos.add(poligono);
  
        poligono = new Poligonos(); // 20
        poligono.setColor(Azul1D);
        poligono.setXpoints(413, 528, 529);  
        poligono.setYpoints(435, 482, 373); 
        poligonos.add(poligono);
  
        poligono = new Poligonos(); // 21
        poligono.setColor(Azul1C);
        poligono.setXpoints(528, 529, 568, 629);  
        poligono.setYpoints(482, 373, 433, 438); 
        poligonos.add(poligono);
  
        poligono = new Poligonos(); // 22
        poligono.setColor(Azul1D);
        poligono.setXpoints(529, 568, 697);  
        poligono.setYpoints(373, 433, 439); 
        poligonos.add(poligono);
  
        poligono = new Poligonos(); // 23
        poligono.setColor(Azul1D);
        poligono.setXpoints(557, 629, 697);  
        poligono.setYpoints(468, 438, 468); 
        poligonos.add(poligono);
  
        poligono = new Poligonos(); // 24
        poligono.setColor(Azul1D);
        poligono.setXpoints(697, 697, 820, 736);  
        poligono.setYpoints(468, 439, 392, 458); 
        poligonos.add(poligono);
  
        poligono = new Poligonos(); // 27
        poligono.setColor(Azul1C);
        poligono.setXpoints(697, 697, 629);  
        poligono.setYpoints(468, 439, 438); 
        poligonos.add(poligono);
  
        poligono = new Poligonos(); // 25
        poligono.setColor(Azul1C);
        poligono.setXpoints(736, 820, 816);  
        poligono.setYpoints(458, 392, 482); 
        poligonos.add(poligono);
        
        poligono = new Poligonos(); // 28
        poligono.setColor(Azul1C);
        poligono.setXpoints(816);  
        poligono.setYpoints(); 
        poligonos.add(poligono);






        
        poligono = new Poligonos(); // 28
        poligono.setColor(Azul1C);
        poligono.setXpoints();  
        poligono.setYpoints(); 
        poligonos.add(poligono);
  
  
        
        
        // Área 4
        
        
        
        // Pintar poligonos generados
        Poligonos poligonoActual;
        for (int i = 0; i < poligonos.size(); i++) {
            poligonoActual = poligonos.get(i);
            g.setColor(poligonoActual.color);
            g.fillPolygon(poligonoActual.xpoints, poligonoActual.ypoints, poligonoActual.sides);
        }

    }

    
}



// Código viejo
//poligono = new Paisaje.Poligonos(); // 2
//        poligono.setColor(Azul1B);
//        poligono.setXpoints(0, 61, 110);
//        poligono.setYpoints(425, 384, 415);
//        poligonos.add(poligono);
//        
//        poligono = new Paisaje.Poligonos(); // 3
//        poligono.setColor(Azul1A);
//        poligono.setXpoints(192, 61, 110); 
//        poligono.setYpoints(379, 384, 415);
//        poligonos.add(poligono);
//        
//        poligono = new Paisaje.Poligonos(); // 4
//        poligono.setColor(Azul1B);
//        poligono.setXpoints(192, 61, 173);
//        poligono.setYpoints(379, 384, 338);
//        poligonos.add(poligono);
//        
//        poligono = new Paisaje.Poligonos(); // 5
//        poligono.setColor(Azul1A);
//        poligono.setXpoints(192, 173, 204, 254);
//        poligono.setYpoints(379, 338, 351, 402);
//        poligonos.add(poligono);
//        
//        poligono = new Paisaje.Poligonos(); // 6
//        poligono.setColor(Azul1B);
//        poligono.setXpoints(204, 296, 326, 280, 254); 
//        poligono.setYpoints(351, 312, 331, 387, 402); 
//        poligonos.add(poligono);
//                
//        poligono = new Paisaje.Poligonos(); // 7
//        poligono.setColor(Azul1A);
//        poligono.setXpoints(280, 299, 396, 404, 353, 326); 
//        poligono.setYpoints(387, 396, 355, 335, 316, 331);
//        poligonos.add(poligono);
//        
//        poligono = new Paisaje.Poligonos(); // 8
//        poligono.setColor(Azul1B);
//        poligono.setXpoints(396, 414, 448, 461, 435, 404);  
//        poligono.setYpoints(355, 368, 352, 329, 324, 335);    
//        poligonos.add(poligono);
//
//        poligono = new Paisaje.Poligonos(); // 9
//        poligono.setColor(Azul1A);
//        poligono.setXpoints(461, 448, 480, 555); 
//        poligono.setYpoints(329, 352, 369, 336); 
//        poligonos.add(poligono);
//
//        poligono = new Paisaje.Poligonos(); // 10
//        poligono.setColor(Azul1B);
//        poligono.setXpoints(461, 555, 584); 
//        poligono.setYpoints(329, 336, 282); 
//        poligonos.add(poligono);
//
//        poligono = new Paisaje.Poligonos(); // 11
//        poligono.setColor(Azul1A);
//        poligono.setXpoints(584, 555, 603);
//        poligono.setYpoints(282, 336, 364);
//        poligonos.add(poligono);
//
//        poligono = new Paisaje.Poligonos(); // 12
//        poligono.setColor(Azul1B);
//        poligono.setXpoints(584, 603, 718);
//        poligono.setYpoints(282, 364, 335);
//        poligonos.add(poligono);
//        
//        poligono = new Paisaje.Poligonos(); // 13
//        poligono.setColor(Azul1A);
//        poligono.setXpoints(718, 665, 712, 748);
//        poligono.setYpoints(335, 348, 376, 361);
//        poligonos.add(poligono);
//        
//        poligono = new Paisaje.Poligonos(); // 14
//        poligono.setColor(Azul1B);
//        poligono.setXpoints(718, 763, 800);
//        poligono.setYpoints(335, 376, 369);
//        poligonos.add(poligono);
//
//        poligono = new Paisaje.Poligonos(); // 15
//        poligono.setColor(Azul1A);
//        poligono.setXpoints(750, 800, 861, 803);
//        poligono.setYpoints(348, 369, 348, 323);
//        poligonos.add(poligono);
//        
//    
//        // Área 2
//        poligono = new Paisaje.Poligonos(); // 16
//        poligono.setColor(Azul2A);
//        poligono.setXpoints(110, 192, 195, 159); 
//        poligono.setYpoints(415, 379, 394, 410); 
//        poligonos.add(poligono);
//
//        poligono = new Paisaje.Poligonos(); // 17
//        poligono.setColor(Azul2B);
//        poligono.setXpoints(192, 195, 254);
//        poligono.setYpoints(379, 394, 402);
//        poligonos.add(poligono);
//
//        poligono = new Paisaje.Poligonos(); // 18
//        poligono.setColor(Azul2A);
//        poligono.setXpoints(195, 386, 332);
//        poligono.setYpoints(394, 419, 445);
//        poligonos.add(poligono);
//        
//        poligono = new Paisaje.Poligonos(); // 19
//        poligono.setColor(Azul2B);
//        poligono.setXpoints(254, 280, 336);
//        poligono.setYpoints(402, 387, 413);
//        poligonos.add(poligono);
//        
//        poligono = new Paisaje.Poligonos(); // 20
//        poligono.setColor(Azul2A);
//        poligono.setXpoints(336, 299, 396, 414, 387);
//        poligono.setYpoints(413, 396, 355, 368, 420);
//        poligonos.add(poligono);
//        
//        poligono = new Paisaje.Poligonos(); // 21
//        poligono.setColor(Azul2B);
//        poligono.setXpoints(387, 414, 439);
//        poligono.setYpoints(420, 368, 407);
//        poligonos.add(poligono);
//        
//        poligono = new Paisaje.Poligonos(); // 22
//        poligono.setColor(Azul2A);
//        poligono.setXpoints(439, 414, 448, 480, 500, 480);
//        poligono.setYpoints(407, 368, 352, 369, 414, 428);
//        poligonos.add(poligono);
//        
//        poligono = new Paisaje.Poligonos(); // 23
//        poligono.setColor(Azul2B);
//        poligono.setXpoints(500, 480, 555, 603, 542);
//        poligono.setYpoints(414, 369, 336, 364, 433);
//        poligonos.add(poligono);
//        
//        poligono = new Paisaje.Poligonos(); // 24
//        poligono.setColor(Azul2A);
//        poligono.setXpoints(542, 603, 636);
//        poligono.setYpoints(433, 364, 472);
//        poligonos.add(poligono);
//        
//        poligono = new Paisaje.Poligonos(); // 25
//        poligono.setColor(Azul1B);
//        poligono.setXpoints(636, 603, 666, 714, 735);
//        poligono.setYpoints(472, 364, 348, 377, 424);
//        poligonos.add(poligono);
