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
    Component tar;
    Time_in_Flusher flusher;
    Monitor(Component j,Time_in_Flusher f){
        tar = j;
        flusher = f;
    }


}

class Violate_Monitor extends Monitor{
    Violate_Monitor(Component j,Time_in_Flusher f){
        super(j,f);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        flusher.setIos(new violate());

    }
}

class Gradually_Monitor extends Monitor{
    Gradually_Monitor(Component j,Time_in_Flusher f){
        super(j,f);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        flusher.setIos(new Guradully());

    }


}

class Type_Monitor extends Monitor{
    Type_Monitor(Component j,Time_in_Flusher f){
        super(j,f);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        flusher.setIos(new type());

    }


}

class Bigger_height_Monitor extends Monitor{
    Bigger_height_Monitor(Component j,Time_in_Flusher f){
        super(j,f);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        flusher.setIos(new Bigger_width());

    }

}