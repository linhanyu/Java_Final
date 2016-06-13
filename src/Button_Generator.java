import javax.swing.*;

/**
 * Created by Henry on 16/6/13.
 */
public class Button_Generator {
    public  JButton Produce_Button(Monitor m,String Name){
        JButton jb = new JButton();
        jb.setText(Name);
        jb.addActionListener(m);
        return jb;
    }
}
