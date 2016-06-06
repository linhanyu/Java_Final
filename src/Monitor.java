import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Henry on 16/6/6.
 */
public abstract class Monitor implements MouseListener {
    JLabel tar;
    Time_in_Flusher flusher;
    Monitor(JLabel j,Time_in_Flusher f){
        tar = j;
        flusher = f;
    }

    protected  abstract Color r_color();

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        flusher.notify();
//        System.out.println("FUCK");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

class Blue_Monitor extends Monitor{
    Blue_Monitor(JLabel j,Time_in_Flusher f){
        super(j,f);
    }
    @Override
    protected Color r_color() {
        return Color.BLUE;
    }


}