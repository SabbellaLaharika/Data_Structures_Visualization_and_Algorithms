package codes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Scrollbar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CommonCodes extends JFrame {
    static int i = 0;
    static JLabel label,algorithmLabel;
    static ImageIcon imageLabel,algorithmImageLabel;
    static TimerTask task = new TimerTask() {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'run'");
        }
        
    };
    static Timer timer;
    public CommonCodes(String title)
    {
        setTitle(title);
        setSize(1000,800);
        setIconImage(new ImageIcon("Images/Logo1.png").getImage());
        getContentPane().setBackground(Color.white);
        setLayout(null);  
        getContentPane().add(new Scrollbar(Scrollbar.VERTICAL));
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static JButton buttonLayout(String text,int x,int y,int width,int height,Color bg,Color fg,String name,int style,int size)
    {
        JButton button = new JButton(text);
        button.setBounds(x,y,width,height); 
        button.setBackground(bg);
        button.setForeground(fg);
        button.setFont(new Font(name,style,size));
        return button;
    }
    public static JButton backButtonLayout()
    {
        JButton backButton = new JButton(new ImageIcon("back1.jpg"));
        backButton.setBounds(30,30,50,50); 
        return backButton;
    }
    public static JLabel imageSlider(String[] path,int x,int y,int w,int h)
    {
        imageLabel = new ImageIcon(path[0]);
        label = new JLabel();
        
        timer = new Timer();
        task = new TimerTask() {
            
            public void run()
            {
                imageLabel = new ImageIcon(path[i]);
                i += 1;
                if(i >= path.length)
                {
                    i = 0;
                }
                label.setIcon(imageLabel);
            }
        };
        label.setBounds(x,y,w,h);
        timer.scheduleAtFixedRate(task,0,1500); 
        return label;
    }
    public static void cancelTask()
    {
        task.cancel();
        //timer.scheduleAtFixedRate(task, 10, 1500);
    }
    public static JLabel algorithmSetter(String path,int x,int y,int w,int h)
    {
        algorithmImageLabel = new ImageIcon(path);
        algorithmLabel = new JLabel();
        algorithmLabel.setIcon(algorithmImageLabel);
        algorithmLabel.setBounds(x,y,w,h);
        return algorithmLabel;
    }
    public static JLabel headingLabelSetter(String heading,int x, int y, int w,int h)
    {
        JLabel headingLabel = new JLabel(heading);
        headingLabel.setFont(new Font(Font.SERIF, Font.BOLD, 35));
        headingLabel.setBounds(x, y, w, h);
        return headingLabel;
    }
}
