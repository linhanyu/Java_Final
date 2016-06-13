import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;

/**
 * Created by Henry on 16/6/1.
 */
public class Text {


    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setLayout(new GridLayout());
        jf.setSize(1000,500);

        JPanel jp = new JPanel(new FlowLayout());

        JLabel text= new JLabel();
        text.setFont(new Font("微软雅黑",Font.BOLD,72));
//        text.setPreferredSize(new Dimension(100,100));
        text.setText("想要女朋友");

        Time_in_Flusher t = new Time_in_Flusher(text);

        Button_Generator bg = new Button_Generator();
        jp.add(bg.Produce_Button(new Violate_Monitor(text,t),"闪烁效果"));
        jp.add(bg.Produce_Button(new Gradually_Monitor(text,t),"渐变效果"));
        jp.add(bg.Produce_Button(new Type_Monitor(text,t),"打字效果"));


        jf.add(jp,BorderLayout.SOUTH);
        jf.add(text,BorderLayout.CENTER);
//        jf.setBackground(Color.BLACK);

        jf.setVisible(true);

        t.start();

    }


}

