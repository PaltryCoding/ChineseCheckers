import javax.swing.*;
import java.awt.*;

public class Pawn extends JButton {

    private Color circleColor = Color.BLUE;
    int t;
    int x;
    int y;

    public Pawn(int t, int x, int y) {
        super("test");
        this.sett(t);
        this.sety(y);
        this.setx(x);
        this.setOpaque(false);
    }

    @Override
    protected  void paintComponent(Graphics g) {

        g.setColor(circleColor);
        g.fillOval(0,0,50,50);

    }

    public int gett() { return t; }

    public int getx() { return x; }

    public int gety() { return y; }

    public void sett(int team) { this.t = team; }

    public void setx(int x) { this.x = x; }

    public void sety(int y) { this.y = y; }


}
