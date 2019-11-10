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
        p1.setBackground(new Color(21, 127, 227));
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

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        Graphics2D g = (Graphics2D) graphics;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        ArrayList<Poligonos> poligonos = new ArrayList<>();
        Poligonos poligono;

        // Paleta de colores
        Color AzulA = new Color(14, 58, 87);
        Color AzulB = new Color(10, 40, 61);
        Color AzulC = new Color(18, 74, 109);
        Color AzulD = new Color(15, 63, 91);
        Color AzulE = new Color(16, 70, 103);

        Color VerdeA = new Color(10, 41, 59);
        Color VerdeB = new Color(7, 30, 44);

        Color A3 = new Color(10, 19, 28);

        // Generar poligonos
        // Área 3
        poligono = new Poligonos(); // A3
        poligono.setColor(A3);
        poligono.setXpoints(0, 159, 384, 435, 500, 644, 677, 799, 950, 1280, 1280, 0);
        poligono.setYpoints(571, 564, 624, 650, 625, 593, 594, 644, 565, 544, 720, 720);
        poligonos.add(poligono);

        // Montaña 4 Izquierda
        poligono = new Poligonos(); // 63
        poligono.setColor(AzulD);
        poligono.setXpoints(53, 0, 0, 45);
        poligono.setYpoints(284, 312, 329, 345);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 64
        poligono.setColor(AzulE);
        poligono.setXpoints(53, 45, 107);
        poligono.setYpoints(284, 345, 368);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 65
        poligono.setColor(AzulD);
        poligono.setXpoints(53, 107, 149);
        poligono.setYpoints(284, 368, 346);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 66
        poligono.setColor(AzulE);
        poligono.setXpoints(53, 164, 203);
        poligono.setYpoints(284, 357, 344);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 67
        poligono.setColor(AzulD);
        poligono.setXpoints(268, 185, 215);
        poligono.setYpoints(323, 350, 384);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 68
        poligono.setColor(AzulE);
        poligono.setXpoints(268, 215, 287);
        poligono.setYpoints(323, 384, 394);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 69
        poligono.setColor(AzulD);
        poligono.setXpoints(268, 287, 339);
        poligono.setYpoints(323, 394, 358);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 70
        poligono.setColor(AzulE);
        poligono.setXpoints(414, 333, 401);
        poligono.setYpoints(328, 360, 387);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 71
        poligono.setColor(AzulD);
        poligono.setXpoints(414, 401, 482);
        poligono.setYpoints(328, 387, 403);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 72
        poligono.setColor(AzulE);
        poligono.setXpoints(414, 482, 499);
        poligono.setYpoints(328, 403, 390);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 73
        poligono.setColor(AzulD);
        poligono.setXpoints(519, 454, 495);
        poligono.setYpoints(344, 357, 395);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 74
        poligono.setColor(AzulE);
        poligono.setXpoints(519, 495, 563);
        poligono.setYpoints(344, 395, 389);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 75
        poligono.setColor(AzulD);
        poligono.setXpoints(569, 531, 555);
        poligono.setYpoints(347, 357, 385);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 76
        poligono.setColor(AzulE);
        poligono.setXpoints(569, 555, 606);
        poligono.setYpoints(347, 385, 407);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 77
        poligono.setColor(AzulD);
        poligono.setXpoints(569, 606, 700);
        poligono.setYpoints(347, 407, 442);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 78
        poligono.setColor(AzulE);
        poligono.setXpoints(569, 700, 718);
        poligono.setYpoints(347, 442, 434);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 79
        poligono.setColor(AzulD);
        poligono.setXpoints(671, 614, 659);
        poligono.setYpoints(353, 373, 403);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 80
        poligono.setColor(AzulE);
        poligono.setXpoints(671, 659, 715);
        poligono.setYpoints(353, 403, 434);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 81
        poligono.setColor(AzulD);
        poligono.setXpoints(671, 715, 742);
        poligono.setYpoints(353, 434, 424);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 82
        poligono.setColor(AzulE);
        poligono.setXpoints(671, 742, 769);
        poligono.setYpoints(353, 424, 414);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 83
        poligono.setColor(AzulD);
        poligono.setXpoints(800, 723, 765);
        poligono.setYpoints(352, 385, 413);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 84
        poligono.setColor(AzulE);
        poligono.setXpoints(800, 765, 820);
        poligono.setYpoints(352, 413, 396);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 85
        poligono.setColor(AzulD);
        poligono.setXpoints(800, 820, 892);
        poligono.setYpoints(352, 396, 399);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 86
        poligono.setColor(AzulE);
        poligono.setXpoints(1230, 1280, 1280, 1261);
        poligono.setYpoints(280, 294, 311, 322);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 87
        poligono.setColor(AzulD);
        poligono.setXpoints(1230, 1261, 1189);
        poligono.setYpoints(280, 322, 353);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 88
        poligono.setColor(AzulE);
        poligono.setXpoints(1230, 1189, 1131);
        poligono.setYpoints(280, 374, 362);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 89
        poligono.setColor(AzulD);
        poligono.setXpoints(1230, 1131, 1084);
        poligono.setYpoints(280, 362, 343);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 90
        poligono.setColor(AzulE);
        poligono.setXpoints(1028, 1156, 1113);
        poligono.setYpoints(318, 367, 384);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 91
        poligono.setColor(AzulD);
        poligono.setXpoints(1028, 1113, 1034);
        poligono.setYpoints(318, 384, 391);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 92
        poligono.setColor(AzulE);
        poligono.setXpoints(1028, 1034, 910);
        poligono.setYpoints(318, 391, 380);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 93
        poligono.setColor(AzulD);
        poligono.setXpoints(980, 1075, 1033);
        poligono.setYpoints(324, 375, 392);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 94
        poligono.setColor(AzulE);
        poligono.setXpoints(980, 1033, 982);
        poligono.setYpoints(324, 392, 412);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 95
        poligono.setColor(AzulD);
        poligono.setXpoints(980, 982, 916);
        poligono.setYpoints(324, 412, 409);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 96
        poligono.setColor(AzulE);
        poligono.setXpoints(980, 916, 874);
        poligono.setYpoints(324, 409, 368);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 97
        poligono.setColor(AzulD);
        poligono.setXpoints(868, 924, 869);
        poligono.setYpoints(353, 405, 399);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 98
        poligono.setColor(AzulE);
        poligono.setXpoints(868, 869, 826);
        poligono.setYpoints(353, 399, 372);
        poligonos.add(poligono);

//        poligono = new Poligonos(); // 63
//        poligono.setColor(AzulD);
//        poligono.setXpoints();
//        poligono.setYpoints();
//        poligonos.add(poligono);
        // Montaña 1 Derecha
        //<editor-fold defaultstate="collapsed" desc="Montaña 1 Derecha">
        poligono = new Poligonos(); // 49
        poligono.setColor(VerdeA);
        poligono.setXpoints(887, 974, 966);
        poligono.setYpoints(533, 498, 541);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 50
        poligono.setColor(VerdeB);
        poligono.setXpoints(887, 966, 945);
        poligono.setYpoints(533, 541, 629);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 51
        poligono.setColor(VerdeB);
        poligono.setXpoints(974, 966, 1027);
        poligono.setYpoints(498, 541, 547);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 52
        poligono.setColor(VerdeA);
        poligono.setXpoints(945, 966, 1027);
        poligono.setYpoints(629, 541, 547);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 53
        poligono.setColor(VerdeA);
        poligono.setXpoints(974, 1027, 1131);
        poligono.setYpoints(498, 547, 506);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 56
        poligono.setColor(VerdeB);
        poligono.setXpoints(1131, 1027, 1201);
        poligono.setYpoints(506, 547, 548);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 57
        poligono.setColor(VerdeB);
        poligono.setXpoints(974, 1131, 1056);
        poligono.setYpoints(498, 506, 474);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 61
        poligono.setColor(VerdeA);
        poligono.setXpoints(1131, 1201, 1280);
        poligono.setYpoints(506, 548, 506);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 54
        poligono.setColor(VerdeB);
        poligono.setXpoints(945, 1027, 1097);
        poligono.setYpoints(629, 547, 596);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 55
        poligono.setColor(VerdeA);
        poligono.setXpoints(1097, 1027, 1201, 1280);
        poligono.setYpoints(596, 547, 548, 584);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 62
        poligono.setColor(VerdeB);
        poligono.setXpoints(1280, 1280, 1201);
        poligono.setYpoints(506, 584, 548);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 59
        poligono.setColor(VerdeB);
        poligono.setXpoints(1131, 1162, 1221, 1280);
        poligono.setYpoints(506, 473, 448, 506);
        poligonos.add(poligono);
//</editor-fold>

        // Montaña 2 Derecha
        //<editor-fold defaultstate="collapsed" desc="Montana 2 Derecha">
        poligono = new Poligonos(); // 37
        poligono.setColor(AzulA);
        poligono.setXpoints(835, 728, 749, 783, 813);
        poligono.setYpoints(450, 491, 500, 495, 506);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 38
        poligono.setColor(AzulB);
        poligono.setXpoints(835, 813, 831, 878);
        poligono.setYpoints(450, 506, 498, 511);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 39
        poligono.setColor(AzulA);
        poligono.setXpoints(835, 878, 910, 930, 974);
        poligono.setYpoints(450, 511, 504, 517, 498);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 40
        poligono.setColor(AzulB);
        poligono.setXpoints(872, 964, 974);
        poligono.setYpoints(465, 423, 498);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 41
        poligono.setColor(AzulA);
        poligono.setXpoints(964, 998, 1063, 974);
        poligono.setYpoints(423, 435, 408, 498);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 42
        poligono.setColor(AzulB);
        poligono.setXpoints(1063, 974, 1056);
        poligono.setYpoints(408, 498, 474);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 43
        poligono.setColor(AzulA);
        poligono.setXpoints(1056, 1063, 1121, 1090);
        poligono.setYpoints(474, 408, 384, 488);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 44
        poligono.setColor(AzulB);
        poligono.setXpoints(1090, 1121, 1179);
        poligono.setYpoints(488, 384, 408);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 45
        poligono.setColor(AzulA);
        poligono.setXpoints(1090, 1179, 1162, 1131);
        poligono.setYpoints(488, 408, 473, 506);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 46
        poligono.setColor(AzulB);
        poligono.setXpoints(1179, 1221, 1162);
        poligono.setYpoints(408, 448, 473);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 47
        poligono.setColor(AzulA);
        poligono.setXpoints(1179, 1280, 1230);
        poligono.setYpoints(408, 506, 385);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 48
        poligono.setColor(AzulB);
        poligono.setXpoints(1230, 1262, 1280, 1280);
        poligono.setYpoints(385, 393, 386, 506);
        poligonos.add(poligono);
//</editor-fold>

        // Montaña 3 Izquierda
        //<editor-fold defaultstate="collapsed" desc="Montaña 3 Izquierda">
        poligono = new Poligonos(); // 1
        poligono.setColor(AzulA);
        poligono.setXpoints(0, 35, 0);
        poligono.setYpoints(389, 401, 450);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 2
        poligono.setColor(AzulB);
        poligono.setXpoints(0, 35, 94, 0);
        poligono.setYpoints(450, 401, 471, 511);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 3
        poligono.setColor(AzulB);
        poligono.setXpoints(82, 111, 193);
        poligono.setYpoints(403, 490, 404);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 4
        poligono.setColor(AzulA);
        poligono.setXpoints(111, 193, 215);
        poligono.setYpoints(490, 404, 447);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 5
        poligono.setColor(AzulA);
        poligono.setXpoints(306, 82, 205);
        poligono.setYpoints(404, 403, 356);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 6
        poligono.setColor(AzulB);
        poligono.setXpoints(193, 215, 306);
        poligono.setYpoints(404, 447, 404);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 7
        poligono.setColor(AzulA);
        poligono.setXpoints(215, 286, 323);
        poligono.setYpoints(447, 494, 397);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 8
        poligono.setColor(AzulB);
        poligono.setXpoints(323, 286, 382);
        poligono.setYpoints(397, 494, 421);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 9
        poligono.setColor(AzulA);
        poligono.setXpoints(382, 286, 332, 407);
        poligono.setYpoints(421, 494, 524, 501);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 10
        poligono.setColor(AzulB);
        poligono.setXpoints(407, 528, 382);
        poligono.setYpoints(501, 482, 421);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 11
        poligono.setColor(AzulA);
        poligono.setXpoints(35, 111, 82, 52);
        poligono.setYpoints(401, 490, 403, 395);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 26
        poligono.setColor(AzulA);
        poligono.setXpoints(528, 557, 587);
        poligono.setYpoints(482, 468, 498);
        poligonos.add(poligono);
//</editor-fold>

        // Montaña 3 Izquierda
        //<editor-fold defaultstate="collapsed" desc="Montaña 3 Izquierda">
        poligono = new Poligonos(); // 12
        poligono.setColor(AzulC);
        poligono.setXpoints(0, 0, 35);
        poligono.setYpoints(329, 389, 401);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 13
        poligono.setColor(AzulD);
        poligono.setXpoints(0, 35, 115);
        poligono.setYpoints(329, 401, 371);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 14
        poligono.setColor(AzulC);
        poligono.setXpoints(35, 115, 142, 82);
        poligono.setYpoints(401, 370, 380, 403);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 15
        poligono.setColor(AzulD);
        poligono.setXpoints(107, 142, 159);
        poligono.setYpoints(368, 380, 341);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 16
        poligono.setColor(AzulC);
        poligono.setXpoints(142, 159, 205);
        poligono.setYpoints(380, 341, 356);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 17
        poligono.setColor(AzulC);
        poligono.setXpoints(251, 327, 323, 306);
        poligono.setYpoints(379, 348, 397, 404);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 18
        poligono.setColor(AzulD);
        poligono.setXpoints(323, 327, 402, 413);
        poligono.setYpoints(397, 348, 378, 435);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 19
        poligono.setColor(AzulC);
        poligono.setXpoints(402, 413, 479, 419);
        poligono.setYpoints(378, 435, 402, 371);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 20
        poligono.setColor(AzulD);
        poligono.setXpoints(413, 528, 529);
        poligono.setYpoints(435, 482, 373);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 21
        poligono.setColor(AzulC);
        poligono.setXpoints(528, 529, 568, 629);
        poligono.setYpoints(482, 373, 433, 438);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 22
        poligono.setColor(AzulD);
        poligono.setXpoints(529, 568, 697);
        poligono.setYpoints(373, 433, 439);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 23
        poligono.setColor(AzulD);
        poligono.setXpoints(557, 629, 697);
        poligono.setYpoints(468, 438, 468);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 24
        poligono.setColor(AzulD);
        poligono.setXpoints(697, 697, 820, 736);
        poligono.setYpoints(468, 439, 392, 458);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 27
        poligono.setColor(AzulC);
        poligono.setXpoints(697, 697, 629);
        poligono.setYpoints(468, 439, 438);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 25
        poligono.setColor(AzulC);
        poligono.setXpoints(736, 820, 816);
        poligono.setYpoints(458, 392, 482);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 28
        poligono.setColor(AzulD);
        poligono.setXpoints(816, 835, 872, 820);
        poligono.setYpoints(457, 450, 465, 392);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 29
        poligono.setColor(AzulC);
        poligono.setXpoints(820, 872, 927, 873, 848);
        poligono.setYpoints(392, 465, 403, 385, 395);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 30
        poligono.setColor(AzulD);
        poligono.setXpoints(927, 953, 983, 964, 872);
        poligono.setYpoints(403, 390, 409, 423, 465);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 31
        poligono.setColor(AzulC);
        poligono.setXpoints(964, 983, 1076, 998);
        poligono.setYpoints(423, 409, 370, 435);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 32
        poligono.setColor(AzulD);
        poligono.setXpoints(998, 1076, 1121);
        poligono.setYpoints(435, 370, 384);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 33
        poligono.setColor(AzulC);
        poligono.setXpoints(1110, 1179, 1187);
        poligono.setYpoints(380, 408, 349);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 34
        poligono.setColor(AzulD);
        poligono.setXpoints(1187, 1179, 1230);
        poligono.setYpoints(349, 408, 385);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 35
        poligono.setColor(AzulC);
        poligono.setXpoints(1230, 1187, 1280, 1280, 1262);
        poligono.setYpoints(385, 349, 349, 388, 393);
        poligonos.add(poligono);

        poligono = new Poligonos(); // 36
        poligono.setColor(AzulD);
        poligono.setXpoints(1187, 1280, 1280);
        poligono.setYpoints(349, 311, 349);
        poligonos.add(poligono);
//</editor-fold>

        // Pintar poligonos generados
        Poligonos poligonoActual;
        for (int i = 0; i < poligonos.size(); i++) {
            poligonoActual = poligonos.get(i);
            g.setColor(poligonoActual.color);
            g.fillPolygon(poligonoActual.xpoints, poligonoActual.ypoints, poligonoActual.sides);
        }

    }

}
