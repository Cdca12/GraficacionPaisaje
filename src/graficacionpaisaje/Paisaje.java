package graficacionpaisaje;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

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
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(120, 213, 247));
        add(p1);

        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        Graphics2D g = (Graphics2D) graphics;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        ArrayList<Poligono> poligonos = new ArrayList<>();
        Poligono poligono;

        // Paleta de colores
        Color AzulA = new Color(14, 58, 87);
        Color AzulB = new Color(10, 40, 61);
        Color AzulC = new Color(18, 74, 109);
        Color AzulD = new Color(15, 63, 91);
        Color AzulE = new Color(16, 70, 103);
        Color AzulF = new Color(27, 113, 170);
        Color AzulG = new Color(22, 94, 141);
        Color AzulH = new Color(26, 102, 154);
        Color AzulI = new Color(21, 86, 130);
        Color AzulJ = new Color(30, 125, 205);
        Color AzulK = new Color(23, 98, 159);

        Color AzulL = new Color(10, 41, 59);
        Color AzulM = new Color(7, 32, 46);

        Color VerdeA = new Color(10, 41, 59);
        Color VerdeB = new Color(7, 30, 44);
        Color VerdeC = new Color(9, 16, 26);

        Color Agua = new Color(63, 138, 193);

        Color SolA = new Color(215, 235, 184);
        Color SolB = new Color(233, 238, 171);
        Color SolC = new Color(242, 240, 157);
        Color[] coloresSol = {SolA, SolB, SolC};

        Color Reflejo = new Color(215, 235, 184, 100);

        Color CamisaPersona = new Color(240, 0, 0);
        Color CabezaPersona = new Color(255, 165, 121);

        Color Barquito = new Color(125, 82, 49);

        Color Pino = new Color(10, 18, 29);

        // Dibujar Sol
        Patrones.drawSun(g, coloresSol, 660, 150, 200, 200);

        // Pintar nubes
        Circulo circulo = new Circulo(40, 40); // Nube 1
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(1250);
        circulo.setYpoints(215);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 2
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(1240);
        circulo.setYpoints(235);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 3
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(1250);
        circulo.setYpoints(255);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 4
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(1240);
        circulo.setYpoints(255);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 4
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(1210);
        circulo.setYpoints(255);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 5
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(1180);
        circulo.setYpoints(255);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 6
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(1180);
        circulo.setYpoints(285);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 7
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(1160);
        circulo.setYpoints(285);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 7
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(1130);
        circulo.setYpoints(305);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 8
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(1100);
        circulo.setYpoints(305);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 9
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(1070);
        circulo.setYpoints(305);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 10
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(1040);
        circulo.setYpoints(305);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 11
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(1010);
        circulo.setYpoints(305);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 12
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(1055);
        circulo.setYpoints(290);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 13
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(0);
        circulo.setYpoints(270);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 14
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(30);
        circulo.setYpoints(270);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 15
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(60);
        circulo.setYpoints(270);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 16
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(90);
        circulo.setYpoints(290);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 16
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(120);
        circulo.setYpoints(300);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 16
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(185);
        circulo.setYpoints(310);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 17
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(0);
        circulo.setYpoints(250);
        circulo.drawCircle(g);

        circulo = new Circulo(40, 40); // Nube 18
        circulo.setColor(Color.WHITE);
        circulo.setXpoints(0);
        circulo.setYpoints(230);
        circulo.drawCircle(g);

        // Generar agua
        poligono = new Poligono(); // 152 - Agua
        poligono.setColor(Agua);
        poligono.setXpoints(218, 218, 1010, 1010);
        poligono.setYpoints(449, 693, 693, 449);
        poligonos.add(poligono);

        // Generar poligonos
        // Montaña 7 Abajo Izquierda
        poligono = new Poligono(); // 147
        poligono.setColor(AzulL);
        poligono.setXpoints(271, 402, 356, 298);
        poligono.setYpoints(515, 563, 620, 614);
        poligonos.add(poligono);

        poligono = new Poligono(); // 148
        poligono.setColor(AzulM);
        poligono.setXpoints(298, 271, 234, 172);
        poligono.setYpoints(614, 515, 510, 570);
        poligonos.add(poligono);

        poligono = new Poligono(); // 149
        poligono.setColor(AzulL);
        poligono.setXpoints(234, 172, 110);
        poligono.setYpoints(509, 570, 491);
        poligonos.add(poligono);

        poligono = new Poligono(); // 150
        poligono.setColor(AzulM);
        poligono.setXpoints(94, 172, 57);
        poligono.setYpoints(471, 570, 576);
        poligonos.add(poligono);

        poligono = new Poligono(); // 151
        poligono.setColor(AzulL);
        poligono.setXpoints(94, 57, 0, 0);
        poligono.setYpoints(471, 576, 547, 509);
        poligonos.add(poligono);

        // Montaña 6 Arriba
        poligono = new Poligono(); // 122
        poligono.setColor(AzulJ);
        poligono.setXpoints(1163, 1185, 1117);
        poligono.setYpoints(297, 326, 323);
        poligonos.add(poligono);

        poligono = new Poligono(); // 123
        poligono.setColor(AzulK);
        poligono.setXpoints(1121, 1145, 1112);
        poligono.setYpoints(309, 323, 334);
        poligonos.add(poligono);

        poligono = new Poligono(); // 124
        poligono.setColor(AzulJ);
        poligono.setXpoints(1121, 1112, 1072);
        poligono.setYpoints(309, 334, 334);
        poligonos.add(poligono);

        poligono = new Poligono(); // 125
        poligono.setColor(AzulK);
        poligono.setXpoints(948, 1113, 1066);
        poligono.setYpoints(276, 336, 358);
        poligonos.add(poligono);

        poligono = new Poligono(); // 126
        poligono.setColor(AzulJ);
        poligono.setXpoints(948, 1066, 994);
        poligono.setYpoints(276, 358, 373);
        poligonos.add(poligono);

        poligono = new Poligono(); // 127
        poligono.setColor(AzulK);
        poligono.setXpoints(948, 994, 929);
        poligono.setYpoints(276, 373, 325);
        poligonos.add(poligono);

        poligono = new Poligono(); // 128
        poligono.setColor(AzulJ);
        poligono.setXpoints(948, 929, 891);
        poligono.setYpoints(276, 325, 304);
        poligonos.add(poligono);

        poligono = new Poligono(); // 129
        poligono.setColor(AzulJ);
        poligono.setXpoints(883, 953, 909);
        poligono.setYpoints(297, 322, 341);
        poligonos.add(poligono);

        poligono = new Poligono(); // 130
        poligono.setColor(AzulK);
        poligono.setXpoints(883, 909, 837);
        poligono.setYpoints(297, 341, 357);
        poligonos.add(poligono);

        poligono = new Poligono(); // 131
        poligono.setColor(AzulJ);
        poligono.setXpoints(883, 837, 838);
        poligono.setYpoints(297, 357, 315);
        poligonos.add(poligono);

        poligono = new Poligono(); // 132
        poligono.setColor(AzulK);
        poligono.setXpoints(801, 890, 845);
        poligono.setYpoints(293, 337, 355);
        poligonos.add(poligono);

        poligono = new Poligono(); // 133
        poligono.setColor(AzulJ);
        poligono.setXpoints(801, 845, 794);
        poligono.setYpoints(293, 355, 340);
        poligonos.add(poligono);

        poligono = new Poligono(); // 134
        poligono.setColor(AzulK);
        poligono.setXpoints(801, 794, 778);
        poligono.setYpoints(293, 340, 309);
        poligonos.add(poligono);

        poligono = new Poligono(); // 135
        poligono.setColor(AzulJ);
        poligono.setXpoints(377, 459, 440);
        poligono.setYpoints(284, 323, 328);
        poligonos.add(poligono);

        poligono = new Poligono(); // 136
        poligono.setColor(AzulK);
        poligono.setXpoints(377, 440, 390);
        poligono.setYpoints(284, 328, 345);
        poligonos.add(poligono);

        poligono = new Poligono(); // 137
        poligono.setColor(AzulJ);
        poligono.setXpoints(377, 390, 361);
        poligono.setYpoints(284, 345, 294);
        poligonos.add(poligono);

        poligono = new Poligono(); // 138
        poligono.setColor(AzulK);
        poligono.setXpoints(322, 435, 414);
        poligono.setYpoints(272, 329, 338);
        poligonos.add(poligono);

        poligono = new Poligono(); // 139
        poligono.setColor(AzulJ);
        poligono.setXpoints(322, 414, 376);
        poligono.setYpoints(272, 338, 349);
        poligonos.add(poligono);

        poligono = new Poligono(); // 140
        poligono.setColor(AzulK);
        poligono.setXpoints(322, 376, 335);
        poligono.setYpoints(272, 349, 363);
        poligonos.add(poligono);

        poligono = new Poligono(); // 141
        poligono.setColor(AzulJ);
        poligono.setXpoints(322, 335, 260);
        poligono.setYpoints(272, 363, 358);
        poligonos.add(poligono);

        poligono = new Poligono(); // 142
        poligono.setColor(AzulK);
        poligono.setXpoints(322, 260, 221);
        poligono.setYpoints(272, 358, 340);
        poligonos.add(poligono);

        poligono = new Poligono(); // 143
        poligono.setColor(AzulJ);
        poligono.setXpoints(322, 221, 200);
        poligono.setYpoints(272, 340, 325);
        poligonos.add(poligono);

        poligono = new Poligono(); // 144
        poligono.setColor(AzulK);
        poligono.setXpoints(173, 223, 213);
        poligono.setYpoints(305, 340, 345);
        poligonos.add(poligono);

        poligono = new Poligono(); // 145
        poligono.setColor(AzulJ);
        poligono.setXpoints(173, 213, 174);
        poligono.setYpoints(305, 345, 359);
        poligonos.add(poligono);

        poligono = new Poligono(); // 146
        poligono.setColor(AzulK);
        poligono.setXpoints(173, 174, 123);
        poligono.setYpoints(305, 359, 350);
        poligonos.add(poligono);

        poligono = new Poligono(); // 146
        poligono.setColor(AzulK);
        poligono.setXpoints();
        poligono.setYpoints();
        poligonos.add(poligono);

        // Montaña 5 Arriba Derecha
        poligono = new Poligono(); // 100
        poligono.setColor(AzulF);
        poligono.setXpoints(955, 979, 919);
        poligono.setYpoints(318, 330, 350);
        poligonos.add(poligono);

        poligono = new Poligono(); // 101
        poligono.setColor(AzulG);
        poligono.setXpoints(955, 919, 896);
        poligono.setYpoints(318, 350, 341);
        poligonos.add(poligono);

        poligono = new Poligono(); // 102
        poligono.setColor(AzulF);
        poligono.setXpoints(853, 925, 904);
        poligono.setYpoints(320, 351, 358);
        poligonos.add(poligono);

        poligono = new Poligono(); // 103
        poligono.setColor(AzulG);
        poligono.setXpoints(853, 904, 838);
        poligono.setYpoints(320, 358, 335);
        poligonos.add(poligono);

        poligono = new Poligono(); // 104
        poligono.setColor(AzulF);
        poligono.setXpoints(653, 906, 878);
        poligono.setYpoints(252, 359, 371);
        poligonos.add(poligono);

        poligono = new Poligono(); // 105
        poligono.setColor(AzulG);
        poligono.setXpoints(653, 878, 823);
        poligono.setYpoints(252, 371, 377);
        poligonos.add(poligono);

        poligono = new Poligono(); // 106
        poligono.setColor(AzulF);
        poligono.setXpoints(653, 823, 766);
        poligono.setYpoints(252, 377, 393);
        poligonos.add(poligono);

        poligono = new Poligono(); // 107
        poligono.setColor(AzulG);
        poligono.setXpoints(653, 766, 705);
        poligono.setYpoints(252, 393, 396);
        poligonos.add(poligono);

        poligono = new Poligono(); // 108
        poligono.setColor(AzulF);
        poligono.setXpoints(653, 705, 662, 665, 659);
        poligono.setYpoints(252, 396, 377, 344, 343);
        poligonos.add(poligono);

        // Montaña 6 Arriba Izquierda
        poligono = new Poligono(); // 109
        poligono.setColor(AzulI);
        poligono.setXpoints(645, 653, 705, 649);
        poligono.setYpoints(248, 252, 396, 364);
        poligonos.add(poligono);

        poligono = new Poligono(); // 110
        poligono.setColor(AzulH);
        poligono.setXpoints(645, 649, 623);
        poligono.setYpoints(248, 364, 340);
        poligonos.add(poligono);

        poligono = new Poligono(); // 111
        poligono.setColor(AzulI);
        poligono.setXpoints(645, 623, 579);
        poligono.setYpoints(248, 340, 320);
        poligonos.add(poligono);

        poligono = new Poligono(); // 112
        poligono.setColor(AzulH);
        poligono.setXpoints(645, 579, 541);
        poligono.setYpoints(248, 320, 299);
        poligonos.add(poligono);

        poligono = new Poligono(); // 113
        poligono.setColor(AzulI);
        poligono.setXpoints(523, 666, 625);
        poligono.setYpoints(286, 357, 373);
        poligonos.add(poligono);

        poligono = new Poligono(); // 114
        poligono.setColor(AzulH);
        poligono.setXpoints(523, 625, 578);
        poligono.setYpoints(286, 373, 383);
        poligonos.add(poligono);

        poligono = new Poligono(); // 115
        poligono.setColor(AzulI);
        poligono.setXpoints(523, 578, 532);
        poligono.setYpoints(286, 383, 376);
        poligonos.add(poligono);

        poligono = new Poligono(); // 116
        poligono.setColor(AzulH);
        poligono.setXpoints(523, 532, 487);
        poligono.setYpoints(286, 376, 365);
        poligonos.add(poligono);

        poligono = new Poligono(); // 117
        poligono.setColor(AzulI);
        poligono.setXpoints(523, 487, 429);
        poligono.setYpoints(286, 365, 362);
        poligonos.add(poligono);

        poligono = new Poligono(); // 118
        poligono.setColor(AzulH);
        poligono.setXpoints(523, 429, 410);
        poligono.setYpoints(286, 362, 336);
        poligonos.add(poligono);

        poligono = new Poligono(); // 119
        poligono.setColor(AzulI);
        poligono.setXpoints(377, 411, 294);
        poligono.setYpoints(323, 395, 379);
        poligonos.add(poligono);

        poligono = new Poligono(); // 120
        poligono.setColor(AzulG);
        poligono.setXpoints(653, 665, 643, 647, 641);
        poligono.setYpoints(252, 344, 336, 292, 292);
        poligonos.add(poligono);

        poligono = new Poligono(); // 121
        poligono.setColor(AzulF);
        poligono.setXpoints(653, 641, 625);
        poligono.setYpoints(252, 292, 292);
        poligonos.add(poligono);

        // Montaña 4 Izquierda
        poligono = new Poligono(); // 63
        poligono.setColor(AzulD);
        poligono.setXpoints(53, 0, 0, 45);
        poligono.setYpoints(284, 312, 329, 345);
        poligonos.add(poligono);

        poligono = new Poligono(); // 64
        poligono.setColor(AzulE);
        poligono.setXpoints(53, 45, 107);
        poligono.setYpoints(284, 345, 368);
        poligonos.add(poligono);

        poligono = new Poligono(); // 65
        poligono.setColor(AzulD);
        poligono.setXpoints(53, 107, 149);
        poligono.setYpoints(284, 368, 346);
        poligonos.add(poligono);

        poligono = new Poligono(); // 66
        poligono.setColor(AzulE);
        poligono.setXpoints(53, 164, 203);
        poligono.setYpoints(284, 357, 344);
        poligonos.add(poligono);

        poligono = new Poligono(); // 67
        poligono.setColor(AzulD);
        poligono.setXpoints(268, 185, 215);
        poligono.setYpoints(323, 350, 384);
        poligonos.add(poligono);

        poligono = new Poligono(); // 68
        poligono.setColor(AzulE);
        poligono.setXpoints(268, 215, 287);
        poligono.setYpoints(323, 384, 394);
        poligonos.add(poligono);

        poligono = new Poligono(); // 69
        poligono.setColor(AzulD);
        poligono.setXpoints(268, 287, 339);
        poligono.setYpoints(323, 394, 358);
        poligonos.add(poligono);

        poligono = new Poligono(); // 70
        poligono.setColor(AzulE);
        poligono.setXpoints(414, 333, 401);
        poligono.setYpoints(328, 360, 387);
        poligonos.add(poligono);

        poligono = new Poligono(); // 71
        poligono.setColor(AzulD);
        poligono.setXpoints(414, 401, 482);
        poligono.setYpoints(328, 387, 403);
        poligonos.add(poligono);

        poligono = new Poligono(); // 72
        poligono.setColor(AzulE);
        poligono.setXpoints(414, 482, 499);
        poligono.setYpoints(328, 403, 390);
        poligonos.add(poligono);

        poligono = new Poligono(); // 73
        poligono.setColor(AzulD);
        poligono.setXpoints(519, 454, 495);
        poligono.setYpoints(344, 357, 395);
        poligonos.add(poligono);

        poligono = new Poligono(); // 74
        poligono.setColor(AzulE);
        poligono.setXpoints(519, 495, 563);
        poligono.setYpoints(344, 395, 389);
        poligonos.add(poligono);

        poligono = new Poligono(); // 75
        poligono.setColor(AzulD);
        poligono.setXpoints(569, 531, 555);
        poligono.setYpoints(347, 357, 385);
        poligonos.add(poligono);

        poligono = new Poligono(); // 76
        poligono.setColor(AzulE);
        poligono.setXpoints(569, 555, 606);
        poligono.setYpoints(347, 385, 407);
        poligonos.add(poligono);

        poligono = new Poligono(); // 77
        poligono.setColor(AzulD);
        poligono.setXpoints(569, 606, 700);
        poligono.setYpoints(347, 407, 442);
        poligonos.add(poligono);

        poligono = new Poligono(); // 78
        poligono.setColor(AzulE);
        poligono.setXpoints(569, 700, 718);
        poligono.setYpoints(347, 442, 434);
        poligonos.add(poligono);

        poligono = new Poligono(); // 79
        poligono.setColor(AzulD);
        poligono.setXpoints(671, 614, 659);
        poligono.setYpoints(353, 373, 403);
        poligonos.add(poligono);

        poligono = new Poligono(); // 80
        poligono.setColor(AzulE);
        poligono.setXpoints(671, 659, 715);
        poligono.setYpoints(353, 403, 434);
        poligonos.add(poligono);

        poligono = new Poligono(); // 81
        poligono.setColor(AzulD);
        poligono.setXpoints(671, 715, 742);
        poligono.setYpoints(353, 434, 424);
        poligonos.add(poligono);

        poligono = new Poligono(); // 82
        poligono.setColor(AzulE);
        poligono.setXpoints(671, 742, 769);
        poligono.setYpoints(353, 424, 414);
        poligonos.add(poligono);

        poligono = new Poligono(); // 83
        poligono.setColor(AzulD);
        poligono.setXpoints(800, 723, 765);
        poligono.setYpoints(352, 385, 413);
        poligonos.add(poligono);

        poligono = new Poligono(); // 84
        poligono.setColor(AzulE);
        poligono.setXpoints(800, 765, 820);
        poligono.setYpoints(352, 413, 396);
        poligonos.add(poligono);

        poligono = new Poligono(); // 85
        poligono.setColor(AzulD);
        poligono.setXpoints(800, 820, 892);
        poligono.setYpoints(352, 396, 399);
        poligonos.add(poligono);

        poligono = new Poligono(); // 86
        poligono.setColor(AzulE);
        poligono.setXpoints(1230, 1280, 1280, 1261);
        poligono.setYpoints(280, 294, 311, 322);
        poligonos.add(poligono);

        poligono = new Poligono(); // 87
        poligono.setColor(AzulD);
        poligono.setXpoints(1230, 1261, 1189);
        poligono.setYpoints(280, 322, 353);
        poligonos.add(poligono);

        poligono = new Poligono(); // 88
        poligono.setColor(AzulE);
        poligono.setXpoints(1230, 1189, 1131);
        poligono.setYpoints(280, 374, 362);
        poligonos.add(poligono);

        poligono = new Poligono(); // 89
        poligono.setColor(AzulD);
        poligono.setXpoints(1230, 1131, 1084);
        poligono.setYpoints(280, 362, 343);
        poligonos.add(poligono);

        poligono = new Poligono(); // 90
        poligono.setColor(AzulE);
        poligono.setXpoints(1028, 1156, 1113);
        poligono.setYpoints(318, 367, 384);
        poligonos.add(poligono);

        poligono = new Poligono(); // 91
        poligono.setColor(AzulD);
        poligono.setXpoints(1028, 1113, 1034);
        poligono.setYpoints(318, 384, 391);
        poligonos.add(poligono);

        poligono = new Poligono(); // 92
        poligono.setColor(AzulE);
        poligono.setXpoints(1028, 1034, 910);
        poligono.setYpoints(318, 391, 380);
        poligonos.add(poligono);

        poligono = new Poligono(); // 93
        poligono.setColor(AzulD);
        poligono.setXpoints(980, 1075, 1033);
        poligono.setYpoints(324, 375, 392);
        poligonos.add(poligono);

        poligono = new Poligono(); // 94
        poligono.setColor(AzulE);
        poligono.setXpoints(980, 1033, 982);
        poligono.setYpoints(324, 392, 412);
        poligonos.add(poligono);

        poligono = new Poligono(); // 95
        poligono.setColor(AzulD);
        poligono.setXpoints(980, 982, 916);
        poligono.setYpoints(324, 412, 409);
        poligonos.add(poligono);

        poligono = new Poligono(); // 96
        poligono.setColor(AzulE);
        poligono.setXpoints(980, 916, 874);
        poligono.setYpoints(324, 409, 368);
        poligonos.add(poligono);

        poligono = new Poligono(); // 97
        poligono.setColor(AzulD);
        poligono.setXpoints(868, 924, 869);
        poligono.setYpoints(353, 405, 399);
        poligonos.add(poligono);

        poligono = new Poligono(); // 98
        poligono.setColor(AzulE);
        poligono.setXpoints(868, 869, 826);
        poligono.setYpoints(353, 399, 372);
        poligonos.add(poligono);

        poligono = new Poligono(); // 99
        poligono.setColor(AzulE);
        poligono.setXpoints(14, 0, 0, 31);
        poligono.setYpoints(279, 287, 313, 296);
        poligonos.add(poligono);

        // Montaña 1 Derecha
        poligono = new Poligono(); // 49
        poligono.setColor(VerdeA);
        poligono.setXpoints(887, 974, 966);
        poligono.setYpoints(533, 498, 541);
        poligonos.add(poligono);

        poligono = new Poligono(); // 50
        poligono.setColor(VerdeB);
        poligono.setXpoints(887, 966, 945);
        poligono.setYpoints(533, 541, 629);
        poligonos.add(poligono);

        poligono = new Poligono(); // 51
        poligono.setColor(VerdeB);
        poligono.setXpoints(974, 966, 1027);
        poligono.setYpoints(498, 541, 547);
        poligonos.add(poligono);

        poligono = new Poligono(); // 52
        poligono.setColor(VerdeA);
        poligono.setXpoints(945, 966, 1027);
        poligono.setYpoints(629, 541, 547);
        poligonos.add(poligono);

        poligono = new Poligono(); // 53
        poligono.setColor(VerdeA);
        poligono.setXpoints(974, 1027, 1131);
        poligono.setYpoints(498, 547, 506);
        poligonos.add(poligono);

        poligono = new Poligono(); // 56
        poligono.setColor(VerdeB);
        poligono.setXpoints(1131, 1027, 1201);
        poligono.setYpoints(506, 547, 548);
        poligonos.add(poligono);

        poligono = new Poligono(); // 57
        poligono.setColor(VerdeB);
        poligono.setXpoints(974, 1131, 1056);
        poligono.setYpoints(498, 506, 474);
        poligonos.add(poligono);

        poligono = new Poligono(); // 61
        poligono.setColor(VerdeA);
        poligono.setXpoints(1131, 1201, 1280);
        poligono.setYpoints(506, 548, 506);
        poligonos.add(poligono);

        poligono = new Poligono(); // 54
        poligono.setColor(VerdeB);
        poligono.setXpoints(945, 1027, 1097);
        poligono.setYpoints(629, 547, 596);
        poligonos.add(poligono);

        poligono = new Poligono(); // 55
        poligono.setColor(VerdeA);
        poligono.setXpoints(1097, 1027, 1201, 1280);
        poligono.setYpoints(596, 547, 548, 584);
        poligonos.add(poligono);

        poligono = new Poligono(); // 62
        poligono.setColor(VerdeB);
        poligono.setXpoints(1280, 1280, 1201);
        poligono.setYpoints(506, 584, 548);
        poligonos.add(poligono);

        poligono = new Poligono(); // 59
        poligono.setColor(VerdeB);
        poligono.setXpoints(1131, 1162, 1221, 1280);
        poligono.setYpoints(506, 473, 448, 506);
        poligonos.add(poligono);

        // Montaña 2 Derecha
        poligono = new Poligono(); // 37
        poligono.setColor(AzulA);
        poligono.setXpoints(835, 728, 749, 783, 813);
        poligono.setYpoints(450, 491, 500, 495, 506);
        poligonos.add(poligono);

        poligono = new Poligono(); // 38
        poligono.setColor(AzulB);
        poligono.setXpoints(835, 813, 831, 878);
        poligono.setYpoints(450, 506, 498, 511);
        poligonos.add(poligono);

        poligono = new Poligono(); // 39
        poligono.setColor(AzulA);
        poligono.setXpoints(835, 878, 910, 930, 974);
        poligono.setYpoints(450, 511, 504, 517, 498);
        poligonos.add(poligono);

        poligono = new Poligono(); // 40
        poligono.setColor(AzulB);
        poligono.setXpoints(872, 964, 974);
        poligono.setYpoints(465, 423, 498);
        poligonos.add(poligono);

        poligono = new Poligono(); // 41
        poligono.setColor(AzulA);
        poligono.setXpoints(964, 998, 1063, 974);
        poligono.setYpoints(423, 435, 408, 498);
        poligonos.add(poligono);

        poligono = new Poligono(); // 42
        poligono.setColor(AzulB);
        poligono.setXpoints(1063, 974, 1056);
        poligono.setYpoints(408, 498, 474);
        poligonos.add(poligono);

        poligono = new Poligono(); // 43
        poligono.setColor(AzulA);
        poligono.setXpoints(1056, 1063, 1121, 1090);
        poligono.setYpoints(474, 408, 384, 490);
        poligonos.add(poligono);

        poligono = new Poligono(); // 44
        poligono.setColor(AzulB);
        poligono.setXpoints(1090, 1121, 1179);
        poligono.setYpoints(490, 384, 408);
        poligonos.add(poligono);

        poligono = new Poligono(); // 45
        poligono.setColor(AzulA);
        poligono.setXpoints(1090, 1179, 1162, 1131);
        poligono.setYpoints(490, 408, 473, 506);
        poligonos.add(poligono);

        poligono = new Poligono(); // 46
        poligono.setColor(AzulB);
        poligono.setXpoints(1179, 1221, 1162);
        poligono.setYpoints(408, 448, 473);
        poligonos.add(poligono);

        poligono = new Poligono(); // 47
        poligono.setColor(AzulA);
        poligono.setXpoints(1179, 1280, 1230);
        poligono.setYpoints(408, 506, 385);
        poligonos.add(poligono);

        poligono = new Poligono(); // 48
        poligono.setColor(AzulB);
        poligono.setXpoints(1230, 1262, 1280, 1280);
        poligono.setYpoints(385, 393, 386, 506);
        poligonos.add(poligono);

        // Montaña 3 Izquierda
        poligono = new Poligono(); // 1
        poligono.setColor(AzulA);
        poligono.setXpoints(0, 35, 0);
        poligono.setYpoints(389, 401, 450);
        poligonos.add(poligono);

        poligono = new Poligono(); // 2
        poligono.setColor(AzulB);
        poligono.setXpoints(0, 35, 94, 0);
        poligono.setYpoints(450, 401, 471, 511);
        poligonos.add(poligono);

        poligono = new Poligono(); // 3
        poligono.setColor(AzulB);
        poligono.setXpoints(82, 110, 193);
        poligono.setYpoints(403, 491, 404);
        poligonos.add(poligono);

        poligono = new Poligono(); // 4
        poligono.setColor(AzulA);
        poligono.setXpoints(110, 193, 215);
        poligono.setYpoints(491, 404, 447);
        poligonos.add(poligono);

        poligono = new Poligono(); // 5
        poligono.setColor(AzulA);
        poligono.setXpoints(310, 82, 205);
        poligono.setYpoints(406, 403, 356);
        poligonos.add(poligono);

        poligono = new Poligono(); // 6
        poligono.setColor(AzulB);
        poligono.setXpoints(193, 215, 310);
        poligono.setYpoints(404, 447, 406);
        poligonos.add(poligono);

        poligono = new Poligono(); // 7
        poligono.setColor(AzulA);
        poligono.setXpoints(215, 286, 322);
        poligono.setYpoints(447, 494, 397);
        poligonos.add(poligono);

        poligono = new Poligono(); // 152
        poligono.setColor(AzulM);
        poligono.setXpoints(110, 215, 332);
        poligono.setYpoints(491, 447, 524);
        poligonos.add(poligono);

        poligono = new Poligono(); // 8
        poligono.setColor(AzulB);
        poligono.setXpoints(322, 286, 382);
        poligono.setYpoints(397, 494, 421);
        poligonos.add(poligono);

        poligono = new Poligono(); // 9
        poligono.setColor(AzulA);
        poligono.setXpoints(382, 286, 332, 407);
        poligono.setYpoints(421, 494, 524, 501);
        poligonos.add(poligono);

        poligono = new Poligono(); // 10
        poligono.setColor(AzulB);
        poligono.setXpoints(407, 528, 382);
        poligono.setYpoints(501, 482, 421);
        poligonos.add(poligono);

        poligono = new Poligono(); // 11
        poligono.setColor(AzulA);
        poligono.setXpoints(35, 110, 82, 52);
        poligono.setYpoints(401, 491, 403, 395);
        poligonos.add(poligono);

        poligono = new Poligono(); // 26
        poligono.setColor(AzulA);
        poligono.setXpoints(528, 557, 587);
        poligono.setYpoints(482, 468, 498);
        poligonos.add(poligono);

        // Montaña 3 Izquierda
        poligono = new Poligono(); // 12
        poligono.setColor(AzulC);
        poligono.setXpoints(0, 0, 35);
        poligono.setYpoints(329, 389, 401);
        poligonos.add(poligono);

        poligono = new Poligono(); // 13
        poligono.setColor(AzulD);
        poligono.setXpoints(0, 35, 115);
        poligono.setYpoints(329, 401, 371);
        poligonos.add(poligono);

        poligono = new Poligono(); // 14
        poligono.setColor(AzulC);
        poligono.setXpoints(35, 115, 142, 82);
        poligono.setYpoints(401, 370, 380, 403);
        poligonos.add(poligono);

        poligono = new Poligono(); // 15
        poligono.setColor(AzulD);
        poligono.setXpoints(107, 142, 159);
        poligono.setYpoints(368, 380, 341);
        poligonos.add(poligono);

        poligono = new Poligono(); // 16
        poligono.setColor(AzulC);
        poligono.setXpoints(142, 159, 205);
        poligono.setYpoints(380, 341, 356);
        poligonos.add(poligono);

        poligono = new Poligono(); // 17
        poligono.setColor(AzulC);
        poligono.setXpoints(251, 327, 323, 306);
        poligono.setYpoints(379, 348, 397, 404);
        poligonos.add(poligono);

        poligono = new Poligono(); // 18
        poligono.setColor(AzulD);
        poligono.setXpoints(323, 327, 402, 413);
        poligono.setYpoints(397, 348, 378, 435);
        poligonos.add(poligono);

        poligono = new Poligono(); // 19
        poligono.setColor(AzulC);
        poligono.setXpoints(402, 413, 479, 419);
        poligono.setYpoints(378, 435, 402, 371);
        poligonos.add(poligono);

        poligono = new Poligono(); // 20
        poligono.setColor(AzulD);
        poligono.setXpoints(413, 528, 529);
        poligono.setYpoints(435, 482, 373);
        poligonos.add(poligono);

        poligono = new Poligono(); // 21
        poligono.setColor(AzulC);
        poligono.setXpoints(528, 529, 568, 629);
        poligono.setYpoints(482, 373, 433, 438);
        poligonos.add(poligono);

        poligono = new Poligono(); // 22
        poligono.setColor(AzulD);
        poligono.setXpoints(529, 568, 697);
        poligono.setYpoints(373, 440, 439);
        poligonos.add(poligono);

        poligono = new Poligono(); // 23
        poligono.setColor(AzulD);
        poligono.setXpoints(557, 629, 697);
        poligono.setYpoints(468, 438, 468);
        poligonos.add(poligono);

        poligono = new Poligono(); // 24
        poligono.setColor(AzulD);
        poligono.setXpoints(697, 697, 820, 736);
        poligono.setYpoints(468, 439, 392, 458);
        poligonos.add(poligono);

        poligono = new Poligono(); // 27
        poligono.setColor(AzulC);
        poligono.setXpoints(697, 697, 629);
        poligono.setYpoints(468, 439, 438);
        poligonos.add(poligono);

        poligono = new Poligono(); // 25
        poligono.setColor(AzulC);
        poligono.setXpoints(736, 820, 816);
        poligono.setYpoints(458, 392, 482);
        poligonos.add(poligono);

        poligono = new Poligono(); // 28
        poligono.setColor(AzulD);
        poligono.setXpoints(816, 835, 872, 820);
        poligono.setYpoints(457, 450, 465, 392);
        poligonos.add(poligono);

        poligono = new Poligono(); // 29
        poligono.setColor(AzulC);
        poligono.setXpoints(820, 872, 927, 873, 848);
        poligono.setYpoints(392, 465, 403, 385, 395);
        poligonos.add(poligono);

        poligono = new Poligono(); // 30
        poligono.setColor(AzulD);
        poligono.setXpoints(927, 953, 983, 964, 872);
        poligono.setYpoints(403, 390, 409, 423, 465);
        poligonos.add(poligono);

        poligono = new Poligono(); // 31
        poligono.setColor(AzulC);
        poligono.setXpoints(964, 983, 1076, 998);
        poligono.setYpoints(423, 409, 370, 435);
        poligonos.add(poligono);

        poligono = new Poligono(); // 32
        poligono.setColor(AzulD);
        poligono.setXpoints(998, 1076, 1121);
        poligono.setYpoints(435, 370, 384);
        poligonos.add(poligono);

        poligono = new Poligono(); // 33
        poligono.setColor(AzulC);
        poligono.setXpoints(1110, 1179, 1187);
        poligono.setYpoints(380, 408, 349);
        poligonos.add(poligono);

        poligono = new Poligono(); // 34
        poligono.setColor(AzulD);
        poligono.setXpoints(1187, 1179, 1230);
        poligono.setYpoints(349, 408, 385);
        poligonos.add(poligono);

        poligono = new Poligono(); // 35
        poligono.setColor(AzulC);
        poligono.setXpoints(1230, 1187, 1280, 1280, 1262);
        poligono.setYpoints(385, 349, 349, 388, 393);
        poligonos.add(poligono);

        poligono = new Poligono(); // 36
        poligono.setColor(AzulD);
        poligono.setXpoints(1187, 1280, 1280);
        poligono.setYpoints(349, 311, 349);
        poligonos.add(poligono);

        // Pintar poligonos generados
        for (int i = 0; i < poligonos.size(); poligonos.get(i).drawPolygon(g), i++);

        // Dibujar Pinos
        Patrones.drawPineTree(graphics, AzulC, -15, 571, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 43, 574, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 85, 573, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 146, 575, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 205, 597, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 250, 607, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 299, 616, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 338, 649, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 373, 653, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 408, 682, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 703, 669, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 727, 669, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 758, 669, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 773, 669, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 813, 665, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 1207, 564, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 1217, 564, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 1040, 590, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 1060, 585, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 1090, 580, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 1176, 570, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 1011, 605, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 978, 611, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 1163, 581, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 899, 639, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 920, 630, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 886, 640, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 964, 620, 60, 40, 4);
        Patrones.drawPineTree(graphics, AzulC, 976, 617, 60, 40, 4);

        Patrones.drawPineTree(graphics, Pino, 27, 576, 60, 40, 4);
        Patrones.drawPineTree(graphics, Pino, 413, 659, 60, 40, 4);
        Patrones.drawPineTree(graphics, Pino, 129, 573, 60, 40, 4);
        Patrones.drawPineTree(graphics, Pino, 179, 586, 60, 40, 4);
        Patrones.drawPineTree(graphics, Pino, 215, 594, 60, 40, 4);
        Patrones.drawPineTree(graphics, Pino, 850, 635, 60, 40, 4);
        Patrones.drawPineTree(graphics, Pino, 923, 615, 60, 40, 4);
        Patrones.drawPineTree(graphics, Pino, 1019, 595, 60, 40, 4);
        Patrones.drawPineTree(graphics, Pino, 1113, 585, 60, 40, 4);
        Patrones.drawPineTree(graphics, Pino, 1199, 580, 60, 40, 4);
        Patrones.drawPineTree(graphics, Pino, 1137, 575, 60, 40, 4);

        // Área 3
        poligonos.clear();

        poligono = new Poligono(); // 153
        poligono.setColor(Pino);
        poligono.setXpoints(1280, 1278, 1052);
        poligono.setYpoints(538, 725, 590);
        poligonos.add(poligono);

        poligono = new Poligono(); // 154
        poligono.setColor(VerdeC);
        poligono.setXpoints(1052, 1283, 876);
        poligono.setYpoints(590, 725, 725);
        poligonos.add(poligono);

        poligono = new Poligono(); // 155
        poligono.setColor(Pino);
        poligono.setXpoints(1055, 876, 675, 800);
        poligono.setYpoints(590, 730, 597, 646);
        poligonos.add(poligono);

        poligono = new Poligono(); // 156
        poligono.setColor(VerdeC);
        poligono.setXpoints(679, 876, 526);
        poligono.setYpoints(597, 725, 725);
        poligonos.add(poligono);

        poligono = new Poligono(); // 157
        poligono.setColor(Pino);
        poligono.setXpoints(681, 526, 338, 436, 498);
        poligono.setYpoints(597, 730, 725, 649, 624);
        poligonos.add(poligono);

        poligono = new Poligono(); // 158
        poligono.setColor(VerdeC);
        poligono.setXpoints(342, 436, 384, 198);
        poligono.setYpoints(730, 649, 621, 576);
        poligonos.add(poligono);

        poligono = new Poligono(); // 159
        poligono.setColor(Pino);
        poligono.setXpoints(199, 342, 133);
        poligono.setYpoints(576, 725, 725);
        poligonos.add(poligono);

        poligono = new Poligono(); // 160
        poligono.setColor(VerdeC);
        poligono.setXpoints(133, 199, 156, 59, 0);
        poligono.setYpoints(730, 578, 564, 572, 540);
        poligonos.add(poligono);

        poligono = new Poligono(); // 161
        poligono.setColor(Pino);
        poligono.setXpoints(133, 0, 0);
        poligono.setYpoints(725, 725, 540);
        poligonos.add(poligono);

        // Reflejos del sol
        poligono = new Poligono(); // R1
        poligono.setColor(Reflejo);
        poligono.setXpoints(1101, 1103, 1171, 1236, 1233, 1171);
        poligono.setYpoints(24, 97, 134, 97, 24, -10);
        poligonos.add(poligono);

        poligono = new Poligono(); // R2
        poligono.setColor(Reflejo);
        poligono.setXpoints(990, 994, 1022, 1053, 1051, 1022);
        poligono.setYpoints(151, 184, 199, 184, 151, 136);
        poligonos.add(poligono);

        poligono = new Poligono(); // R3
        poligono.setColor(Reflejo);
        poligono.setXpoints(910, 909, 925, 941, 941, 926);
        poligono.setYpoints(217, 233, 240, 233, 218, 209);
        poligonos.add(poligono);

        poligono = new Poligono(); // R3
        poligono.setColor(Reflejo);
        poligono.setXpoints(921, 922, 943, 965, 962, 942);
        poligono.setYpoints(202, 227, 239, 227, 206, 191);
        poligonos.add(poligono);

        poligono = new Poligono(); // R4
        poligono.setColor(Reflejo);
        poligono.setXpoints(716, 715, 731, 748, 747, 730);
        poligono.setYpoints(318, 334, 342, 335, 318, 310);
        poligonos.add(poligono);

        poligono = new Poligono(); // R5
        poligono.setColor(Reflejo);
        poligono.setXpoints(715, 735, 736, 716, 695, 693);
        poligono.setYpoints(310, 323, 349, 359, 346, 322);
        poligonos.add(poligono);

        poligono = new Poligono(); // R6
        poligono.setColor(Reflejo);
        poligono.setXpoints(615, 645, 677, 679, 647, 616);
        poligono.setYpoints(356, 340, 358, 390, 405, 388);
        poligonos.add(poligono);

        poligono = new Poligono(); // R5
        poligono.setColor(Reflejo);
        poligono.setXpoints(449, 446, 511, 579, 581, 516);
        poligono.setYpoints(471, 399, 366, 404, 475, 508);
        poligonos.add(poligono);

        // Barquito
        poligono = new Poligono(); // Barquito
        poligono.setColor(Barquito);
        poligono.setXpoints(615, 620, 645, 650);
        poligono.setYpoints(530, 535, 535, 530);
        poligonos.add(poligono);
        
        // Persona
        poligono = new Poligono(); // Camisa
        poligono.setColor(CamisaPersona);
        poligono.setXpoints(639, 644, 644, 639);
        poligono.setYpoints(530, 530, 520, 520);
        poligonos.add(poligono);
        
        circulo = new Circulo(8, 8); // Cabeza
        circulo.setColor(CabezaPersona);
        circulo.setXpoints(638);
        circulo.setYpoints(512);
        circulo.drawCircle(g);
        
        poligono = new Poligono(); // Pelo
        poligono.setColor(Color.BLACK);
        poligono.setXpoints(638, 645, 645, 638);
        poligono.setYpoints(514, 514, 512, 512);
        poligonos.add(poligono);
        
        
        

        // Pintar últimos polígonos
        for (int i = 0; i < poligonos.size(); poligonos.get(i).drawPolygon(g), i++);
    }

}
