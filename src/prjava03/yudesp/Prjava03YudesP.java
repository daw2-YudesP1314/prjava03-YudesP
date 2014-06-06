

package prjava03.yudesp;
import java.awt.*;
import java.awt.event.*;

public class Prjava03YudesP extends Frame
implements ActionListener, WindowListener {
    private TextField tfCount;
    private int count = 0;
    
    public Prjava03YudesP () {
        setLayout(new FlowLayout());
        add(new Label("Counter"));
        tfCount = new TextField("0", 10);
        tfCount.setEditable(false);
        add(tfCount);
        Button btnCount = new Button("Count");
        add(btnCount);
        btnCount.addActionListener(this);
        addWindowListener(this);
        setTitle("prjava03");
        setSize(250, 100);
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new Prjava03YudesP();
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        ++count;
        tfCount.setText(count + "");
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    
    @Override
    public void windowOpened(WindowEvent e) {}
    
    @Override
    public void windowClosed(WindowEvent e) {}
    
    @Override
    public void windowIconified(WindowEvent e) {}
    
    @Override
    public void windowDeiconified(WindowEvent e) {}
    
    @Override
    public void windowActivated(WindowEvent e) {}
    
    @Override
    public void windowDeactivated(WindowEvent e) {}
}