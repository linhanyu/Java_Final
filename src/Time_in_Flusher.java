import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Henry on 16/6/4.
 */
public class Time_in_Flusher extends Thread{
        JLabel c;
        int Red,Green,Blue;
        Color colors[] = {
                Color.BLUE,
                Color.CYAN,
                Color.ORANGE,
                Color.yellow,
                Color.green,
                Color.red,
                Color.pink,
        };
    Time_in_Flusher(JLabel c){
        this.c = c;


    }

    public void setcolor(Color color){
        Red = color.getRed();
        Green = color.getGreen();
        Blue = color.getBlue();
    }

//    public void n(){
//        notifyAll();
//    }
    public void run(){
        try {

            for (int j=0;j<7;j%=7){
                for (int i = 0; i <= 255; i++) {
                    c.setForeground(new Color(colors[j].getRed(), colors[j].getGreen(), colors[j].getBlue(), i));
                    TimeUnit.MILLISECONDS.sleep(5);
                    Thread.yield();
                }

                for (int i = 255; i >= 0; i--) {
                    c.setForeground(new Color(colors[j].getRed(), colors[j].getGreen(), colors[j].getBlue(), i));
                    TimeUnit.MILLISECONDS.sleep(5);
                    Thread.yield();
                }
                j++;
            }

        }catch (Throwable e){}
    }
}

