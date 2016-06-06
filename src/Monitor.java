import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Henry on 16/6/6.
 */
public abstract class Monitor implements ActionListener {
    JLabel tar;
    Time_in_Flusher flusher;
    Monitor(JLabel j,Time_in_Flusher f){
        tar = j;
        flusher = f;
    }


}

class Violate_Monitor extends Monitor{
    Violate_Monitor(JLabel j,Time_in_Flusher f){
        super(j,f);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        flusher.setIos(new violate());

    }
}

class Gradually_Monitor extends Monitor{
    Gradually_Monitor(JLabel j,Time_in_Flusher f){
        super(j,f);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        flusher.setIos(new Guradully());

    }


}