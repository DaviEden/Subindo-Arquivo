package identificador;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Identificador extends JFrame{
    int escolha = 0;
    JLabel cordX = new JLabel("X:");
    JLabel cordY = new JLabel("Y:");
    
    JLabel x = new JLabel("2");
    JLabel y = new JLabel("1");
    
    Font fonte = new Font("Arial",Font.BOLD,15);
    public Identificador(){
        Tela();
        new Movimento().start();
        System.out.println("X: "+x.getText()+"\n Y: "+y.getText());
    }
    public void Tela(){
        
        setTitle("Idenficar Tecla");
        setSize(720,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        
      
        cordX.setBounds(620, 330, 20, 20);
        cordY.setBounds(660 ,330 , 20, 20);
        x.setBounds(635, 330, 25, 20);
        y.setBounds(675, 330, 25, 20);
        add(cordX);
        add(cordY);
        add(x);
        add(y);
    }
    public class Movimento extends Thread{
        public void run(){
            while(true){
                try{sleep(10);}catch(Exception erro){}
                Point ponto = getMousePosition();
                x.setText(""+ponto.x);
                y.setText(""+ponto.y);
            }
        }
        
    }
    
    public static void main(String[] args) {
        Identificador span = new Identificador();
        /*span.escolha = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer?\n 1-Clicks, 2-Coordenadas, 3-Teclas"));
        System.out.println(span.escolha);*/
        
        
    }
    
}
