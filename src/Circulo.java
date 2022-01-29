import javax.swing.*;
import java.awt.*;

public class Circulo extends JPanel {

    private int altura;
    private int largura;
    private int margemX;
    private int margemY;
    private Color cor;
    private Graphics g;

    public Circulo(int margemX, int margemY, int altura, int largura) throws HeadlessException {
        this.altura = altura;
        this.largura = largura;
        this.margemX = margemX;
        this.margemY = margemY;
        this.cor = Color.BLACK;

    }

    public void paintComponents(Graphics g, Color cor) {
        super.paintComponents(g);
        this.g = g;
        g.setColor(cor);
        g.fillOval(this.margemX, this.margemY, this.altura, this.largura);


    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getMargemX() {
        return margemX;
    }

    public void setMargemX(int margemX) {
        this.margemX = margemX;
    }

    public int getMargemY() {
        return margemY;
    }

    public void setMargemY(int margemY) {
        this.margemY = margemY;
    }
}