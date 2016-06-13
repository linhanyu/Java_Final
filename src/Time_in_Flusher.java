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
        volatile in_out_Style ios = new type();

    Time_in_Flusher(JLabel c){
        this.c = c;
    }

    public void setIos(in_out_Style ios) {
        this.ios = ios;
    }


//    public void n(){
//        notifyAll();
//    }
    public void run(){
        try {

            for (int j=0;j<7;j%=7){
                ios.in(c,colors[j]);
                ios.out(c,colors[j]);
                j++;
                Thread.yield();
            }

        }catch (Throwable e){}
    }
}

abstract class in_out_Style{

    public abstract void in(JLabel c,Color color) throws Throwable;
    public abstract void out(JLabel c,Color color) throws Throwable;

}


class violate extends in_out_Style{

    public void in(JLabel c,Color color)throws Throwable{
            c.setForeground(new Color(color.getRed(), color.getGreen(), color.getBlue(), 255));
            TimeUnit.MILLISECONDS.sleep(5);
    }

    public void out(JLabel c,Color color) throws Throwable{
    }
}

class Guradully extends in_out_Style{

    public void in(JLabel c,Color color)throws Throwable{
        for (int i = 0; i <= 255; i++) {
            c.setForeground(new Color(color.getRed(), color.getGreen(), color.getBlue(), i));
            TimeUnit.MILLISECONDS.sleep(5);

        }
    }

    public void out(JLabel c,Color color) throws Throwable{
        for (int i = 255; i >= 0; i--) {
            c.setForeground(new Color(color.getRed(), color.getGreen(), color.getBlue(), i));
            TimeUnit.MILLISECONDS.sleep(5);
        }
    }
}

class type extends in_out_Style{

    @Override
    public void in(JLabel c, Color color) throws Throwable {
        c.setForeground(color);
        StringBuffer sb = new StringBuffer();
        char[] str = c.getText().toCharArray();

        for (int i=0;i<str.length;i++){
            sb.append(str[i]);
            TimeUnit.MILLISECONDS.sleep(300);
            c.setText(sb.toString());
        }

    }

    @Override
    public void out(JLabel c, Color color) throws Throwable {

    }
}